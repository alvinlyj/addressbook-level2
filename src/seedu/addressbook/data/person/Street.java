package seedu.addressbook.data.person;

public class Street {
	
	private String street;
	
	public Street(String street) {
		this.street = street;
	}

	public String getStreet(){
		return street;
	}
	
	public void setStreet(String newStreet){
		street = newStreet;
	}

}
