package com.TuljaBhavaniWorld.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Request_Price")
public class RequestPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productCategory;
	private String productName;
	private Integer quantity;
	private String unit;
	private String name;
	private String mobile;
	private String email;
	private String company;
	private String location;
	private String message;

	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;

	public RequestPrice() {
		// TODO Auto-generated constructor stub
	}

	public RequestPrice(Long id, String productCategory, String productName, Integer quantity, String unit, String name,
			String mobile, String email, String company, String location, String message, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.productCategory = productCategory;
		this.productName = productName;
		this.quantity = quantity;
		this.unit = unit;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.company = company;
		this.location = location;
		this.message = message;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "RequestPrice [id=" + id + ", productCategory=" + productCategory + ", productName=" + productName
				+ ", quantity=" + quantity + ", unit=" + unit + ", name=" + name + ", mobile=" + mobile + ", email="
				+ email + ", company=" + company + ", location=" + location + ", message=" + message + ", createdAt="
				+ createdAt + "]";
	}

}
