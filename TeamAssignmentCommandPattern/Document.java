package TeamAssignmentCommandPattern;

public class Document {
	
	public Document(String name) {
		System.out.println(name + " is created.");
	}
	public void load() {
		System.out.println("Document is loaded into view.");
	}
	public void save() {
		System.out.println("Document is being saved.");
	}
	public void spellCheck() {
		System.out.println("Document is being checked for spelling errors");
	}
	public void print() {
		System.out.println("Document is printing.");
	}
}
