package final_WBT;

public class Lotus implements Inhabitant {

	private String name;
	private int petals;
	private boolean isContainPetals;
	private Node node;

	public Lotus(String name) {
		this.name = name;
		petals = 100;
		isContainPetals = true;
	}

	public void decrementPetal() {
		petals--;
		if (petals == 0) {
			isContainPetals = false;
		}
	}

	/*--- Getter and Setter Section ---*/
	public boolean getPetalAvailability() {
		return isContainPetals;
	}

	public Node getNode() {
		return node;
	}

	public String getName() {
		return name;
	}

	public void setNode(Node node) {
		this.node = node;
	}
}
