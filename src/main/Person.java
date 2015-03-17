package main;

public class Person {
	
	private String name;
	private String address;
	private int phone_number;
	private String email;
	
	public Person(){
		
	}
	public Person(String Name, String Address, int Phone_Number, String Email){
		name = Name;
		address = Address;
		phone_number = Phone_Number;
		email = Email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString(){
		return "Name :"+getName();
	}
	
}
