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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentMapperTest {

	protected static final Log log = LogFactory.getLog(DepartmentMapperTest.class);

	@Autowired
	private DepartmentMapper mapper;

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test01SelectDepartmentAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Department> list = mapper.selectDepartmentAll();
		Assert.assertNotNull(list);
		list.forEach(employee -> log.debug(employee.toString()));
	}

	@Test
	public void test02SelectDepartmentByNo() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department selectNo = mapper.selectDepartmentByNo(1);
		Assert.assertNotNull(selectNo);
		log.debug(selectNo.toString());
	}

	@Test
	public void test03InsertDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department inDepartment = new Department(5, "인사", 6);
		int res = mapper.insertDepartment(inDepartment);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04UpdateDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department upDepartment = new Department(5, "시설", 1);
		int res = mapper.updateDepartment(upDepartment);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test05DeleteDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department deDepartment = new Department(5);
		int res = mapper.deleteDepartment(deDepartment);
		Assert.assertEquals(1, res);
	}

}
