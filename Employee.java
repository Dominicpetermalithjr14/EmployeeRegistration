

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Employee implements Serializable{

     private int id;
private String first_Name;
    private String last_Name;
    private String username;
    private String password;
    private String department;
     private String salary;
    private String address;
    private String contact;
    private String city;
    

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
   

    
   
    /**
     *
     * @return 
     * @throws java.lang.ClassNotFoundException
     */
   public String register() throws ClassNotFoundException {
        try {
            DBConnection db=new DBConnection();
             Connection connection = db.connMethod();
        PreparedStatement stmt=connection.prepareStatement("Insert into EMPLOYEE(ID,FIRST_NAME,LAST_NAME,PASSWORD,DEPARTMENT,SALARY,ADDRESS,CONTACT,CITY,USERNAME) values (?,?,?,?,?,?,?,?,?,?)");     
        stmt.setInt(1,id);  
        stmt.setString(2,first_Name);  
        stmt.setString(3,last_Name);  
        stmt.setString(4,password); 
         stmt.setString(5,department);  
        stmt.setString(6,salary);
        stmt.setString(7,address);
        stmt.setString(8,contact);
        stmt.setString(9,city);
        stmt.setString(10,username);
        stmt.executeUpdate();  
            return "register";
        }
        catch (SQLException e) {
        }
         return "registrationfail";
    }
        }
       
    
   


  


    
    

    
   


  


    
    
