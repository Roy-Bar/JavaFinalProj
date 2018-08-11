package myPackage;

public class VipClient extends Client {

    public VipClient(){
        super();
        this.setType(ClientType.VIPCLIENT);
        this.setDiscountRate(30);
    }

    public VipClient(int in_id, String in_fullName, String in_phoneNumber){
        super(in_id, in_fullName, in_phoneNumber);
        this.setType(ClientType.VIPCLIENT);
        this.setDiscountRate(30);
    }

    @Override
    public String toString() {
        return super.toString() + ", Client type:" + this.getType()
                + ", Discount Rate:" + this.getDiscountRate() + "%" + "Shoping History:" + this.getShoppingHistory();
    }
}
