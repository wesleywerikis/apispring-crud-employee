package br.com.weswerikis.api_crud_employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    
}
