package pl.pro;

import java.io.Serializable;



public abstract class person_1  implements Serializable{
	String name;
	String gender;
	String phone_no;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBirth_of_date() {
		return birth_of_date;
	}
	public void setBirth_of_date(String birth_of_date) {
		this.birth_of_date = birth_of_date;
	}
	int id;
	String birth_of_date;
    public person_1() {
    	
    }
	public person_1(String name,String gender,String phone_no,String address,int id,String birth_of_date) {
		this.name=name;
		this.id=id;
		this.phone_no=phone_no;
		this.gender=gender;
		this.address=address;
		this.birth_of_date=birth_of_date;
	}
}
