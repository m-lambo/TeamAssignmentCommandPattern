package TeamAssignmentCommandPattern;

public class PrintCommand implements Command{
	public Document document;
	
	/** public PrintCommand(Document doc)
	 * Sets document to given document
	 * @param doc : given Document
	 */
	public PrintCommand(Document doc) {
		this.document = doc;
	}
	
	/** public void execute()
	 * Calls print command in Document
	 */
	public void execute() {
		document.print();
	}
}
