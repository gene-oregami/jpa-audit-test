package org.oregami.entities;

import javax.persistence.Entity;

@Entity
public class FirstEntity extends BaseEntity {

	private String stringField ;

	public String getStringField() {
		return stringField;
	}

	public void setStringField(String stringField) {
		this.stringField = stringField;
	}
	
	
}
