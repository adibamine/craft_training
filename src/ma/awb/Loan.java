package ma.awb;

public interface Loan extends Payment {
    void intiateLoanSettlement();
    void initiateRePayment();
}