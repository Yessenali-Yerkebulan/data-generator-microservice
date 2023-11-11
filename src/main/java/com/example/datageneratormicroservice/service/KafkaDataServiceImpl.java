package com.example.datageneratormicroservice.service;

import com.example.datageneratormicroservice.model.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.kafka.sender.KafkaSender;

@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService{

    private final KafkaSender<String, Object> sender;
    @Override
    public void send(Info info){

    }
}
