package kz.kbtu.eventhandlersample.service;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PrinterPrintedEvent {
    String aggregateObjectType;
    String aggregateObjectId;
    String messagePayload;
    LocalDateTime emittedDate;
}
