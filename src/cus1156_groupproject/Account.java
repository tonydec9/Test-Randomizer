package cus1156_groupproject;
import java.sql.Date;

public class Account {
	private String firstName, lastName, phoneNumber, address, email;
	private Date dateofbirth;
	
	
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateofBirth() {
		return dateofbirth;
	}
	public void setDateofBirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	
	
	
	//Professor class
	
	public class Professor extends Account{
		
		}
	
	//Student class
	
	public class Student {
		
	}
	
	
	//view
	public class AccountView{
		public void displayActDetails(String firstName, String lastName, String phoneNumber, String address, String email, Date dateofbirth) {
				System.out.println("Account Name: "+firstName+ " "+lastName);
				System.out.println("Date of Birth: "+dateofbirth);
				System.out.println("Phone Number associated with account: "+phoneNumber);
				System.out.println("Address associated with account: "+address);
				System.out.println("Email associated with account: "+email);
		}
		
		
		//public void displayMenu1() {
			
		
		
		
		
	}
}
