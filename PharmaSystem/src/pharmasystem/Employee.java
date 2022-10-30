
package pharmasystem;


public class Employee {
private String id,name,age,gender,address,contact,pass;

public Employee(String  id,String name,String age,String gender,String address,String contact,String pass){
   this.id=id;
   this.name=name;
   this.age=age;
   this.gender=gender;
   this.address=address;
   this.contact=contact;
   this.pass=pass;
}
public String getId(){
        return this.id;
}
public void setId(String id){
    this.id=id;
}
public String getName(){
    return this.name;
}
public void setName(String name){
    this.name=name;
}
public String getAge(){
        return this.age;
}
public void setAge(String age){
    this.age=age;
}
public String getGender(){
    return this.gender;
}
public void setGender(String gender){
    this.gender=gender;
}
public String getAddress(){
    return this.address;
}
public void setAddress(String address){
    this.address=address;
}
public String getContact(){
    return this.contact;
}
public void setContact(String contact){
    this.contact=contact;
}
public String getPass(){
    return this.pass;
}
public void setPass(String pass){
    this.pass=pass;
}

}
