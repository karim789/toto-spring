package org.toto.service;

import javax.ejb.Stateless;

@Stateless(mappedName="truccc",name="truccc")
public class Truc implements ITruc {

	public Truc() {
		System.out.println("public org.toto.service.Truc()");
	}

	public void muche() {
		System.out.println("truc.muche()");
	}

}
