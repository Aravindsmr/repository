/**
 * 
 */
package com.greatlearning.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.greatlearning.entity.Employee;

/**
 * @author Aravind
 *
 */

public interface EmployeeService {

	public List<Employee> findAll();
	public List<Employee> findAllByOrderByFirstNameAsc();
	public List<Employee> findAllByOrderByFirstNameDesc();
	public List<Employee> findByFirstName(String firstName);
	public Employee findById(int id);
	public void save(Employee employee);
	public void deleteById(int id);
	
}
