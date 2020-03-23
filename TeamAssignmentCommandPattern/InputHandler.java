package TeamAssignmentCommandPattern;

import java.util.HashMap;
import java.util.stream.Stream;
public class InputHandler implements Command {

	HashMap<String, Command> commands;
	
	public InputHandler (Document document) {
		commands.put("load" , LoadCommand);
		commands.put("save", SaveCommand);
		commands.put("spell" , SpellCommand);
		commands.put("print" , PrintCommand);
	}
	public void inputEntered (String str) {
		// call execute method from the map's value index whose key is string from parameter somehow?
		commands.get(str);
	}
}
