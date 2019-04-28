
package pl.pro;
import java.util.Scanner;


/**
 *
 * @author GHOST
 */
public class JavaApplication11 {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Customer c = new Customer();
        System.out.println("enter customer name aand id");
        Scanner input=new Scanner (System.in);
        String name;
        name=input.next();
        int id;
        id=input.nextInt();
         c.setId(id);
         c.setName(name);
        
        
    }
    
}
