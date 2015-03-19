package org.toto.dao;

import javax.ejb.Stateless;

@Stateless
public class ADaoImpl implements ADao {

	public String getString() {
		return "coucou c'est toto";
	}

}
