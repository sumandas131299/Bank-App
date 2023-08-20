import java.security.PrivateKey;
import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{


    private String name;
    private String accountNo;
    private String password;
    private double balance;
    final double rateOfInterest = 8.1;
    final String IFSCCode = "HDFC0123456789";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    //default constructor
    public HDFCAccount() {
    }
    // parameterised constructor
    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        //UUID is a ramdom no. generator and as it returns UUID ,
        // we are using String.valueOf;

        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    @Override
    public String fetchBalance(String Password) {

        if(this.password.equals(password)){
            return ("Your Balanceis : " + this.balance );
        }

        return "Incorrect Password";
    }

    @Override
    public String addMoney(double amount) {
        this.balance+= amount;
        return "Amount added successfully . New Balance is : " + this.balance;
    }

    @Override
    public String WithdrawMoney(double amount, String password) {
        if(this.password.equals(password)){
            if(this.balance < amount){
                return "Insufficient Balance";
            }
            this.balance-= amount;
            return "Amount deducted successfully. New Balance : " + this.balance;
        }
        return "Incorrect Password";
    }

    @Override
    public String ChangePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return  "Password changed successfully";
        }
        return "Incorrect original password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance * year * rateOfInterest)/100;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
