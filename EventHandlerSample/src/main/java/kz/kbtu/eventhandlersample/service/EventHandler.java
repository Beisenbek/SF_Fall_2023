package kz.kbtu.eventhandlersample.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
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
    @Async
    void  process(PrinterPrintedEvent event) throws InterruptedException {
        Thread.sleep(10000);
        log.info(event.toString() + Thread.currentThread().getName());
    }
}
