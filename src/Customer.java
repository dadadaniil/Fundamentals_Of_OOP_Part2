import java.math.BigInteger;
import java.util.*;

public class Customer {
    private String surname, firstName, patronymic, numberOfCard, bankAccountNumber;
    private int id;

    private ArrayList<Customer> customerArrayList = new ArrayList<>();

    public Customer(String surname, String firstName, String patronymic, String numberOfCard, String bankAccountNumber, int id) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.numberOfCard = numberOfCard;
        this.bankAccountNumber = bankAccountNumber;
        this.id = id;
    }

    public void returnCustomer(String bottomBound, String topBound) {

        BigInteger bigIntegerBottom = new BigInteger(bottomBound);
        BigInteger bigIntegerTop = new BigInteger(topBound);

        for (Customer customer :
                customerArrayList) {
            BigInteger numberOfCardInteger = new BigInteger(customer.numberOfCard);

            if (numberOfCardInteger.compareTo(bigIntegerBottom) >= 0 && numberOfCardInteger.compareTo(bigIntegerTop) <= 0) {
                System.out.println(String.format("Surname: %s, firstName: %s, patronymic: %s", customer.surname, customer.firstName, customer.patronymic));
            }
        }
    }

    public void returnSortedListOfCustomers() {
        ArrayList<String> customers = new ArrayList<>();
        
        for (Customer customer :
                customerArrayList) {
            customers.add(customer.firstName + " " + customer.surname + " " + customer.patronymic);
        }
//        Check with debug what a hell is going here

        Collections.sort(customers);
        
        for (String nextOneCustomer :
                customers) {
            System.out.println(nextOneCustomer);
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer("3,", "3", "3", "233", "233", 1);
        customer.customerArrayList.add(new Customer("a", "b", "c", "1400000000000001", "tryue", 12));
        customer.customerArrayList.add(new Customer("v", "a", "sdf", "8000000003000001", "vbsdf", 12));
        customer.customerArrayList.add(new Customer("a", "c", "c", "1000000000000000", "lskdfjsi", 12));
        customer.customerArrayList.add(new Customer("a", "b", "b", "1000000000000001", "ebyt", 12));
    }
    
    

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(String numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

