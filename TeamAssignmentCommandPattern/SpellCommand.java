package TeamAssignmentCommandPattern;

public class SpellCommand implements Command {
    public Document document;

    /** public SpellCommand(Document doc)
     * Sets document to given document
     * @param doc
     */
    public SpellCommand (Document doc) {
        this.document = doc;
    }
    
    /** public void execute()
     * Calls spell command in Document
     */
    public void execute() {
        document.spell();
    }
}
