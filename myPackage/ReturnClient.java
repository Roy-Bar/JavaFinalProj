package myPackage;

public class ReturnClient extends Client {

    public ReturnClient(){
        super();
        this.setType(ClientType.RETURNCLIENT);
        this.setDiscountRate(10);
    }

    public ReturnClient(int in_id, String in_fullName, String in_phoneNumber){
        super(in_id, in_fullName, in_phoneNumber);
        this.setType(ClientType.RETURNCLIENT);
        this.setDiscountRate(10);
    }

    @Override
    public String toString() {
        return super.toString() + ", Client type:" + this.getType()
                + ", Discount Rate:" + this.getDiscountRate() + "%" + "Shoping History:" + this.getShoppingHistory();
    }
}
