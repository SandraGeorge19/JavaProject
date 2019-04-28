package pl.pro;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer extends person_1 implements Serializable {

    final String eFileName = "customer.bin";
    private static ArrayList<Customer> cus_list = new ArrayList<Customer>();

    private String useas;
    private int rentingdays;
    private String bookdays;

    public String getUseas() {
        return useas;
    }

    public int getRentingdays() {
        return rentingdays;
    }

    public String getBookdays() {
        return bookdays;
    }

    public void setUseas(String useas) {
        this.useas = useas;
    }

    public void setRentingdays(int rentingdays) {
        this.rentingdays = rentingdays;
    }

    public void setBookdays(String bookdays) {
        this.bookdays = bookdays;
    }

    public Customer get_cu_data(int id) {

        load_from_file();

        int idx = get_customer_index(id);
        if (idx != -1) {
            return cus_list.get(idx);
        }

        return null;

    }
    String file_path = "customer.txt";

    public boolean add_customer() {
        load_from_file();
        if (get_customer_index(this.getId()) == -1) {

            cus_list.add(this);
            return commit_to_file();
        }

        return false;
    }

    private boolean commit_to_file() {
        return fileManeger.write(eFileName, cus_list);
    }

    private void load_from_file() {
        cus_list = (ArrayList<Customer>) fileManeger.read(eFileName);

    }

    public int get_customer_index(int id) {
        for (int i = 0; i < cus_list.size(); i++) {
            if (cus_list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int id) {
        load_from_file();
        int index = get_customer_index(id);
        if (index != -1) {
            cus_list.remove(index);
            return commit_to_file();
        }
        return false;
    }
}
