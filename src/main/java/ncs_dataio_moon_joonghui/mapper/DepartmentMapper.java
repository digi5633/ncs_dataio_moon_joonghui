package ncs_dataio_moon_joonghui.mapper;

import java.util.List;

import ncs_dataio_moon_joonghui.dto.Department;

public interface DepartmentMapper {

	List<Department> selectDepartmentAll();

	Department selectDepartmentByNo(int deptNo);

	int insertDepartment(Department department);

	int updateDepartment(Department department);

	int deleteDepartment(Department department);

}
