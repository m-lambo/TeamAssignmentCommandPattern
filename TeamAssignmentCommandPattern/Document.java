

public class Document {
	String name;
	
	/** public Document(String name)
	 * Sets name to given name and prints that it was created
	 * @param name
	 */
	public Document(String name) {
		this.name = name;
		System.out.println(name + " is created.");
	}
	
	/** public void load()
	 * Prints that Document is loading
	 */
	
	public void load() {
		System.out.println("Document " + name + " is loaded into view.");
	}
	
	/** public void save()
	 * Prints that document is saving
	 */
	public void save() {
		System.out.println("Document " + name + " is being saved.");
	}
	
	/** public void spell
	 *  Prints that Document is being spell-checked
	 */
	public void spell() {
		System.out.println("Document " + name + " is being checked for spelling errors");
	}
	
	/** public void print()
	 * Prints that Document is printing
	 */
	public void print() {
		System.out.println("Document " + name + " is printing.");
	}
}
