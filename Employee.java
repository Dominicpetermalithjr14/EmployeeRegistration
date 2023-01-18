
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "employee2")
@SessionScoped
public class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
     private int id;
private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String department;
     private int salary;
    private String address;
    private String contact;
    private String city;
    

    private Employee(int id, String firstName, String lastName, String username, String password, String address, String contact, String department, int salary, String city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
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
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
   
    public String registerdEmployeeInfo() {
        boolean stored = true;
        FacesMessage message = null;
        String outcome = null;
        if (stored) {
            message = new FacesMessage("Employee Information is registered Successfully.");
            outcome = "registered";
        } else {
            message = new FacesMessage("Employee Information is NOT registered Successfully.");
            outcome = "registrationFail";
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        return outcome;
    }

    
    
    public Employee() {
    }

   
    
}

    
    
