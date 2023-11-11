package com.example.datageneratormicroservice.service;

import com.example.datageneratormicroservice.model.Info;

public interface KafkaDataService {
    void send(Info info);
}
