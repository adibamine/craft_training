package ma.awb;

public class AlphaPrinter implements AllInOneScanning,
        AllInOneFaxing,
        AllInOnePrinting {

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
        //Logic for faxing
        return true;
    }

}