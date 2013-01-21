package org.oregami.entities;

import javax.persistence.Entity;

import org.hibernate.envers.Audited;

@Entity
@Audited
public class FirstEntity extends BaseEntity {

	private String stringField ;

	public String getStringField() {
		return stringField;
	}

	public void setStringField(String stringField) {
		this.stringField = stringField;
	}
	
	
}
