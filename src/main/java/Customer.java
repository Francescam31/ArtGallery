public class Customer {
    
    private String name;
    private double wallet;
    
    public Customer(String name){
        this.name = name;
        this.wallet = 3000;
    }
    
    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }
    
}
