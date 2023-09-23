package kz.kbtu.eventhandlersample.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class PrinterService {
    private final ApplicationEventPublisher eventPublisher;

    public String print(String message) throws JsonProcessingException {
        log.info("printer service:" + message);
        log.info(Thread.currentThread().getName());
        PrinterPrintedEvent event = new PrinterPrintedEvent();
        event.setEmittedDate(LocalDateTime.now());
        event.setAggregateObjectType("Printer");
        event.setAggregateObjectId(UUID.randomUUID().toString());
        ObjectMapper mapper = new ObjectMapper();
        event.setMessagePayload(mapper.writeValueAsString(message));
        eventPublisher.publishEvent(event);
        return message;
    }
}
