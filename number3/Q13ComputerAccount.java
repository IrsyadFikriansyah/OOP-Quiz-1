/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
// File: Q13ComputerAccount.java
public class Q13ComputerAccount {
    /**
     * using string to store realName, userName, and password
     * then initialize the object with the constructor
     * print…() function will print a field and return void
     * setNewPassword() function will overide the old password
     */    
    
    // properties/fields
    private String realName;
    private String userName;
    private String password;

    
    // constructor
    public Q13ComputerAccount(String realName, String userName, String password){
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }
    
    // getters and setters
    public void printRealName(){
        System.out.println(this.realName);
    }

    public void printUserName(){
        System.out.println(this.userName);
    }

    public void printPassword(){
        System.out.println(this.password);
    }

    public void setNewPassword(String newPassword){
        this.password = newPassword;
    }
}