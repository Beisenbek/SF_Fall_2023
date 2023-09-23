package kz.kbtu.basicws.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

public class Printer {
    @Autowired
    private IPrintable printable;

    public void setup(IPrintable printable) {
        this.printable = printable;
    }

    public String print(String text) {
        return printable.print(text);
    }

    public void setPrintable(IPrintable printable) {
        this.printable = printable;
    }
}
