package com.knoldus.hibernate.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="TenantID",unique = true, nullable = false)
    public int tenantID;

    @ManyToOne
    @JoinColumn(name = "ApartmentID")
    private Apartment apartment;
    
    public Tenant() {
		// TODO Auto-generated constructor stub
	}
    
    public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}
    
    public Apartment getApartment() {
		return apartment;
	}
    
    public void setTenantID(int tenantID) {
		this.tenantID = tenantID;
	}
    
    public int getTenantID() {
		return tenantID;
	}
}
