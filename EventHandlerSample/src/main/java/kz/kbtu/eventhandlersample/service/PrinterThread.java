package kz.kbtu.eventhandlersample.service;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrinterThread implements Runnable{
    @Override
    public void run() {
      log.info("printer thread start");
      log.info(Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("printer thread end");
    }
}
