package com.brightcoding.app.ws.requests;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserRequest {

	@NotBlank(message="ce champ ne doit pas etre null!")
	private String firstName;
	
	@NotBlank(message="ce champ ne doit pas etre null!")
	private String lastName;
	
	@NotNull(message="ce champ ne doit pas etre null!")
	@Email(message="ce champ doit respecte le format email!")
	private String email;
	
	@NotNull(message="ce champ ne doit pas etre null!")
	@Size(min=8,message="mot de passe doit avoir au minimum 8 caracteres!")
	@Size(max=12, message="mot de passe doit avoir au maximum 12 caracteres!")
	//@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$\r\n", message="ce mot de passe doit avoir des lettres en Maj et Minsc et numero")
	private String password;
	
	private Boolean admin;
	
	private List<AddressRequest> addresses;
	
	private ContactRequest contact;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<AddressRequest> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<AddressRequest> addresses) {
		this.addresses = addresses;
	}
	public ContactRequest getContact() {
		return contact;
	}
	public void setContact(ContactRequest contact) {
		this.contact = contact;
	}
	
	
}
