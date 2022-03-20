package ma.awb;

public class BetaPrinter implements AllInOneScanning, AllInOnePrinting {

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

}