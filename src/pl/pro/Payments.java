package pl.pro;

import java.util.ArrayList;

public class Payments {
    String employee_name;
    String customer_name;
    String company_brand;
    String customer_phone_no;
    int amount;
    int no_of_renting_days;
    float rent_per_day;
    float total_rent=no_of_renting_days*rent_per_day; 
    private static ArrayList<Payments> payment = new ArrayList<Payments>();


    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCompany_brand() {
        return company_brand;
    }

    public void setCompany_brand(String company_brand) {
        this.company_brand = company_brand;
    }

    public String getCustomer_phone_no() {
        return customer_phone_no;
    }

    public void setCustomer_phone_no(String customer_phone_no) {
        this.customer_phone_no = customer_phone_no;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getNo_of_renting_days() {
        return no_of_renting_days;
    }

    public void setNo_of_renting_days(int no_of_renting_days) {
        this.no_of_renting_days = no_of_renting_days;
    }

    public float getRent_per_day() {
        return rent_per_day;
    }

    public void setRent_per_day(float rent_per_day) {
        this.rent_per_day = rent_per_day;
    }

    public float getTotal_rent() {
        return total_rent;
    }

    public void setTotal_rent(float total_rent) {
        this.total_rent = total_rent;
    }
    private final String efileName="payments.bin";
    private void loadFromFile()
    {
        
            payment = (ArrayList<Payments>) fileManeger.read(efileName);
        
    }
    
    boolean commitToFile(){
        return fileManeger.write(efileName,payment);
        
    }
    
    public boolean add_payments(){
        loadFromFile();
        payment.add(this);
        return commitToFile();
    }
    public ArrayList<Payments> ShowTotalRent(){
        loadFromFile();
        return payment;
    }
    
    public String Show_Total_Reciept() {
       loadFromFile();
       String S = "\nAll Payments Data:\n";
        for (Payments x : payment) {
            S = S + x.toString();
        }
        return S;
    }
    public Payments()
    {
        
    }
    public Payments(String employee_name,String customer_name,String company_brand, String customer_phone_no,int amount,int no_of_renting_days,float rent_per_day,float total_rent)
    {
        this.employee_name=employee_name;
        this.customer_name=customer_name;
        this.company_brand=company_brand;
        this.customer_phone_no=customer_phone_no;
        this.amount=amount;
        this.no_of_renting_days=no_of_renting_days;
        this.rent_per_day=rent_per_day;
        this.total_rent=total_rent;
        
    }
 }

    

