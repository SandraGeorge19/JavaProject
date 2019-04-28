
package pl.pro;

import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        String password;
        String Username;
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter Username: ");
         Username=input1.next();
         
       Scanner input2=new Scanner(System.in);
       System.out.println("Enter Password: ");
       password=input2.next();
       
       if(Username.equals(Username)&&password.equals(password)){
           System.out.println("Access Granted! Welcome!");
           }
       else if(Username.equals(Username)){
           System.out.println("Invalid Password!");
       }
       else if(password.equals(password)){
           System.out.println("Invalid Username!");
       }
       else{
           System.out.println("Invalid Username & Password!");
       }
    }
    
}
