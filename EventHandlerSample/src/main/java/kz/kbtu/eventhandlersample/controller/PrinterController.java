package kz.kbtu.eventhandlersample.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import kz.kbtu.eventhandlersample.service.PrinterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PrinterController {
    private  final PrinterService printerService;
    @GetMapping("/print")
    String print(@RequestParam String message) throws JsonProcessingException {
        return printerService.print(message);
    }
}
