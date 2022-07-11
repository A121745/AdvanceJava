package com.cdac.component;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Component("carParts3")
public class CarPartsInventoryImpl3 implements CarPartsInventory {

	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional
	public void addNewPart(CarPart carPart) {
		// TODO Auto-generated method stub
		em.persist(carPart);

	}

	@Override
	public List<CarPart> getAvailableParts() {
		// TODO Auto-generated method stub
		return em
				.createQuery("select c from CarPart c", CarPart.class)
				.getResultList();
	}

}
