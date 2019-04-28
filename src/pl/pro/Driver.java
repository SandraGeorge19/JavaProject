
package pl.pro;

import java.io.Serializable;
import java.util.ArrayList;

public class Driver extends person_1 implements Serializable {
    private static ArrayList<Driver> driver = new ArrayList<>();
    private final String efileName="driver.bin";
    private String experience;
    private String photo;
    private String company_brand;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCompany_brand() {
        return company_brand;
    }

    public void setCompany_brand(String company_brand) {
        this.company_brand = company_brand;
    }
   
    private void loadFromFile()
    {
        
            driver = (ArrayList<Driver>) fileManeger.read(efileName);
        
    }
     private boolean commitToFile(){
        return fileManeger.write(efileName , driver);
        
    }
     private int getStudentindex(int id1){
        for(int i=0; i<driver.size(); i++)
        {
            if(driver.get(i).getId()==id)
                return i;
        }
        return -1;
    }
     
     public Driver searchDriverByID(int id) {
        Driver temp = new Driver();
        loadFromFile();
        int index = getStudentindex(id);
        if (index != -1) {
            return driver.get(index);
        } else {
            return temp;
        }
    }
     
     public boolean AddDriver(){
        loadFromFile();
        driver.add(this);
        return commitToFile();
        
        
    }
      public boolean RemoveDriver(int id){
        loadFromFile();
        int index=getStudentindex(id);
        if(index!=-1){
         driver.remove(index);
        if(index!=-1){
            driver.remove(index);
            return commitToFile();
        }
        }
        return false;
    }
      
      public Driver SearchDriver(int id){
          	loadFromFile();
		int index=getStudentindex(id);
		if(index!=-1) {
                    return driver.get(index);
		}
		else { 
			return null;
		}
	}
      public boolean UpdateDriver(){
        loadFromFile();
        int index=getStudentindex(this.getID());
        if(index!=-1){
          driver.set(index,this);
          return commitToFile();
        }
        return false;
        
    }
      public Driver()
              {
                  
              }
       public Driver(String name,String gender,String phone_no,String address,int ID,String birth_of_date,String experience, String photo,String company_brand)
              {
                this.name=name;
		this.ID = ID;
		this.phone_no=phone_no;
		this.gender=gender;
		this.address=address;
		this.birth_of_date=birth_of_date;
                this.experience=experience;
                this.photo=photo;
                this.company_brand=company_brand;
              }

    
      }

