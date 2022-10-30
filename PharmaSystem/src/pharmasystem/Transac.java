package pharmasystem;
public class Transac {
     private double pay,change,amount;
     private int quantity;
     private String costumerName;
     public Transac(double pay,double change,double amount,int quantity,String costumerName){
        this.costumerName=costumerName;
        this.quantity=quantity;
        this.pay=pay;
        this.amount=amount;
        this.change=change;
     }
 public String getCostumerName(){
 return this.costumerName;
    }
 public void setCostumerName(String costumerName){
 this.costumerName=costumerName;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public double getPay(){
        return this.pay;
    }
    public void setPay(double pay){
        this.pay=pay;
    }
     public double getAmount(){
        return this.amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public double getChange(){
        return this.change;
    }
    public void setChange(double change){
        this.change=change;
    }
}
