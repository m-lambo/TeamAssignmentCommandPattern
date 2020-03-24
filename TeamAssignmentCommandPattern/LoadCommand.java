package TeamAssignmentCommandPattern;

public class LoadCommand implements Command {
	public Document document;
	
	/** public LoadCommand(Document doc)
	 * Sets document to given document
	 * @param doc : Given document
	 */
	public LoadCommand (Document doc) {
		this.document = doc;
	}
	
	/** public void execute()
	 * Calls load command in Document
	 */
	public void execute() {
		document.load();
	}
}
