import com.demo.*;
import com.demo.interfaces.*;

public class Main {
    public static void main(String[] args) {

        CreditCard creditCard= new HdfcCreditCard("3212 4324 432", 300000000);
        BankAccount bankAccount= new HdfcBankAccount("fdas43r", 423123434);

        BankAccount cardAdapter= new CardAdapter(creditCard);

        System.out.println( creditCard.getCardLimit() );
        System.out.println( bankAccount.getAccountNumber() );
        System.out.println( cardAdapter.getAccountNumber() );
    }
}