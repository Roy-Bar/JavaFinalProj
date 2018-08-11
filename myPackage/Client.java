package myPackage;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Client {
    private int id;
    private int clientCode;
    private String fullName;
    private String phoneNumber;
    private ClientType type;
    private double discountRate;
    private Map <Integer, ShoppingCart> shoppingHistory;

    public  Client(){
        this.id = 0;
        this.clientCode = 0;
        this.fullName = null;
        this.phoneNumber = null;
        this.type = ClientType.NOTDEFINED;
        this.discountRate = 0;
        this.shoppingHistory = new LinkedHashMap<Integer, ShoppingCart>();
    }

    public Client(int in_id, String in_fullName, String in_phoneNumber) {
        this.id = in_id;
        this.fullName = in_fullName;
        this.phoneNumber = in_phoneNumber;
        this.type = ClientType.NOTDEFINED;
        this.discountRate = 0;
        this.shoppingHistory = new LinkedHashMap<Integer, ShoppingCart>();
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ClientType getType() {
        return type;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    //TBC
    public Map<Integer, ShoppingCart> getShoppingHistory() {
        return shoppingHistory;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void addNewCartToHistory(ShoppingCart newCart)
    {
        this.shoppingHistory.put(newCart.hashCode(),newCart);
    }

    @Override
    public String toString() {
        return "Client id:" + this.id + "Client full name:" + this.fullName + "Client phone number:" + this.phoneNumber;
    }
}


