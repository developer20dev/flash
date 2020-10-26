package com.cp.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cp.pojo.EmployeePojo;
import com.cp.repository.EmployeeRepository;

@Repository("employeeRepository")
public class EMployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public EmployeePojo createUser(EmployeePojo pojo) {

		String query = "insert into example(id,firstName,lastName,contact,address) values(?,?,?,?,?)";
		jdbcTemplate.update(query, new Object[] { pojo.getId(), pojo.getFirstName(), pojo.getLastName(),
				pojo.getContact(), pojo.getAddress() });
		return pojo;

	}

}
