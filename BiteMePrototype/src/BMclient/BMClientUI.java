package BMclient;

import BMgui.ClientConnectionController;
import javafx.application.Application;
import javafx.stage.Stage;

public class BMClientUI extends Application {
    public static BMClientController client;

    public static void main(String args[]) throws Exception {
        System.out.println("Launching client side");
        launch(args);
    }

    /**
     * Runs the client-side connection screen
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        ClientConnectionController clientConnectionController = new ClientConnectionController();
        clientConnectionController.start(primaryStage);
    }

 
 
}

