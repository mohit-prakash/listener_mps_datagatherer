//package com.mps.listener_mps_datagatherer.service;
//
//import com.mps.listener_mps_datagatherer.dto.EmployeeListDTO;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//public class CatchDataService {
//
//    @KafkaListener(topics = "firstTopic",groupId = "group-1")
//    public void getData(EmployeeListDTO employeeListDTO){
//        employeeListDTO.getEmployees().stream().forEach(emp->{
//            log.info("First Name: "+emp.getFirstName());
//            log.info("Last Name: "+emp.getLastName());
//            log.info("Email: "+emp.getEmail());
//        });
//    }
//}
