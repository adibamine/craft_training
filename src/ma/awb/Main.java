package ma.awb;

public class Main {

    public static void main(String[] args) {
        Book harryPotter = new Book(
                "Harry Potter",
                "J.K Rowling",
                19999,
                200,
                "1402894627"
        );
        Invoice invoice = new Invoice(
                harryPotter,
                3,
                0,
                Double.valueOf("0.03")
        );
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.print();
    }
}
