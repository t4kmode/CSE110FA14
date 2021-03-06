package LogicLayer;

import java.io.Serializable;
import org.joda.time.*;

/**
 * **************************************************************************
 *
 * Ryan Bridges CSE 110, Fall 2014 Last Updated: December 6, 2014
 *
 * Team 42
 *
 * File Name: HashTable.java Description: This file is contains the
 * implementation for the master Hash Table which will hold all user accounts.
 * Each bucket in the Hash Table will hold a linked list of UserAccounts.
 * **************************************************************************
 */
public class HashTable implements Serializable
{

    // Chose a prime number for the size of the table for more efficient hashing
    private final static int SIZE = 251;
    public final static int MAX_MONTHS = 12;
    // Interest rates for savings accounts
    public static double SAVINGS_RATE_OVER_3000 = 0.04;
    public static double SAVINGS_RATE_2000_TO_3000 = 0.03;
    public static double SAVINGS_RATE_1000_TO_2000 = 0.02;
    // Interest rates for checking accounts
    public static double CHECKING_RATE_OVER_3000 = 0.03;
    public static double CHECKING_RATE_2000_TO_3000 = 0.02;
    public static double CHECKING_RATE_1000_TO_2000 = 0.01;
    public static double PENALTY_AMOUNT = 25;

    public int occ; // Total number of UserAccounts that the table is holding
    UserAccount[] Table; // The hash table
    private DateTime lastInterestDateTime;

    // Constructor for the HashTable creates an array of size SIZE and
    // initializes every element in the array to null. Also initializes occ
    public HashTable()
    {
        this.occ = 0;
        Table = new UserAccount[SIZE];
        for (int zod = 0; zod < SIZE; zod++)
        {
            Table[zod] = null;
        }
        lastInterestDateTime = new DateTime();
    }

    /**
     * This function will insert a new UserAccount into the table
     *
     * @param userEmail The user's email address
     * method: insertUserAccount
     * @param userName The UserAccount to be inserted
     * @return Returns the inserted UserAccount if insertion was successful.
     * Returns null if UserAccount with the given userName is found.
     */
    public UserAccount insertUserAccount(String userName, String userEmail)
    {
        int index = hashCode(userName) % SIZE;
        // The bucket at index is not currently occupied, so we insert at
        // Table[index]
        if (findUserAccountEmail(userEmail) == null)
        {
            if (Table[index] == null)
            {
                Table[index] = new UserAccount(userName);
                // Create a checking account and a savings account automatically for the user
                Table[index].insertBankAccount(0, "Checking1", "Checking");
                Table[index].insertBankAccount(0, "Savings1", "Savings");
                // set email address
                Table[index].setEmail(userEmail);
                this.occ++;
                return Table[index];
            }
            else // The bucket at index is occupied, so we insert into the linked
            // list of UserAccounts that the bucket is holding
            {
                UserAccount current;
                current = Table[index];
                // Traverse the linked list to find the insertion point
                while (current.getNext() != null
                        && !((current.getUserName()).equals(userName)))
                {
                    current = current.getNext();
                }
                // Will return false if the userName is already in use
                // Prompt the user to enter a different userName in main
                // and then call insert again if this happens.
                if (current.getUserName().equals(userName))
                    return null;
                else // The end of the linked list was reached.
                // This means that the userName that was entered is not in use
                // so we insert here.
                {
                    current.setNext(new UserAccount(userName));
                    current.getNext().insertBankAccount(0, "Checking1", "Checking");
                    current.getNext().insertBankAccount(0, "Savings1", "Savings");
                    current.getNext().setEmail(userEmail);
                    this.occ++;
                    return current.getNext();
                }
            }
        }
        return null;
    }
    /**
     * Will return true for successful creation, false if the user account already exists. 
     * @param copy the useraccount to copy
     * @return null if duplicate entry (unsuccessful) other wise the user account
     */
    public UserAccount insertUserAccountCopy(UserAccount copy)
    {
        int index = hashCode(copy.getUserName()) % SIZE;
        // The bucket at index is not currently occupied, so we insert at
        // Table[index]

        if (Table[index] == null)
        {
            Table[index] = copy;
            this.occ++;
            return Table[index];
        }
        else // The bucket at index is occupied, so we insert into the linked
        // list of UserAccounts that the bucket is holding
        {
            UserAccount current;
            current = Table[index];
            // Traverse the linked list to find the insertion point
            while (current.getNext() != null
                    && !((current.getUserName()).equals(copy.getUserName())))
            {
                current = current.getNext();
            }
            // Will return false if the userName is already in use
            // Prompt the user to enter a different userName in main
            // and then call insert again if this happens.
            if (current.getUserName().equals(copy.getUserName()))
                return null;
            else // The end of the linked list was reached.
            // This means that the userName that was entered is not in use
            // so we insert here.
            {
                current.setNext(copy);
                this.occ++;
                return current.getNext();
            }
        }
    }

    // When a user attempts to log in, this function will be called to see
    // if the username that they entered exists. If it does, then the
    // UserAccount that is associated with that username will be returned and
    // the password will be verified.
    /**
     * Attempts to find a UserAccount in the HashTable.
     *
     * method: findUserAccount
     * @param userName The UserAccount to be found identified by the userName
     * @return Returns true if found. Returns false if not found
     */
    public UserAccount findUserAccount(String userName)
    {
        int index = hashCode(userName) % SIZE;
        // The bucket at index was empty so the UserAccount was not found
        if (Table[index] == null)
            return null;
        else // The bucket at index was not null, so we traverse the linked list
        // of UserAccounts inside the bucket and look for the UserAccount
        {
            UserAccount current = Table[index];
            // Traverse the linked list until the UserAccount is found or we
            // reach the end of the linked list
            while (current != null && !((current.getUserName()).equals(userName)))
            {
                current = current.getNext();
            }
            // We reached the end of the linked list and the UserAccount
            // was not found
            if (current == null)
                return null;
            else // The UserAccount was found
                return current;
        }
    }

    /**
     * Allows us to lookup a userAccount with just an email address
     *
     * @param email the email address to find
     * @return the UserAccount with a matching email. Or null if not found
     */
    public UserAccount findUserAccountEmail(String email)
    {
        int isEqual;
        // Iterate through the entire table
        for (int i = 0; i < SIZE; i++)
        {
            // Store the UserAccount in the current bucket if it is not empty
            if (Table[i] != null)
            {
                // Store the current UserAccount and email address
                UserAccount current = Table[i];
                String currentEmail = current.getEmail();
                if (currentEmail != null)
                {
                    // Compare the email addresses
                    isEqual = currentEmail.compareTo(email);
                    if (isEqual == 0)
                        return current;
                }
                // Iterate through the linked list of UserAccounts inside of
                // each bucket and check their emails
                while (current.getNext() != null)
                {
                    current = current.getNext();
                    currentEmail = current.getEmail();
                    if (currentEmail != null)
                    {
                        isEqual = currentEmail.compareTo(email);
                        if (isEqual == 0)
                            return current;
                    }
                }
            }
        }
        return null;
    }

    /**
     * This function will delete a UserAccount from the HashTable
     *
     * method deleteUserAccount
     * @param userName The userName that corresponds to the UserAccount to be
     * deleted
     * @return Returns true if deletion was successful, false if not successful
     */
    public boolean deleteUserAccount(String userName)
    {
        int index = hashCode(userName) % SIZE;
        if (Table[index] != null)
        {
            // Keep track of the previous UserAccount in the list
            UserAccount prev = null;
            UserAccount current = Table[index];
            // Traverse the linked list inside of the bucket until the UserAccount
            // is found or we reach the end of the linked list
            while (current.getNext() != null
                    && !(current.getUserName().equals(userName)))
            {
                prev = current;
                current = current.getNext();
            }
            if (current.getUserName().equals(userName)) // The UserAccount was found
            {
                // The UserAccount is not the head of the linked list
                if (prev != null)
                {
                    prev.setNext(current.getNext());
                    current.setNext(null);
                    current = null;
                }
                else // Remove the head of the linked list inside of the bucket
                    Table[index] = current.getNext();
                occ--;
                return true;
            }
        }
        // The bucket at index was empty so the UserAccount was not found
        return false;
    }

    /**
     * This is an algorithm for determining the hashcode of a given userName. It
     * will add up the sum of the ASCII codes of each individual character in
     * the String that is passed in. Then it will bit shift the sum left 2. Then
     * it will XOR the bitshifted value with the original sum of the ACSII
     * values.
     *
     * @param userName The String to get the hashcode of
     * method hashCode
     * @return returns the hashCode which will be % with the table size to find
     * the insertion point of the element.
     */
    public int hashCode(String userName)
    {
        int hashValue = 0;
        // Add up the ASCII codes
        for (int zod = 0; zod < userName.length(); zod++)
        {
            hashValue = userName.charAt(zod) + hashValue;
        }
        // Perform bitshift
        int shiftedHash = hashValue << 2;
        // XOR the bitshifted value with the original value
        return (shiftedHash ^ hashValue);
    }

    /* updates the thisMonthsDailyTotals of each bank account
     ***ARBITRARILY GOES OFF THE BALANCE AT 11:59PM
     * SHOULD BE CALLED IN THREAD AFTER any time offsets of
     * runtime until midnight has been incorporated then call this
     * method to continually have averagetotal update in case
     * user doesn't turn off app
     */
    public void updateAverageBalance()
    {
        BankAccount currentBA;
        UserAccount currentUA;
        double dailyTotal;
        double dailyBalance;
        for (int zod = 0; zod < SIZE; zod++)
        {
            if (Table[zod] != null)
            {
                currentUA = Table[zod];
                while (currentUA != null)
                {
                    if (currentUA.getBankAccHead() != null)
                    {
                        currentBA = currentUA.getBankAccHead();
                        while (currentBA != null)
                        {

                            ////System.out.println("MSG HashTable.java: Adding current balance to daily total");
                            dailyTotal = currentBA.getThisMonthsDailyTotals();
                            dailyBalance = currentBA.getBalance();
                            dailyTotal += dailyBalance;
                            //setting monthy total
                            currentBA.setThisMonthsDailyTotals(dailyTotal);
                            currentBA = currentBA.getNext();
                        }
                    }
                    //iterate BA account.
                    currentUA = currentUA.getNext();
                }
            }
        }
    }

    /**
     * This function will iterate through the entire HashTable and delegate to
     * InterestAndPenaltiesHelper to calculate the penalties and interest on all
     * existing. Call this function when you need to calculate the penalties on
     * all Bank Accounts and it should do everything for you.
     */
    public void InterestAndPenalties()
    {
        BankAccount currentBA;
        UserAccount currentUA;
        // Iterate through every BankAccount in the entire table
        for (int zod = 0; zod < SIZE; zod++)
        {
            // Check if the current bucket is empty
            if (Table[zod] != null)
            {
                // Store the UserAccount in the current bucket
                currentUA = Table[zod];
                // Iterate through the linked list inside of the bucket
                while (currentUA != null)
                {
                    // Iterate through the list of BankAccounts in each UserAccount
                    if (currentUA.getBankAccHead() != null)
                    {
                        currentBA = currentUA.getBankAccHead();
                        while (currentBA != null)
                        {
                            ////System.out.println("MSG HashTable.java: InterestAndPenalties calling helper");
                            // Calculate Interest and Penalties on the current BankAccount
                            InterestAndPenaltiesHelper(currentBA);
                            currentBA = currentBA.getNext();
                        }
                    }
                    currentUA = currentUA.getNext();
                }
            }
        }
        // Time and date calculations for keeping track of the last time the
        // interest/penalties were calculated
        DateTime newDateTime = lastInterestDateTime.withMonthOfYear((lastInterestDateTime.plusMonths(1).getMonthOfYear()));
        newDateTime = newDateTime.withDayOfMonth(1);
        newDateTime = newDateTime.withHourOfDay(newDateTime.hourOfDay().getMinimumValue());
        newDateTime = newDateTime.withMinuteOfHour(newDateTime.minuteOfHour().getMinimumValue());
        newDateTime = newDateTime.withSecondOfMinute(newDateTime.secondOfMinute().getMinimumValue());
        ////System.out.println("newDateTime after interest: " + newDateTime);
        lastInterestDateTime = newDateTime;
    }

    /**
     * This function will perform interest/penalty calculations on the passed in
     * BankAccount
     *
     * @param currentBA the BankAccount to calculate Interest and Penalties for
     */
    public void InterestAndPenaltiesHelper(BankAccount currentBA)
    {
        /*//System.out.println("MSG HashTable.java: getting interest for account " + currentBA.getAccountName()
         + " with initial balance: " + currentBA.getBalance());*/
        // Divide the running daily total by the total number of days in the
        // month to obtain the daily average
        double dailyAverage = ((currentBA.getThisMonthsDailyTotals()) / (lastInterestDateTime.dayOfMonth().getMaximumValue()));
        // Check the various thresholds to see how much interest/penalty to apply
        if (dailyAverage <= 100)
        {
            currentBA.subPenalty(PENALTY_AMOUNT);
        }
        else if (dailyAverage >= 3000)
        {
            if (currentBA instanceof CheckingAccount)
                currentBA.addInterest((currentBA.getBalance() * CHECKING_RATE_OVER_3000));
            else
                currentBA.addInterest((currentBA.getBalance() * SAVINGS_RATE_OVER_3000));
        }
        else if (dailyAverage >= 2000 && dailyAverage < 3000)
        {
            if (currentBA instanceof CheckingAccount)
                currentBA.addInterest((currentBA.getBalance() * CHECKING_RATE_2000_TO_3000));
            else
                currentBA.addInterest((currentBA.getBalance() * SAVINGS_RATE_2000_TO_3000));
        }
        else if (dailyAverage < 2000 && dailyAverage >= 1000)
        {
            if (currentBA instanceof CheckingAccount)
                currentBA.addInterest((currentBA.getBalance() * CHECKING_RATE_1000_TO_2000));
            else
                currentBA.addInterest((currentBA.getBalance() * SAVINGS_RATE_1000_TO_2000));
        }
        // Reset the daily totals
        currentBA.setThisMonthsDailyTotals(0);
        /*//System.out.println("MSG HashTable.java: Calculated interest for account " + currentBA.getAccountName()
         + " with FINAL balance: " + currentBA.getBalance());*/
    }

    /**
     * Exactly the same as InterestAndPenalties above except it delegates to a
     * slightly different function to actually calculate the interest. This
     * fucntion is used when the teller presses the "Apply Global Interest and
     * Penalties" button
     */
    public void InterestAndPenaltiesTeller()
    {
        BankAccount currentBA;
        UserAccount currentUA;
        for (int zod = 0; zod < SIZE; zod++)
        {
            if (Table[zod] != null)
            {
                currentUA = Table[zod];
                while (currentUA != null)
                {
                    if (currentUA.getBankAccHead() != null)
                    {
                        currentBA = currentUA.getBankAccHead();
                        while (currentBA != null)
                        {
                            ////System.out.println("MSG HashTable.java: InterestAndPenalties calling helper");
                            // Delegate to teller function
                            InterestAndPenaltiesTellerHelper(currentBA);
                            currentBA = currentBA.getNext();
                        }
                    }
                    currentUA = currentUA.getNext();
                }
            }
        }
    }

    /**
     * This version of InterestAndPenaltiesHelper does not use the average daily
     * totals since the calculation is done instantaneously. Instead is uses the
     * current bank account balance
     *
     * @param currentBA the current bank account 
     */
    public void InterestAndPenaltiesTellerHelper(BankAccount currentBA)
    {
        /* //System.out.println("MSG HashTable.java: getting interest for account " + currentBA.getAccountName()
         + " with initial balance: " + currentBA.getBalance());*/
        // Divide the running daily total by the total number of days in the
        // month to obtain the daily average

        double bal = currentBA.getBalance();
        if (bal <= 100)
        {
            currentBA.subPenalty(PENALTY_AMOUNT);
        }
        else if (bal >= 3000)
        {
            if (currentBA instanceof CheckingAccount)
                currentBA.addInterest((currentBA.getBalance() * CHECKING_RATE_OVER_3000));
            else
                currentBA.addInterest((currentBA.getBalance() * SAVINGS_RATE_OVER_3000));
        }
        else if (bal >= 2000 && bal < 3000)
        {
            if (currentBA instanceof CheckingAccount)
                currentBA.addInterest((currentBA.getBalance() * CHECKING_RATE_2000_TO_3000));
            else
                currentBA.addInterest((currentBA.getBalance() * SAVINGS_RATE_2000_TO_3000));
        }
        else if (bal >= 1000 && bal < 2000)
        {
            if (currentBA instanceof CheckingAccount)
                currentBA.addInterest((currentBA.getBalance() * CHECKING_RATE_1000_TO_2000));
            else
                currentBA.addInterest((currentBA.getBalance() * SAVINGS_RATE_1000_TO_2000));
        }
        currentBA.setThisMonthsDailyTotals(0);
        /*//System.out.println("MSG HashTable.java: Calculated interest for account " + currentBA.getAccountName()
         + " with FINAL balance: " + currentBA.getBalance());*/
    }

    /////////////////////////////////////////
    // BELOW ARE JUST SETTERS AND GETTERS ///
    /////////////////////////////////////////
    public double getSAVINGS_RATE_OVER_3000()
    {
        return SAVINGS_RATE_OVER_3000;
    }

    public double getSAVINGS_RATE_2000_TO_3000()
    {
        return SAVINGS_RATE_2000_TO_3000;
    }

    public double getSAVINGS_RATE_1000_TO_2000()
    {
        return SAVINGS_RATE_1000_TO_2000;
    }

    public double getCHECKING_RATE_OVER_3000()
    {
        return CHECKING_RATE_OVER_3000;
    }

    public double getCHECKING_RATE_2000_TO_3000()
    {
        return CHECKING_RATE_2000_TO_3000;
    }

    public double getCHECKING_RATE_1000_TO_2000()
    {
        return CHECKING_RATE_1000_TO_2000;
    }

    public void setSAVINGS_RATE_OVER_3000(double SAVINGS_RATE_OVER_3000)
    {
        this.SAVINGS_RATE_OVER_3000 = SAVINGS_RATE_OVER_3000;
    }

    public void setSAVINGS_RATE_2000_TO_3000(double SAVINGS_RATE_2000_TO_3000)
    {
        this.SAVINGS_RATE_2000_TO_3000 = SAVINGS_RATE_2000_TO_3000;
    }

    public void setSAVINGS_RATE_1000_TO_2000(double SAVINGS_RATE_1000_TO_2000)
    {
        this.SAVINGS_RATE_1000_TO_2000 = SAVINGS_RATE_1000_TO_2000;
    }

    public void setCHECKING_RATE_OVER_3000(double CHECKING_RATE_OVER_3000)
    {
        this.CHECKING_RATE_OVER_3000 = CHECKING_RATE_OVER_3000;
    }

    public void setCHECKING_RATE_2000_TO_3000(double CHECKING_RATE_2000_TO_3000)
    {
        this.CHECKING_RATE_2000_TO_3000 = CHECKING_RATE_2000_TO_3000;
    }

    public void setCHECKING_RATE_1000_TO_2000(double CHECKING_RATE_1000_TO_2000)
    {
        this.CHECKING_RATE_1000_TO_2000 = CHECKING_RATE_1000_TO_2000;
    }

    public DateTime getLastInterestDateTime()
    {
        return lastInterestDateTime;
    }

    public void setLastInterestDateTime(DateTime LastInterestDateTime)
    {
        this.lastInterestDateTime = LastInterestDateTime;
    }

    public static int getSIZE()
    {
        return SIZE;
    }

}
