package org.toto.service;

import javax.ejb.Stateless;

import org.springframework.beans.factory.annotation.Autowired;
import org.toto.ITagada;

@Stateless
public class Pouet implements IPouet{

	@Autowired
	private ITagada tagada;

	public String nada() {
		return tagada.tsoin();
	}
	
	
}
