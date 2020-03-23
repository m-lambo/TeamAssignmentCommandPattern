package TeamAssignmentCommandPattern;

public class LoadCommand implements Command {
	public Document document;
	
	public LoadCommand (Document document) {
		this.document = document;
	}
	public void execute() {
		document.load();
	}
}
