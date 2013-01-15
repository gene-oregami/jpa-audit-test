package org.oregami.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.oregami.jpa.IFirstEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
public class TestSaveEntity {

	@Autowired
	private IFirstEntityRepository firstEntityRepository;
	
	@BeforeClass
	public static void init() {
		DBHelper.startHSQLDb();
	}
	
	@Test
	public void testSaveEntity() {
		System.out.println("firstEntityRepository: " + firstEntityRepository);
	}
}
