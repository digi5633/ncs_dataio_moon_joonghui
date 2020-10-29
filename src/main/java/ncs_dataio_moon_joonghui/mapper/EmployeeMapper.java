package ncs_dataio_moon_joonghui.mapper;

import java.util.List;

import ncs_dataio_moon_joonghui.dto.Employee;

public interface EmployeeMapper {

	List<Employee> selectEmployeeAll();

	Employee selectEmployeeByNo(int empNo);

	int insertEmployee(Employee employee);

	int updateEmployee(Employee employee);

	int deleteEmployee(Employee employee);

}
