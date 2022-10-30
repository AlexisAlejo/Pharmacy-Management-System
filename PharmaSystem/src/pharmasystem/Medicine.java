
package pharmasystem;


public class Medicine {
private String drugCode,drugName;
private int stock;
private double drugPrice;
public Medicine(String drugCode,String drugName,double drugPrice,int stock){
    this.drugCode=drugCode;
    this.drugName=drugName;
    this.drugPrice=drugPrice;
    this.stock=stock;
}
public String getDrugCode(){
    return this.drugCode;
}
public void setDrugCode(String drugCode){
    this.drugCode=drugCode;
}
public String getDrugName(){
    return this.drugName;
}
public void setDrugName(String drugName){
    this.drugName=drugName;
}
public double getDrugPrice(){
    return this.drugPrice;
}
public void setDrugPrice(double drugPrice){
    this.drugPrice=drugPrice;
}
public int getStock(){
    return this.stock;
}
public void setStock(int stock){
    this.stock=stock;
}

}
