package TeamAssignmentCommandPattern;

import java.util.HashMap;
import java.util.stream.Stream;
public class InputHandler implements Command {

	HashMap<String, Command> mapForCommands;
	
	public InputHandler (Document document) {
		mapForCommands = (HashMap<String, Command>) Stream.of (new Object[][] {
				{"load" , LoadCommand}
				{"save", SaveCommand}
				{"spell" , SpellCommand}
				{"print" , PrintCommand}
		} );
	}
	public void InputEntered (String str) {
		// call execute method from the map's value index whose key is string from parameter somehow?
		if (str.contains("load")) {
		}
		else if (str.contains("save")) {
			
		}
		else if (str.contains("spell")) {
			
		}
		else
			
	}
}
