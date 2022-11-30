package com.knoldus.hibernate.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ApartmentID",unique = true, nullable = false)
    public int apartmentID;

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    private List<Tenant> tenants;
    
    public Apartment() {
	}
    
    public Apartment(int id) {
    	this.apartmentID = id;
	}
    
    public void setApartmentID(int apartmentID) {
		this.apartmentID = apartmentID;
	}
    
    public int getApartmentID() {
		return apartmentID;
	}
    
    public void setTenants(List<Tenant> tenants) {
		this.tenants = tenants;
	}
    
    public List<Tenant> getTenants() {
		return tenants;
	}
}
