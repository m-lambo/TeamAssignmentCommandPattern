package TeamAssignmentCommandPattern;

public class SaveCommand implements Command {
	public Document document;
	
	/** public SaveCommand(Document doc)
	 * Sets document to given document
	 * @param doc
	 */
	public SaveCommand(Document document) {
		this.document = document;
	}
	
	/** public void execute()
	 * Calls save command in Document
	 */
	public void execute() {
		document.save();
	}
}
