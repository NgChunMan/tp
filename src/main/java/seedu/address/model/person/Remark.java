package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * The Remark class represents a remark associated with a person.
 * A remark can be any additional information or note related to a person, such as their preferences or comments.
 */
public class Remark {
    /**
     * The String value representing the remark.
     */
    public final String value;

    /**
     * Constructs a Remark object with the provided remark value.
     *
     * @param remark The String value representing the remark.
     * @throws NullPointerException If the provided remark is null.
     */
    public Remark(String remark) {
        requireNonNull(remark);
        value = remark;
    }

    /**
     * Returns the String representation of the remark.
     *
     * @return The String value of the remark.
     */
    @Override
    public String toString() {
        return value;
    }

    /**
     * Checks if this Remark is equal to another object.
     *
     * @param other The object to compare with this Remark.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof Remark && value.equals(((Remark) other).value));
    }

    /**
     * Computes a hash code for this Remark.
     *
     * @return The hash code for the Remark based on its value.
     */
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
