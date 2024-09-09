package br.com.weswerikis.api_crud_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.weswerikis.api_crud_employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
