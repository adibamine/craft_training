package ma.awb;

import java.util.ArrayList;
import java.util.List;

public class WithdrawalService {

    public static final double ADMINISTRATIVE_EXPENSES_CHARGE = 25.00;

    public void debitAccounts() {

        BankAccount basiAcct = new BasicAccount();
        basiAcct.deposit(100.00);

        BankAccount premiumAcct = new PremiumAccount();
        premiumAcct.deposit(200.00);

        List<BankAccount> accounts = new ArrayList();

        accounts.add(basiAcct);
        accounts.add(premiumAcct);

        debitAdministrativeExpenses(accounts);

    }

    private void debitAdministrativeExpenses(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            if (account instanceof LongTermAccount)
                continue;
            else
                account.withdraw(ADMINISTRATIVE_EXPENSES_CHARGE);
        }
    }
}