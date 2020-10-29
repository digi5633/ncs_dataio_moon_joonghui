package ncs_dataio_moon_joonghui.mapper;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ncs_dataio_moon_joonghui.config.ContextRoot;
import ncs_dataio_moon_joonghui.dto.Department;
import ncs_dataio_moon_joonghui.dto.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeMapperTest {

	protected static final Log log = LogFactory.getLog(EmployeeMapperTest.class);

	@Autowired
	private EmployeeMapper mapper;

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test01SelectEmployeeAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Employee> list = mapper.selectEmployeeAll();
		Assert.assertNotNull(list);
		list.forEach(employee -> log.debug(employee.toString()));
	}

	@Test
	public void test02SelectEmployeeByNo() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee selectNo = mapper.selectEmployeeByNo(4377);
		Assert.assertNotNull(selectNo);
		log.debug(selectNo.toString());
	}

	@Test
	public void test03InsertEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee inEmployee = new Employee(1004, "이유영", "과장", new Employee(4377), 4100000, new Department(1));
		int res = mapper.insertEmployee(inEmployee);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04UpdateEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee upEmployee = new Employee(1004, "영유이", "대리", new Employee(1003), 3100000, new Department(2));
		int res = mapper.updateEmployee(upEmployee);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test05DeleteEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee deEmployee = new Employee(1004);
		int res = mapper.deleteEmployee(deEmployee);
		Assert.assertEquals(1, res);
	}

}
