package kz.kbtu.basicws.service;

import kz.kbtu.basicws.model.BWPrinter;
import kz.kbtu.basicws.model.ColorPrinter;
import kz.kbtu.basicws.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrinterService {
    @Autowired
    private Printer printer;
    public PrinterService() {

    }
    public String print( String message) {
        if(message.contains("color")){
            printer.setup(new ColorPrinter());
        }else{
            printer.setup(new BWPrinter());
        }
        return printer.print(message);
    }
    public String print2( String message) {
        return printer.print(message);
    }
}
