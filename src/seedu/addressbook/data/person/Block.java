package seedu.addressbook.data.person;

public class Block {
	
	private String block;

	public Block(String block) {
		this.block = block;
	}

	public String getAddressBlock() {
		return block;
	}
	
	public void setAddressBlock(String newBlock) {
		block = newBlock;
	}

}
