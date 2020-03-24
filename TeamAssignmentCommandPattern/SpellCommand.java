package TeamAssignmentCommandPattern;

public class SpellCommand implements Command {
    public Document document;

    /** public SpellCommand(Document document)
     * Sets document to given document
     * @param document
     */
    public SpellCommand (Document document) {
        this.document = document;
    }
    
    /** public void execute()
     * Calls spell command in Document
     */
    public void execute() {
        document.spell();
    }
}
