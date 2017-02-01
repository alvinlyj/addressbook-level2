package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Block;
import seedu.addressbook.data.person.Street;
import seedu.addressbook.data.person.Unit;
import seedu.addressbook.data.person.PostalCode;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "a/123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person address entered in the following format a/BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+, .+, .+, .+";
    public static final String ADDRESS_SPLIT_DELIMITERS = ", ";
    public static final int ADDRESS_SPLIT_BLOCK_INDEX = 0;
    public static final int ADDRESS_SPLIT_STREET_INDEX = 1;
    public static final int ADDRESS_SPLIT_UNIT_INDEX = 2;
    public static final int ADDRESS_SPLIT_POSTALCODE_INDEX = 3;

    public final String value;
    private boolean isPrivate;

    public final Block block;
    public final Street street;
    public final Unit unit;
    public final PostalCode postalcode;
    
    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] splitAddress = trimmedAddress.split(ADDRESS_SPLIT_DELIMITERS);
        
        block = new Block(splitAddress[ADDRESS_SPLIT_BLOCK_INDEX].trim());
        street = new Street(splitAddress[ADDRESS_SPLIT_STREET_INDEX].trim());
        unit = new Unit(splitAddress[ADDRESS_SPLIT_UNIT_INDEX].trim());
        postalcode = new PostalCode(splitAddress[ADDRESS_SPLIT_POSTALCODE_INDEX].trim());
        
        this.value = trimmedAddress;
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
