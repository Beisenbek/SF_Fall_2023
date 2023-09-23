package kz.kbtu.eventhandlersample.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class EventHandler {
    @EventListener
    void  process(String event) throws InterruptedException {
        Thread t = new Thread(new PrinterThread());
        t.start();
    }

    @EventListener
    void  process(PrinterPrintedEvent event) throws InterruptedException {
        log.info(event.toString());
    }
}
