package pl.pro;

import java.io.Serializable;
import java.util.ArrayList;

public class employee extends person_1 implements Serializable {
	/**
	 * 
	 */
	final String eFileName="employee.bin";
	private static ArrayList<employee> employees=new ArrayList<employee>();
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	private String date_of_joining;
	private String qualification;
	public employee() {
		
	}
	
	public employee(String name,String gender,String phone_no,String address,int id,String birth_of_date,String username,String password,String qualification,String date_of_joining) {
		super(name,gender,phone_no,address,id,birth_of_date);
		this.username=username;
		this.password=password;
		this.qualification=qualification;
		this.date_of_joining=date_of_joining;
	}
	
	public boolean add_employee() {
		load_from_file();
		employees.add(this);
		return commit_to_file();
	}
	
	private boolean commit_to_file() {
		return fileManeger.write(eFileName,employees);
	}
	
	private void load_from_file() {
		employees=(ArrayList<employee>) fileManeger.read(eFileName);
	}
	
	private int get_employee_index(int id) {
		for (int i=0;i<employees.size();i++) {
			if(employees.get(i).getId()==id) {
				return i;
			}
		}
		return -1;	
	}
	
	public ArrayList<employee> show_all_employees() {
		load_from_file();
		return (employees.isEmpty()?null:employees);
	}
	public employee search_employee(int id) {
		load_from_file();
		int index=get_employee_index(id);
		if(index!=-1) 
			return employees.get(index);
                                
		return null;
	}
	
	public boolean update(int old_id,employee x) {
		load_from_file();
		int index=get_employee_index(old_id);
		if (index != -1) {
		employees.set(index, x);
		return commit_to_file();
		}
		return false;
	}
	
	public boolean remove(int id) {
		load_from_file();
		int index=get_employee_index(id);
        if (index != -1) {
		employees.remove(index);
		return commit_to_file();
        }
        return false;
	}
	
}