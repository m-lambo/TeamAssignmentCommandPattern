package TeamAssignmentCommandPattern;

public class LoadCommand implements Command {
	public Document document;
	
	/** public LoadCommand(Document document)
	 * Sets document to given document
	 * @param document
	 */
	public LoadCommand (Document document) {
		this.document = document;
	}
	
	/** public void execute()
	 * Calls load command in Document
	 */
	public void execute() {
		document.load();
	}
}
