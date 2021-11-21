/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Items;
import static java.lang.Integer.toString;
import java.util.ArrayList;

/**
 *
 * @author monishagali
 */
public class Order {
    private int orderId;
    private ArrayList<Items> itemsList;
    private static int counter=1;
    private int deliverymanId;
    private String deliverymanName;
    private String deliverymanUserName;
    private String feedback;
    private String restaurantName;
    private String status;
    private int customerId;
    private String customerName;
    private String  customerUserName;
    
    private String customerNotes;

    
    
    
    
    
    
      public Order() {
        orderId = counter;
        ++counter;
        itemsList=new ArrayList<Items>();
        status = "N/A";
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getDeliveryManId() {
        return deliverymanId;
    }

    public void setDeliveryManId(int deliveryManId) {
        this.deliverymanId = deliveryManId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNotes() {
        return customerNotes;
    }

    public void setCustomerNotes(String customerNotes) {
        this.customerNotes = customerNotes;
    }

    public String getDeliveryManUserName() {
        return deliverymanUserName;
    }

    public void setDeliveryManUserName(String deliveryManUserName) {
        this.deliverymanUserName = deliveryManUserName;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

      
      
    public ArrayList<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Order.counter = counter;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryManName() {
        return deliverymanName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliverymanName = deliveryManName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Items addItem(){
        Items item = new Items(); 
        itemsList.add(item);
        return item;
    } 
      
      public void deleteItem(Items item){
        itemsList.remove(item); 
    }
    @Override
    public String toString() {
        return Integer.toString(this.orderId);
    }
}
