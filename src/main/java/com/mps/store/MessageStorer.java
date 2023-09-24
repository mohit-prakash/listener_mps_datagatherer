package com.mps.store;

import com.mps.dto.EmployeeDTO;
import com.mps.dto.EmployeeListDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageStorer {
    List<EmployeeDTO> list = new ArrayList<>();

    public void setDTO(EmployeeDTO employeeDTO){
        list.add(employeeDTO);
    }

    public EmployeeListDTO getAllDTO(){
        EmployeeListDTO employeeListDTO = new EmployeeListDTO(list);
        return employeeListDTO;
    }
}
