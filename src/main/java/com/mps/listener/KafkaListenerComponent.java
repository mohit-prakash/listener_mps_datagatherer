package com.mps.listener;

import com.mps.dto.EmployeeListDTO;
import com.mps.store.MessageStorer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListenerComponent {
    @Autowired
    private MessageStorer messageStorer;
    @KafkaListener(topics = "firstTopic",groupId = "group-1")
    public void getData(EmployeeListDTO employeeListDTO){
        employeeListDTO.getEmployees().stream().forEach(employeeDTO -> messageStorer.setDTO(employeeDTO));
    }

    public EmployeeListDTO getAllDTO(){
        return messageStorer.getAllDTO();
    }
}