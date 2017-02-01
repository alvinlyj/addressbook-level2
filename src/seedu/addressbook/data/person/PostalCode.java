package seedu.addressbook.data.person;

public class PostalCode {

	private String postalcode;
	
	public PostalCode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getPostalcode() {
		return postalcode;
	}
	
	public void setPostalcode(String newPostalcode) {
		postalcode = newPostalcode;
	}
}
