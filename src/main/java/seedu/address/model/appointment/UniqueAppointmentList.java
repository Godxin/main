package seedu.address.model.appointment;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import seedu.address.commons.util.CollectionUtil;
import seedu.address.model.person.exceptions.DuplicateAppointmentException;
import seedu.address.model.person.exceptions.AppointmentNotFoundException;

/**
 * A list of appointments that enforces uniqueness between its elements and does not allow nulls.
 *
 * Supports a minimal set of list operations.
 *
 * @see Appointment#equals(Object)
 * @see CollectionUtil#elementsAreUnique(Collection)
 */
public class UniqueAppointmentList implements Iterable<Appointment> {
    private final ObservableList<Appointment> internalList = FXCollections.observableArrayList();

    /**
     * Returns true if the list contains an appointment with the same date and time as the given argument.
     */
    public boolean contains(Appointment toCheck) {
        requireNonNull(toCheck);
        return internalList.contains(toCheck);
    }
}
