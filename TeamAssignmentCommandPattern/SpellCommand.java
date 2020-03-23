package TeamAssignmentCommandPattern;

public class SpellCommand implements Command {
    public Document document;

    public SpellCommand (Document document) {
        this.document = document;
    }
    public void execute() {
        document.spellCheck();
    }
}
