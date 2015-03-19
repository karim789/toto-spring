package org.toto;

import org.springframework.beans.factory.annotation.Autowired;

public class Tagada implements ITagada{

	@Autowired
	Bidule bidule;

	public Tagada() {
		System.out.println("public Tagada()");
		
	}
	
	public String tsoin() {
		return "tsointsoin";
	}
}
