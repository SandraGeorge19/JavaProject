
package pl.pro;

import java.io.Serializable;
import java.util.ArrayList;


public class Admin extends person_1 implements Serializable {
    public Admin(){
        
    }
     public boolean login(String userName, String Pass) {

        if(userName.equals("Admin@yahoo.com") && Pass.equals("12345678")){
            return true;
        }
        return false;

    }


    ArrayList <company_brand> company_name = new ArrayList<>();

    
    public void addNewEmployee(String name,String gender,String phone_no,String address,int id,String birth_of_date,String username,String password,String qualification,String date_of_joining ){
        employee x;
        x = new employee(name,gender,phone_no,address,id, birth_of_date ,username,password,qualification,date_of_joining);
        if(x.add_employee()){
            System.out.println("Added Successfully...!");
        }
        else{
            System.out.println("failed to insert ...!");
        }
    }
    public void listAllEmplwee(){
       
        employee x = new employee();
     
   System.out.println(x. show_all_employees());
    }

    public void searchForEmplwee(int id) {
     
   employee x = new employee();
       
 System.out.println(x.search_employee(id));
    }

    public void updateEmployee(int old_id, employee newEmployeeValues) {
 
       employee x = new employee();
    
    x.update(old_id, newEmployeeValues);
  
      System.out.println("Updated Successfully ... !");
    }

    
   public void deleteEmployee(int Id) {
       
   employee x = new employee();
      
   x.remove(Id);
     
   System.out.println("deleted Successfully ... !");
    }
   
   public void add_company_name(String name){
       company_brand z;
       z = new company_brand(name);
        if(z.add_company_name()){
            System.out.println("Added Successfully...!");
        }
        else{
            System.out.println("failed to insert ...!");
        }
    }
       
       
   }
   
   
