package seedu.addressbook.data.tag;

public class Tagging {

	public final String tagging;
	
	public Tagging(String name, String tag, String action) {
		String actionSign = "";
		if (action == "Add") {
			actionSign = "+";
		} else {
			actionSign = "-";
		}
			this.tagging = actionSign + " " + name + " " + tag;
	}
	
	public String getTagging() {
		return tagging;
	}
	
}
