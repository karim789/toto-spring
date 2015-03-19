package org.toto.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.toto.App;
import org.toto.dao.ADao;

@Stateless
public class AServiceImpl implements AService {
	
	@EJB
	private ADao aDao;
	
	/* (non-Javadoc)
	 * @see org.toto.service.AService#doToto()
	 */
	public void doToto() {
		System.out.println(aDao.getString());
	}

	public void setaDao(ADao aDao) {
		this.aDao = aDao;
	}
	
	
}
