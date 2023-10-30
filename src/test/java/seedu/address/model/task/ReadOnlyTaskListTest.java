package seedu.address.model.task;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.TypicalTasks.TASK_LIST_1;
import static seedu.address.testutil.TypicalTasks.TASK_LIST_2;

import org.junit.jupiter.api.Test;
import seedu.address.model.task.exceptions.NoSuchTaskException;

public class ReadOnlyTaskListTest {

    private ReadOnlyTaskList taskList1 = TASK_LIST_1;
    private ReadOnlyTaskList taskList2 = TASK_LIST_2;
    @Test
    public void isValidIndex_validIndices() {
        assertTrue(taskList1.isValidIndex(1));
    }

    @Test
    public void verifyIsValidIndex_throwsNoSuchTaskException() {
        assertThrows(NoSuchTaskException.class, () -> taskList1.verifyIsValidIndex(0));
    }

    @Test
    public void equals_sameTaskList() {
        ReadOnlyTaskList taskListCopy = TASK_LIST_1;
        assertEquals(taskList1, taskListCopy);
    }

    @Test
    public void equals_differentTaskLists() {
        assertNotEquals(taskList1, taskList2);
    }

    @Test
    public void toString_ReturnsTrue() {
        String expected = "[[D][ ] Assignment 1(by: 2023-11-15 10:00)," +
                " [D][ ] Assignment 2(by: 2023-11-20 15:30)," +
                " [D][ ] Project Presentation(by: 2023-12-05 14:00)," +
                " [T][ ] Quiz 1," +
                " [T][ ] Homework 2," +
                " [T][ ] Research Paper]";
        assertEquals(taskList1.toString(), expected);
    }
}
