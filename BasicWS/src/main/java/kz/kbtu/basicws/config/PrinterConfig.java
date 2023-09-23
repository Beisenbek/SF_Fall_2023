package kz.kbtu.basicws.config;

import kz.kbtu.basicws.model.ColorPrinter;
import kz.kbtu.basicws.model.IPrintable;
import kz.kbtu.basicws.model.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrinterConfig {
    @Bean
    public IPrintable iprintable(){
        return new ColorPrinter();
    }
    @Bean
    public Printer printer(){
        return new Printer();
    }
}
