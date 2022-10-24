/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
// File: Q13ComputerAccountTest.java
public class Q13ComputerAccountTest {

    public static void main(String[] args) {
        /**
         * declaring new object "myAccount"
         * with it's component:
         *  realName : Irsyad Fikri
         *  userName : FlameBoy
         *  password : iLoveNasiGoreng
         */
        Q13ComputerAccount myAccount = new Q13ComputerAccount("Irsyad Fikri", "FlameBoy", "iLoveNasiGoreng");

        // calling print function
        /**
         * should outputing:
         *  Irsyad Fikri
         *  FlameBoy
         *  iLoveNasiGoreng
         */
        myAccount.printRealName();
        myAccount.printUserName();
        myAccount.printPassword();

        // changing password
        /** 
         * should outputing:
         *  iLoveEmpekEmpek
         */
        myAccount.setNewPassword("iLoveEmpekEmpek");
        myAccount.printPassword();
    }
}