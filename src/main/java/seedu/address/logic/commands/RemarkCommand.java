package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * The RemarkCommand class represents a command for adding remarks to items in the address book.
 * It inherits from the Command class.
 */
public class RemarkCommand extends Command {

    /**
     * The constant representing the command word for the RemarkCommand.
     */
    public static final String COMMAND_WORD = "remark";

    /**
     * Executes the RemarkCommand to perform an action related to adding remarks.
     *
     * @param model The model on which the command should operate.
     * @return A CommandResult containing a message indicating that the RemarkCommand has been executed.
     */
    @Override
    public CommandResult execute(Model model) {
        return new CommandResult("Hello from remark");
    }
}
