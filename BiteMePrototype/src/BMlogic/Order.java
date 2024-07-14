package BMlogic;

public class Order {
    private String restaurantName;
    private int orderNumber;
    private int totalPrice;
    private int orderList;
    private String orderAddress;

    // Getters and setters
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getOrderList() {
        return orderList;
    }

    public void setOrderList(int orderList) {
        this.orderList = orderList;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    @Override
    public String toString() {
        return "Order Details:"+" | " +
               "Restaurant: " + restaurantName +" | "+ 
               "Order Number: " + orderNumber +"| "+
               "Total Price: " + totalPrice + " |"+
               "Order List Number: " + orderList + " | "+ 
               "Order Address: " + orderAddress;
    }
}
