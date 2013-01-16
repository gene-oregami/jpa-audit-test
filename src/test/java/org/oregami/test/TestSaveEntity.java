package org.oregami.test;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.oregami.entities.FirstEntity;
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
		Assert.assertNotNull(firstEntityRepository);
		
		FirstEntity entity = new FirstEntity();
		entity.setStringField("one");
		firstEntityRepository.save(entity);

		FirstEntity entity2 = new FirstEntity();
		entity2.setStringField("two");
		firstEntityRepository.save(entity2);
		
		
		Iterator<FirstEntity> iterator = firstEntityRepository.findAll().iterator();
		while (iterator.hasNext()) {
			FirstEntity e = (FirstEntity) iterator.next();
			System.out.println("found entity: " + e.getStringField());
		}
		
		Assert.assertEquals(2L, firstEntityRepository.count());
		
	}
}
