package com.knoldus.hibernate.example;

import com.knoldus.hibernate.example.model.Tenant;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.knoldus.hibernate.example.model.Apartment;

public class HibernateExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Tenant tenant = new Tenant();
		Apartment apartment = new Apartment();
		tenant.setApartment(apartment);
		List<Tenant> tenants = new ArrayList<Tenant>();
		tenants.add(tenant);
		apartment.setTenants(tenants);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(apartment);
		session.getTransaction().commit();
		
		session.close();
	}

}
