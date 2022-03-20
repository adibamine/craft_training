package ma.awb;

import java.util.List;

public interface Payment {

    //Original methods:

    void initiatePayments();

    Object status();

    List<Object> getPayments();

    //Loan payments methods:
    void intiateLoanSettlement();
    void initiateRePayment();

}
