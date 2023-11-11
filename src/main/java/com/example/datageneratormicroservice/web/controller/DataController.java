package com.example.datageneratormicroservice.web.controller;


import com.example.datageneratormicroservice.model.Info;
import com.example.datageneratormicroservice.service.KafkaDataService;
import com.example.datageneratormicroservice.web.dto.InfoDto;
import com.example.datageneratormicroservice.web.mapper.DataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {
    private final KafkaDataService kafkaDataService;

    private final DataMapper dataMapper;

    @PostMapping("/send")
    public void send(@RequestBody InfoDto dto){
        Info  info = dataMapper.toEntity(dto);
        kafkaDataService.send(info);
    }
}
