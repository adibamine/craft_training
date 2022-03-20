package ma.awb;

import java.util.ArrayList;
import java.util.List;

public class WithdrawalService {

    public static final double ADMINISTRATIVE_EXPENSES_CHARGE = 25.00;

    public void debitAccounts() {

        WithdrawableAccount basiAcct = new BasicAccount();
        basiAcct.deposit(100.00);

        WithdrawableAccount premiumAcct = new PremiumAccount();
        premiumAcct.deposit(200.00);

        List<WithdrawableAccount> accounts = new ArrayList();

        accounts.add(basiAcct);
        accounts.add(premiumAcct);

        debitAdministrativeExpenses(accounts);

    }

    private void debitAdministrativeExpenses(List<WithdrawableAccount> accounts) {
        accounts.stream()
                .forEach(account -> account.withdraw(ADMINISTRATIVE_EXPENSES_CHARGE));
    }
}