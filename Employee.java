
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
     private int ID;
private String FIRST_NAME;
    private String LAST_NAME;
    private String USERNAME;
    private String PASSWORD;
    private String DEPARTMENT;
     private String SALARY;
    private String ADDRESS;
    private String CONTACT;
    private String CITY;
    

    private Employee(int ID, String FIRST_NAME, String LAST_NAME, String USERNAME, String PASSWORD, String ADDRESS, String CONTACT, String DEPARTMENT, String  SALARY, String CITY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public int getID() {
        return ID;
    }
     public void setID(int ID){
       this.ID=ID;
         
     }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY= CITY;
    }

    public void setId(int ID) {
        this.ID = ID;
    }
    
    public String getFIRST_NAME() {
        return FIRST_NAME;
    }
    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }
    public String getLAST_NAME() {
        return LAST_NAME;
    }
    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }
    public String getUSERNAME() {
        return USERNAME;
    }
    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }
    public String getPASSWORD() {
        return PASSWORD;
    }
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT= DEPARTMENT;
    }
    
    public String getSALARY() {
        return SALARY;
    }

    public void setSALARY(String SALARY) {
        this.SALARY= SALARY;
    }
    public String getADDRESS() {
        return ADDRESS;
    }
    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }
    public String getCONTACT() {
        return CONTACT;
    }
    public void setCONTACT(String CONTACT) {
        this.CONTACT = CONTACT;
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
        
            
Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe");
       PreparedStatement stmt = con.prepareStatement("insert into EMPLOYEE(FIRST_NAME,LAST_NAME,USERNAME,PASSWORD,DEPARTMENT,SALARY,ADDRESS,CONTACT,CITY) values (?,?,?,?,?,?,?,?,?,)");
       stmt.setInt(1, this.getID());
       stmt.setString(2, this.getFIRST_NAME()); 
        stmt.setString(3, this.getLAST_NAME()); 
         stmt.setString(4, this.getUSERNAME()); 
          stmt.setString(5, this.getPASSWORD()); 
           stmt.setString(6, this.getDEPARTMENT()); 
            stmt.setString(7, this.getSALARY()); 
             stmt.setString(8, this.getADDRESS()); 
              stmt.setString(9, this.getCONTACT()); 
               stmt.setString(10, this.getCITY());
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
        
    
   


  


    
    
