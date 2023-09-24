package com.mps.controller;

import com.mps.dto.EmployeeListDTO;
import com.mps.listener.KafkaListenerComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listen")
public class ListenerController {
    @Autowired
    private KafkaListenerComponent kafkaListenerComponent;
    @GetMapping("/get")
    public ResponseEntity<EmployeeListDTO> getEmpListDto(){
        return new ResponseEntity<>(kafkaListenerComponent.getAllDTO(), HttpStatus.OK);
    }
}
