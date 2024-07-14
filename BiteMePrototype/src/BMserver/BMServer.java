package BMserver;

import src.ocsf.server.AbstractServer;
import src.ocsf.server.ConnectionToClient;
import BMlogic.Order;
import BMlogic.UpdateOrderMessage;
import java.io.IOException;
import java.util.List;

public class BMServer extends AbstractServer {
    final public static int DEFAULT_PORT = 5555;
    private DBConnector dbConnector;

    public BMServer(int port) {
        super(port);
        dbConnector = new DBConnector();
        dbConnector.connectToDB();
    }

    @Override
    protected void handleMessageFromClient(Object msg, ConnectionToClient client) {
        if (msg instanceof UpdateOrderMessage) {
            UpdateOrderMessage updateMsg = (UpdateOrderMessage) msg;
            boolean success = dbConnector.updateOrder(updateMsg.getOrderNumber(), updateMsg.getTotalPrice(), updateMsg.getOrderAddress());
            try {
                client.sendToClient(success ? "Update successful" : "Update failed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Message received: " + msg + " from " + client);
            this.sendToAllClients(msg);
        }
    }

    @Override
    protected void serverStarted() {
        System.out.println("Server listening for connections on port " + getPort());
    }

    @Override
    protected void serverStopped() {
        System.out.println("Server has stopped listening for connections.");
    }

    public static void main(String[] args) {
        int port = DEFAULT_PORT;

        try {
            port = Integer.parseInt(args[0]);
        } catch (Throwable t) {
            System.out.println("No port specified. Defaulting to " + DEFAULT_PORT);
        }

        BMServer server = new BMServer(port);

        try {
            server.listen();
            System.out.println("Server started on port " + port);
        } catch (IOException e) {
            System.out.println("Error: Could not listen on port " + port);
            e.printStackTrace();
        }
    }
}
