package TeamAssignmentCommandPattern;

import java.util.HashMap;
import java.util.stream.Stream;
public class InputHandler {

	HashMap<String, Command> commands;
	
	public InputHandler (Document document) {
		commands = new HashMap<String, Command>();
		commands.put("load" , new LoadCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("spell" , new SpellCommand(document));
		//commands.put("print" , new PrintCommand(document));
	}
	public void inputEntered (String str) {
		// call execute method from the map's value index whose key is string from parameter somehow?
		if(commands.containsKey(str)) {
			Command runComm = commands.get(str);
			runComm.execute();
		}
	}
}
