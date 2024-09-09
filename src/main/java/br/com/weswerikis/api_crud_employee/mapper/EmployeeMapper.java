package br.com.weswerikis.api_crud_employee.mapper;

import br.com.weswerikis.api_crud_employee.dto.EmployeeDto;
import br.com.weswerikis.api_crud_employee.entity.Employee;

public class EmployeeMapper {
    
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
            employeeDto.getId(),
            employeeDto.getFisrtName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
        );
    }

}
