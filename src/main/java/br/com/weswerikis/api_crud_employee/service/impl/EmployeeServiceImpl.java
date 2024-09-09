package br.com.weswerikis.api_crud_employee.service.impl;

import org.springframework.stereotype.Service;

import br.com.weswerikis.api_crud_employee.dto.EmployeeDto;
import br.com.weswerikis.api_crud_employee.entity.Employee;
import br.com.weswerikis.api_crud_employee.mapper.EmployeeMapper;
import br.com.weswerikis.api_crud_employee.repository.EmployeeRepository;
import br.com.weswerikis.api_crud_employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

}
