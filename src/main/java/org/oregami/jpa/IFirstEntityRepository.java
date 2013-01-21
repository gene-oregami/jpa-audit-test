package org.oregami.jpa;

import org.hsqldb.rights.User;
import org.oregami.entities.FirstEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.history.RevisionRepository;


/**
 * Simple repository interface for {@link User} instances. 
 * The interface is used to declare so called query methods,
 * methods to retrieve single entities or collections of them.
 */
public interface IFirstEntityRepository 
extends CrudRepository<FirstEntity, Long>
 , RevisionRepository<User, Long, Integer> 
	{

	
}
