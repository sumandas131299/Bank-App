public interface BankAccountInterface {

    String fetchBalance (String Password);

    String addMoney(double amount);

    String WithdrawMoney(double amount,String password);


    String ChangePassword(String oldPassword , String newPassword);

    double calculateInterest(int year);

}
