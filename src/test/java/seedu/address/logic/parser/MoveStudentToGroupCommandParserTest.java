package seedu.address.logic.parser;

import static seedu.address.logic.commands.CommandTestUtil.HELP_OPTION;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GROUP_DIR_PREAMBLE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_STUDENT_DIR_PREAMBLE;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.model.path.AbsolutePath.ROOT_PATH;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.CommandTestUtil;
import seedu.address.logic.commands.MoveStudentToGroupCommand;

public class MoveStudentToGroupCommandParserTest {
    private MoveStudentToGroupCommandParser parser = new MoveStudentToGroupCommandParser();

    @Test
    public void parse_allFieldsPresent_success() {
        assertParseSuccess(parser,
                VALID_STUDENT_DIR_PREAMBLE + " " + VALID_GROUP_DIR_PREAMBLE,
                CommandTestUtil.getValidRootAbsolutePath(),
                new MoveStudentToGroupCommand(
                        CommandTestUtil.getValidStudentAbsolutePath(),
                        CommandTestUtil.getValidGroupAbsolutePath()));
    }

    @Test
    public void parse_help_returnsHelpMessage() {
        // help option only
        assertParseSuccess(parser,
                HELP_OPTION,
                ROOT_PATH,
                MoveStudentToGroupCommand.HELP_MESSAGE);

        // valid path with help option
        assertParseSuccess(parser,
                "grp-001" + HELP_OPTION,
                ROOT_PATH,
                MoveStudentToGroupCommand.HELP_MESSAGE);

        // invalid path with help option
        assertParseSuccess(parser,
                "0001Y" + HELP_OPTION,
                ROOT_PATH,
                MoveStudentToGroupCommand.HELP_MESSAGE);
    }
}
