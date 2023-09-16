package kz.kbtu.basicws.controller;

import kz.kbtu.basicws.model.Greeting;
import kz.kbtu.basicws.service.PrinterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequiredArgsConstructor
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final PrinterService printerService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("")
    public String test(){
        return "it's works!";
    }

    @GetMapping("/print")
    public String print(@RequestParam String message) {
        return printerService.print(message);
    }
    @GetMapping("/print2")
    public String print2(@RequestParam String message) {
        return printerService.print2(message);
    }

}

