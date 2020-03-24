package TeamAssignmentCommandPattern;

public class SaveCommand implements Command {
	public Document document;
	
	/** public SaveCommand(Document doc)
	 * Sets document to given document
	 * @param doc
	 */
	public SaveCommand(Document doc) {
		this.document = doc;
	}
	
	/** public void execute()
	 * Calls save command in Document
	 */
	public void execute() {
		document.save();
	}
}
