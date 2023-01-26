

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
    private static final long serialVersionUID = 1L;
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
    

    private Employee(int id, String first_Name, String last_Name, String username, String password, String department, String salary, String address, String  contact, String city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
   
    public Employee(){
        
    }
   
    /**
     *
     * @return 
     * @throws java.lang.ClassNotFoundException
     */
    public boolean save() throws ClassNotFoundException  
    {
        int result=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");   
        
            
Connection con =  DriverManager.getConnection("DB_URL, USER, PASS");
       PreparedStatement stmt = con.prepareStatement("insert into EMPLOYEE(id,first_Name,last_Name,username,password,department,salary,address,contact,city) values (?,?,?,?,?,?,?,?,?,)");
       stmt.setInt(1, this.getId());
       stmt.setString(2,this.getFirst_Name()); 
        stmt.setString(3, this.getLast_Name()); 
         stmt.setString(4, this.getUsername()); 
          stmt.setString(5, this.getPassword()); 
           stmt.setString(6, this.getDepartment()); 
            stmt.setString(7, this.getSalary()); 
             stmt.setString(8, this.getAddress()); 
              stmt.setString(9, this.getContact()); 
               stmt.setString(10, this.getCity());
                result = stmt.executeUpdate();  
            
   
         
}    catch(SQLException e){ 
    System.out.println(e); 
}
        if(result==1){
            return true;
        }else {
            return false;
        }
    }
    public String submit() throws ClassNotFoundException{
       if(this.save()){
           return "index.xhtml";
       }
       else {
           return "response.xhtml";
       }
        }
       }
        
    
   


  


    
    

    
   


  


    
    
