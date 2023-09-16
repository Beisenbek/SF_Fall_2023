package kz.kbtu.basicws.model;

public class Printer {
    private IPrintable printable;

    public Printer() {
    }

    public void setup(IPrintable printable) {
        this.printable = printable;
    }


    public String print(String text) {
        return printable.print(text);
    }
}
