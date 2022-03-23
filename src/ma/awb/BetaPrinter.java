package ma.awb;

public class BetaPrinter implements AllInOnePrinter {

    @Override
    public boolean print() {
        //Logic for printing
        return true;
    }

    @Override
    public boolean scan() {
        //Logic for scanning
        return true;
    }

    @Override
    public boolean fax() {
        throw new UnsupportedOperationException("Faxing not supported.");
    }

}