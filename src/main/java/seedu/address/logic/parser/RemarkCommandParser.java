package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_REMARK;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.commands.RemarkCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Remark;

/**
 * The RemarkCommandParser class is responsible for parsing user input into a RemarkCommand.
 * It implements the Parser interface with a type parameter of RemarkCommand.
 * This class specifically handles parsing for the "remark" command.
 */
public class RemarkCommandParser implements Parser<RemarkCommand> {

    /**
     * Parses user input into a RemarkCommand.
     *
     * @param args The user input as a string.
     * @return A RemarkCommand object if the input is valid.
     * @throws ParseException If the input does not match the expected format or if there are parsing errors.
     */
    public RemarkCommand parse(String args) throws ParseException {
        // Ensure the input is not null
        requireNonNull(args);
        // Tokenize the input and handle the "remark" prefix
        ArgumentMultimap argMultimap = ArgumentTokenizer.tokenize(args, PREFIX_REMARK);
        Index index;

        try {
            // Parse the index from the preamble of the input
            index = ParserUtil.parseIndex(argMultimap.getPreamble());
        } catch (IllegalValueException ive) {
            // Throw a ParseException if there are parsing errors
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, RemarkCommand.MESSAGE_USAGE), ive);
        }
        // Extract the remark from the input using the "r/" prefix
        String remarkStr = argMultimap.getValue(PREFIX_REMARK).orElse("");
        Remark remark = new Remark(remarkStr);
        return new RemarkCommand(index, remark);
    }
}
