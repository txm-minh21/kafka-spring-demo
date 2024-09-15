package com.example.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "txm")
    public void consumerMsg(String msg) {
        log.info(String.format("Consuming the message from txm Topic:: %s", msg));
    }
}
