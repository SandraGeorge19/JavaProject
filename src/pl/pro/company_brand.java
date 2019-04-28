
package pl.pro;

import java.util.ArrayList;

public class company_brand {
    private final String eFileName="com_brand.bin";
    private static ArrayList <company_brand> brand_list = new ArrayList<>();
    private String name;

    company_brand(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean add_company_name() {
		load_from_file();
		brand_list.add(this);
		return commit_to_file();
	}
	
	private boolean commit_to_file() {
		return fileManeger.write(eFileName,brand_list);
	}
	
    @SuppressWarnings("unchecked")
	private void load_from_file() {
		brand_list=(ArrayList<company_brand>) fileManeger.read(eFileName);
	}
    
}     
