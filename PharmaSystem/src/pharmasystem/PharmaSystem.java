package pharmasystem;
import java.util.*;
public class PharmaSystem {
public static Scanner in=new Scanner(System.in);
public static Scanner sc=new Scanner(System.in);
public static boolean status=true;
public static String name,age,gender,address,contact,pass,drugCode,drugName,User,Pass,password,id,user,Remove,costumerName;
public static int Attempt=3,choose,quantity,stock;
public static char option;
public static double drugPrice,pay,amount,change;
private final List<Medicine>medicineList=new ArrayList<>();
private final List<Employee>employeeList=new ArrayList<>();
private final List<Transac>transacList=new ArrayList<>();
private void addEmployee(Employee employee){
employeeList.add(employee);
}
private void addMedicine(Medicine medicine){
medicineList.add(medicine);
}
private void addTransac(Transac transac){
transacList.add(transac);
}
private void HomePage(){
    
         while(status){
        System.out.print("\n==========================\nPharmacy Management System\n=========================\n");
        System.out.println("\n1.Admin \n2.Employeee \nEnter here:");
        option=in.next().charAt(0);
        switch(option){
            case '1':
                Admin();
                break;
            case '2':
                Employee();
                break;
            default:
                System.out.println("Invalid input");
                status=true;
                break;
        }
        
        
    }
}
private void Admin(){
    
System.out.println("\n======================\nAdmin Login\n=========================\n");

while(Attempt<4){
System.out.println("Enter Admin Username");
User=in.next();
System.out.println("Enter Admin password");
password=in.next();
if(Attempt!=0){
if(User.equals("admin")&& password.equals("1234")){
AdminDashBoard();       
break;
}else{
System.out.println("Wrong Username and Password");
System.out.println("Attempt"+Attempt);
Attempt--;
  }
}else{
System.out.println("Attempt reach");
System.exit(0);
        
   }
}
}
private void Employee(){
    System.out.println("\n======================\nEmployee login\n=========================\n");

while(Attempt<4){
System.out.println("Enter Admin ID");
user=in.next();
System.out.println("Enter Employee password");
Pass=in.next();
if(Attempt!=0){
if(user.equals(id) && Pass.equals(pass)){
EmployeeDashBoard();       
break;
}else{
System.out.println("Wrong Username and Password");
System.out.println("Attempt"+Attempt);
Attempt--;
  }
}else{
System.out.println("Attempt reach");
System.exit(0);
        
   }
}
}
private Employee  inputEmployee(){
  
System.out.println("\n======================\nInput Employee\n=========================\n");

System.out.print("Enter your ID:");
id=sc.next();
System.out.print("Enter your name:");
name=sc.next();
System.out.print("Enter your age:");
age=in.next();
System.out.print("Enter your gender:");
gender=in.next();
System.out.print("Enter your address:");
address=in.next();
System.out.print("Enter your contact:");
contact=in.next();
System.out.print("Enter Employee password:");
pass=in.next();
Employee employee=new Employee(id,name,age,gender,address,contact,pass);
return employee;
}
private void ShowEmployeeDetails(){
  
        
      System.out.println("\n|=======================================================================================================================================================================|\n"
                                                                                          + "\t\t\t\t\t\t\t\t\tEmployee Details\t\t\t ");                               
               for(Employee employee:employeeList){
      System.out.println("\n========================================================================================================================================================================\n"
                                                                                                                                                     
                                      + "\t\t\tID:"+employee.getId()
                                      + "\t\t\tName:"+employee.getName()
                                      + "\t\t\tAge:"+employee.getAge()
                                      + "\t\t\tGender:"+employee.getGender()
                                      + "\t\t\tAddress:"+employee.getAddress()
                                      + "\t\t\tContact:"+employee.getContact());
                                    
    }
}
private void SearchDeatils(){
    System.out.println("Enter Employee Name");
    name=sc.next();
    for(Employee employee:employeeList){
        if(employee.getName().equals(name)){
              System.out.println("\n===========================================================\nEmployee Details\n=================================================\n"
                                      + "\nID:"+employee.getId()
                                      + "\nName:"+employee.getName()
                                      + "\nAge:"+employee.getAge()
                                      + "\nGender:"+employee.getGender()
                                      + "\nAddress:"+employee.getAddress()
                                      + "\nContact:"+employee.getContact()
                                     );
        }
    }
}
private void RemoveDeatils(String id){
 
System.out.print("Enter your ID:");
id=sc.next();
ListIterator<Employee>employee=employeeList.listIterator();
while(employee.hasNext()){
    Employee lex=employee.next();
    if(lex.getId().equals(id)){
        employee.remove();
        status=true;
    }
}
    
}
private void updateDeatils(){
    
    System.out.print("\nDo you want to edit employees Details? \nPress Y/y to Yes then N/n for No \nEnter here:");
    choose=in.next().charAt(0);
    if(choose==('Y') && choose==('y')){
    System.out.print("Enter your ID:");
    id=sc.next();
    for(Employee employee:employeeList){
    if(employee.getId().equals(id)){
    System.out.print("Enter your name:");
    name=sc.next();
    employee.setName(name);
    System.out.print("Enter your age:");
    age=in.next();
    employee.setAge(age);
    System.out.print("Enter your gender:");
    gender=in.next();
    employee.setGender(gender);
    System.out.print("Enter your address:");
    address=in.next();
    employee.setAddress(address);
    System.out.print("Enter your contact:");
    contact=in.next();
     employee.setContact(contact);
    }else{
       System.out.println("details not found");
      }
    }
    }else{
     System.out.println("Back to dashboard");
        }  
  }
private Medicine inputMedicine(){

System.out.print("Enter drug code: ");
drugCode = in.next();
System.out.print("\nEnter drug name: ");
drugName=in.next();
System.out.print("\nEnter price: ");
drugPrice=in.nextInt();
System.out.print("\nEnter Quanrtity Stock: ");
stock=in.nextInt();

Medicine medicine=new Medicine(drugCode,drugName,drugPrice,stock);
return medicine;

}
private void ShowMedicine(){
      System.out.println("\n|=======================================================================================================================================================================|\n"
                                                                                          + "\t\t\t\t\t\t\t\t\tList of Medicine Stocks\t\t\t ");                               
    for(Medicine medicine:medicineList){
      System.out.println("\n========================================================================================================================================================================\n"
                                                                                                                                                     
                                      + "\t\t\tDrug Code::"+medicine.getDrugCode()
                                      + "\t\t\tDrug Name:"+medicine.getDrugName()
                                      + "\t\t\tPrice:"+medicine.getDrugPrice()
                                      + "\t\t\tQuantity Stock:"+medicine.getStock()
                                      );   
    }
}
private void removeStock(String drugCode){
   
System.out.print("Enter drug code: ");
drugCode = in.next();
ListIterator<Medicine>medicine= medicineList.listIterator();
while(medicine.hasNext()){
    Medicine e=medicine.next();
    if(e.getDrugCode().equals(drugCode)){
        medicine.remove();
        status=true;
    }
}
    
}
private void searchMedicine(){
System.out.print("\nEnter drug name: ");
drugName=in.next();
for(Medicine medicine:medicineList){
 if(medicine.getDrugName().equals(drugName)){
System.out.println("\n============================================================\n"
                                                                                                                                                     
                                      + "\nDrug Code::"+medicine.getDrugCode()
                                      + "\nDrug Name:"+medicine.getDrugName()
                                      + "\nPrice:"+medicine.getDrugPrice()
                                      + "\nQuantity Stock:"+medicine.getStock()
                                      );   
    }
  }
}
private void updateMedicine(){
    
      System.out.print("\nDo you want to edit employees Details? \nPress Y/y to Yes then N/n for No \nEnter here:");
    choose=in.next().charAt(0);
    if(choose==('Y') && choose==('y')){
    System.out.print("Enter your ID:");
    id=sc.next();
    for(Medicine medicine:medicineList){
    if(medicine.getDrugCode().equals(drugCode)){
        
        System.out.println("Enter Drug Name");
        drugName=in.next();
        medicine.setDrugName(drugName);
        System.out.println("Enter drug Price");
        drugPrice=in.nextDouble();
        medicine.setDrugPrice(drugPrice);
        System.out.println("");
        stock=in.nextInt();
        medicine.setStock(stock);
        
    } else{
    System.out.println("details not found");
    }
    }
    }else{
     System.out.println("Back to dashboard");
    }  
  }
private void Menu(){
      System.out.println("\n|=======================================================================================================================================================================|\n"
                                                                                          + "\t\t\t\t\t\t\t\t\tMenu\t\t\t ");                               
      for(Medicine medicine:medicineList){
      System.out.println("\n========================================================================================================================================================================\n"
                                                                                                                                                     
                                      + "\t\t\tDrug Code::"+medicine.getDrugCode()
                                      + "\t\t\tDrug Name:"+medicine.getDrugName()
                                      + "\t\t\tPrice:"+medicine.getDrugPrice()
                                      + "\t\t\tQuantity Stock:"+medicine.getStock()
                                      ); 
    }
}
private  Transac Bill(){
    System.out.println("\n|=======================================================================================================================================================================|\n"
                                                                                          + "\t\t\t\t\t\t\t\t\tMenu\t\t\t ");                               
    for(Medicine medicine:medicineList){
      System.out.println("\n========================================================================================================================================================================\n"
                                                                                                                                                     
                                      + "\t\t\tDrug Code::"+medicine.getDrugCode()
                                      + "\t\t\tDrug Name:"+medicine.getDrugName()
                                      + "\t\t\tPrice:"+medicine.getDrugPrice()
                                      + "\t\t\tQuantity Stock:"+medicine.getStock()
                                      ); 
    }
   System.out.print("Enter drug code: ");
   drugCode = in.next();
   for(Medicine medicine:medicineList){
   if(medicine.getDrugCode().equals(drugCode)){
       
   System.out.println("\nDrug Name:"+medicine.getDrugName()
                    +"\nPrice:"+medicine.getDrugPrice());
   System.out.println("Enter Costomer Name");
   costumerName=sc.next();
   System.out.println("Enter Quantity");
   quantity=in.nextInt();
   int x=medicine.getStock();
   int y= quantity-(medicine.getStock());
   medicine.setStock(y);
   amount=(medicine.getDrugPrice()*quantity);
   if(quantity<medicine.getStock()){
       System.out.println("Not enough Stock");
       status=true;
   }else{
       System.out.println("TOTAL Amount $:"+amount);
       System.out.println("Enter your payment");
       pay=in.nextDouble();
       if(pay<amount){
           System.out.println("Not enough Payment");
       }else{
           change=pay-amount;
           System.out.println("Total change $:"+change);
         }
       }
    } 
   }
 Transac transac=new Transac(pay,change,amount,quantity,costumerName);
    return transac;
}
   
private void Reciept(){
System.out.println("Enter Y/y to see Costumer reciept N for not"); 
choose=in.next().charAt(0);
if(choose==('Y')|| choose==('y')){
    for(Medicine medicine:medicineList){
    for(Transac transac : transacList){ 
    System.out.print("\n===============================================\n"
                   + "\nCosumer Reciept"
                   + "\nSelma Pharmacy"
                   + "\nLocation:Carmen CDOC");
 System.out.println("\n================================================\n"
                            + "\nCostumer Name:"+transac.getCostumerName()
                            + "\nDrug Name:"+medicine.getDrugName()
                            + "\nPrice:"+medicine.getDrugPrice()
                            + "\nMedicine Quantity:"+transac.getQuantity()
                            + "\nTotal Amount:$"+transac.getAmount()
                            + "\nCostumer Change:$"+transac.getChange());
    }
  }
 }
}
private void AdminDashBoard(){
do{
System.out.print("\n============================\nAdmin DashBoard\n============================\n"
                                           + "\n1.Add Employees"
                                           + "\n2.Show Employee Details"
                                           + "\n3.Search Employee"
                                           + "\n4.Remove Employee"
                                           + "\n5.Edit employee details"
                                           + "\n6.Add medicine"
                                           + "\n7.Show Stocks"
                                           + "\n8.Remove Medicine"
                                           + "\n9.Search Medicine"
                                           + "\n10.Edit medicine"
                                           + "\n11.log out"
                                           + "\nEnter here:");
choose=in.nextInt();
switch(choose){
case 1:
 addEmployee(inputEmployee());
 break;
 case 2:
ShowEmployeeDetails();
break;
case 3:
SearchDeatils();
break;
case 4:
RemoveDeatils(id);
 break;
 case 5:
 updateDeatils();
 break;
case 6:
addMedicine(inputMedicine());
 break;
case 7:
ShowMedicine();
 break;
case 8:
removeStock(drugCode);
break;
case 9:
searchMedicine();
 break;
case 10:
 updateMedicine();
break;
case 11:
HomePage();
 break;
default:
System.out.println("Invalid input");
break;
   }
    }while(choose!=9);
}
private void EmployeeDashBoard(){
do{
System.out.println("\n============================\nAdmin DashBoard\n============================\n"
                                           + "\n1.Menu"
                                           + "\n2.Bill"
                                           + "\n3.Reciept"
                                           + "\n4.Log out"
                                           + "\nEnter here:"
                                           + "");
choose=in.nextInt();
switch(choose){
case 1:
Menu();
break;
case 2:
addTransac( Bill());
 break;
case 3:
Reciept();
break;
case 4:
HomePage();
break;
default:
System.out.println("Invalid input");
 break;
            
  }
}while(choose!=4);
}
public static void main(String[] args) {
        PharmaSystem lex=new PharmaSystem();
        lex.HomePage();
    }
    
}
