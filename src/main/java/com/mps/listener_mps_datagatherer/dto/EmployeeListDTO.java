package com.mps.listener_mps_datagatherer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeListDTO {
    private List<EmployeeDTO> employees;
}
