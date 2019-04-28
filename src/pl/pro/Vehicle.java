
package pl.pro;

import java.io.Serializable;
import java.util.ArrayList;


public class Vehicle extends person_1 implements Serializable{
    private String company_brande;
    private String use_as;
    private String status;
    private String model;
    private int number;
    private int make_year;
    private int sitting_capacity;
    private int ingine_capacity;
    private String type;
    private String variant;
    private float rent_value;
    private final String vehicleFileName = "Vehicles.bin";
    private static ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
    
    public Vehicle(){
        
    }

    public String getCompany_brande() {
        return company_brande;
    }

    public void setCompany_brande(String company_brande) {
        this.company_brande = company_brande;
    }

    public String getUse_as() {
        return use_as;
    }

    public void setUse_as(String use_as) {
        this.use_as = use_as;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMake_year() {
        return make_year;
    }

    public void setMake_year(int make_year) {
        this.make_year = make_year;
    }

    public int getSitting_capacity() {
        return sitting_capacity;
    }

    public void setSitting_capacity(int sitting_capacity) {
        this.sitting_capacity = sitting_capacity;
    }

    public int getIngine_capacity() {
        return ingine_capacity;
    }

    public void setIngine_capacity(int ingine_capacity) {
        this.ingine_capacity = ingine_capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public float getRent_value() {
        return rent_value;
    }

    public void setRent_value(float rent_value) {
        this.rent_value = rent_value;
    }

   
    

    public Vehicle(String company_brande, String use_as, String status, String model, int number, int make_year, int sitting_capacity, int ingine_capacity, String type, String variant, float rent_value) {
        this.company_brande = company_brande;
        this.use_as = use_as;
        this.status = status;
        this.model = model;
        this.number = number;
        this.make_year = make_year;
        this.sitting_capacity = sitting_capacity;
        this.ingine_capacity = ingine_capacity;
        this.type = type;
        this.variant = variant;
        this.rent_value = rent_value;
    }
    public boolean add_vehicle(){
        LoadFromFile();
        Vehicles.add(this);
        return commitToFile();
    }
    
    boolean commitToFile(){
        return fileManeger.write(vehicleFileName,Vehicles);
        
    } 
    
     private void LoadFromFile(){
        Vehicles = (ArrayList<Vehicle>) fileManeger.read(vehicleFileName);
    }
    
    
    private int getVehicleIndex(int number){
        for(int i=0;i<Vehicles.size();i++){
            if(Vehicles.get(i).getNumber()==number)
                return i;
        }
        return -1;
            
    }
    public Vehicle searchVehicleByNumber(int num) {
        Vehicle temp = new Vehicle();
        LoadFromFile();
        int index = getVehicleIndex(num);
        if (index != -1) {
            return Vehicles.get(index);
        } else {
            return temp;
        }
    }

    public ArrayList<Vehicle> listVehicles(){
        LoadFromFile();
        return Vehicles;
    } 
   
    public int getVehicleCapacity(int sitting_capacity){
        for(int i=0;i<Vehicles.size();i++){
            if(Vehicles.get(i).getSitting_capacity()==sitting_capacity)
                return i;
        }
        return -1;
            
    }
   
    
    
    public String ViewVehicles(){
        LoadFromFile();
        String S="\n Vehicle Data: \n";
        for (Vehicle x: Vehicles){
            S=S+x.toString();
        }
        return S;
    }
    
    public String Searchvehicle(int number){
        LoadFromFile();
        int index=getVehicleIndex(number);
        if(index!=-1)
            return "\nFound ...!"+Vehicles.get(index).toString();
        else
            return "\nNot Found ...!";
    }
    
    public boolean updateVehicle(){
        LoadFromFile();
        int index=getVehicleIndex(this.getNumber());
        if(index!=-1){
            Vehicles.set(index,this);
            return commitToFile();
        }
        return false;
        
    }
    
    public boolean RemoveVehicle(int number){
        LoadFromFile();
        int index=getVehicleIndex(number);
        if(index!=-1){
            Vehicles.remove(index);
            return commitToFile();
        }
        return false;
    }
   
    

    @Override
    public String toString() {
        return "Vehicle{" + "company_brande=" + company_brande + ", use_as=" + use_as + ", status=" + status + ", model=" + model + ", number=" + number + ", make_year=" + make_year + ", sitting_capacity=" + sitting_capacity + ", ingine_capacity=" + ingine_capacity + ", type=" + type + ", variant=" + variant + ", rent_value=" + rent_value + '}';
    }
}
