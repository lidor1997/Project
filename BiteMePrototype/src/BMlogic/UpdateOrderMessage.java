package BMlogic;

import java.io.Serializable;

import BMlogic.Message;

public class UpdateOrderMessage extends Message implements Serializable {
    private int orderNumber;
    private int totalPrice;
    private String orderAddress;

    public UpdateOrderMessage(int orderNumber, int totalPrice, String orderAddress) {
        super("Update Order", null); // Call the superclass constructor with appropriate values
        this.orderNumber = orderNumber;
        this.totalPrice = totalPrice;
        this.orderAddress = orderAddress;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getOrderAddress() {
        return orderAddress;
    }
}
