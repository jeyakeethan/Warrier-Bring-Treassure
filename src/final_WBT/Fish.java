package final_WBT;

public abstract class Fish implements Inhabitant, Runnable {

	private String name;
	private Node node;

	public abstract void attackWarrior(Node node);

	/*
	 * Fish threads alive until treasure grabbed.
	 */
	public void run() {
		while (true)
			this.getNode().lookArround();
	}

	/*--- Getter and Setter section--- */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
}
