package org.toto.service.autre;

import javax.ejb.Stateless;

import org.springframework.stereotype.Component;
import org.toto.service.ITruc;

@Stateless
public class Truc implements ITruc {

	public Truc() {
		System.out.println("public org.toto.service.autre.Truc()");
	}

	public void muche() {
		System.out.println("truc.muche()");
	}

}
