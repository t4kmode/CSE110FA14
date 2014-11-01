import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zachary Preece-Scaringe
 * This class tests the UserAccount functionality.
 * 
 * NOTE: Everything seems to work very well, you are able to insert and find 100
 *       bank accounts perfectly, and you are unable to reinsert a bank account
 *       with the same name. When i changed the number to 1000 however,
 *       1000 were inserted but the find method broke down. However I don't
 *       think we will need more than 100.
 */
public class UserAccountTest {
    
    UserAccount instance;       //A User Account to manipulate for testing
    
    @Before
    public void setUp() {
   
        //Initialization of a user account available to use in tests
        instance = new UserAccount();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * ===Test of validatePassword method, of class UserAccount===
     * tests the validation of an empty password
     */
    @Test
    public void testValidatePassword_empty() {
        System.out.println("validatePassword");
        String pass = "";
        instance = new UserAccount("first","last","user","","email","phone",1);
        boolean expResult = true;
        boolean result = instance.validatePassword(pass);
        assertEquals(expResult, result);
    }
    
    
    /**
     * ===Test 2 of validatePassword method, of class UserAccount===
     * tests the validation of a long password including all numbers and letters
     */
    @Test
    public void testValidatePassword_long() {
        System.out.println("validatePassword");
        String pass = "0123456789abcdefghijklmnopqrstuvwxyz";
        instance = new UserAccount("first","last","user",
                      "0123456789abcdefghijklmnopqrstuvwxyz","email","phone",1);
        boolean expResult = true;
        boolean result = instance.validatePassword(pass);
        assertEquals(expResult, result);
    }
    

    /**
     * ===Test of insertBankAccount method, of class UserAccount===
     * Tests inserting 100 Checking accounts
     */
    @Test
    public void testInsertBankAccount_Checking() {
        System.out.println("insertBankAccount");
        
        String name = "c_test1";
        String type = "Checking";
        
        //create and insert 100 checking accounts
        for(int i=0;i<100;i++) {         
          
          BankAccount expResult = new CheckingAccount(i,name+i);
          BankAccount result = instance.insertBankAccount(i, name+i, type);
          
          //check to see if every field matches
          assertEquals(expResult.accountName, result.accountName);
          assertEquals(expResult.balance, result.balance,0);
          assertEquals(expResult.next, result.next);
          assertEquals(expResult.accountType, result.accountType);
        }
    }
    
    /**
     * ===Test of insertBankAccount method, of class UserAccount===
     * Tests inserting 100 Savings accounts.
     */
    @Test
    public void testInsertBankAccount_Savings() {
        System.out.println("insertBankAccount");
        
        String name = "s_test";
        String type = "Savings";
        
        for(int i=0;i<100;i++) {
        
        BankAccount expResult = new SavingsAccount(i,name+i);
        BankAccount result = instance.insertBankAccount(i, name+i, type);
        
        assertEquals(expResult.accountName, result.accountName);
        assertEquals(expResult.balance, result.balance,0);
        assertEquals(expResult.next, result.next);
        assertEquals(expResult.accountType, result.accountType);
        }
    }
    
    /**
     * ===Test of insertBankAccount method, of class UserAccount===
     * Tests reinsertion of 100 Savings accounts.
     */
    @Test
    public void testInsertBankAccount_Savings_reinsert() {
        System.out.println("insertBankAccount");
        
        String name = "s_test";
        String type = "Savings";
        
        //insert 100 Savings accounts
        for(int i=0;i<100;i++) {  
          instance.insertBankAccount(i, name+i, type);
        }
        
        //reinsert the accounts
        for(int i=0;i<100;i++) {
          BankAccount result = instance.insertBankAccount(i, name+i, type);
          assertEquals(result, null);
        }
    }
    
    /**
     * ===Test of insertBankAccount method, of class UserAccount===
     * Tests reinsertion of 100 Checking accounts.
     */
    @Test
    public void testInsertBankAccount_Checking_reinsert() {
        System.out.println("insertBankAccount");
        
        String name = "c_test";
        String type = "Checking";
        
        //insert 100 Checking accounts
        for(int i=0;i<100;i++) {  
          instance.insertBankAccount(i, name+i, type);
        }
        
        //reinsert the accounts
        for(int i=0;i<100;i++) {
          BankAccount result = instance.insertBankAccount(i, name+i, type);
          assertEquals(result, null);
        }
    }
    
    
    /**
     * ===Test of findBankAccount method, of class UserAccount===
     * tests accurately finding 100 Checking accounts and 100 Savings accounts
     */
    @Test
    public void testFindBankAccount() {
        System.out.println("findBankAccount");
        String name = "find_test";
        
        // add 100 bank accounts and 100 checking accounts
        for(int i=0;i<100;i++) {
          instance.insertBankAccount(i, name + i, "Checking");
          instance.insertBankAccount(i, name + 100 + i, "Savings");
        }
        
        //check name and balance fields for checking accounts to see if found
        //accounts match
        for(int i=0;i<100;i++) {
          BankAccount expResult = new CheckingAccount(i,name+i);
          BankAccount result = instance.findBankAccount(name+i);
          assertEquals(expResult.accountName, result.accountName);
          assertEquals(expResult.balance, result.balance,0);
        }
        
        //check name and balance fields of savings accounts to see if found
        //accounts match
        for(int i=0;i<100;i++) {
          BankAccount expResult = new SavingsAccount(i,name+ 100 +i);
          BankAccount result = instance.findBankAccount(name+ 100 +i);
          assertEquals(expResult.accountName, result.accountName);
          assertEquals(expResult.balance, result.balance,0);
        }
    }
}
