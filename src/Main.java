
public class Main {
    public static void main(String[] args) {

        HDFCAccount SumanAcc = new HDFCAccount("Suman Das","Suman123",2000);
        System.out.println(SumanAcc);// printing attributes with to string

        //fetching Balance
        System.out.println(SumanAcc.fetchBalance("random"));//incorrect password
        System.out.println(SumanAcc.fetchBalance("Suman123"));

         //adding money
        System.out.println(SumanAcc.addMoney(100000));

        //Withdraw money
        System.out.println(SumanAcc.WithdrawMoney(20000,"Suman123"));
        System.out.println(SumanAcc.WithdrawMoney(5000,"Suman1")); //incorrect
        System.out.println(SumanAcc.WithdrawMoney(40000,"Suman123"));

        //ChangePassword

        System.out.println(SumanAcc.ChangePassword("Suman13","SumanDas")); //incorrect
        System.out.println(SumanAcc.ChangePassword("Suman123","SumanDas"));
        System.out.println(SumanAcc.fetchBalance("SumanDas"));

        //rateOfIntrest
        System.out.println("Rate of interest in after 5 years "+ SumanAcc.calculateInterest(5));
        System.out.println(SumanAcc);
    }
}