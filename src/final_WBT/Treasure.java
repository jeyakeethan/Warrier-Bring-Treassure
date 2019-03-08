package final_WBT;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Treasure implements Inhabitant {
	private String name;
	private Node node;
	private ArrayList<Warrior> warriorList;

	public Treasure(String name) {
		this.name = name;
		this.warriorList = new ArrayList<>();
	}

	/**
	 * to notify all warrior that the Treasure has been grabbed
	 */
	public synchronized void notifyTreasureIsGrabbed(Warrior grabbedWarrior) {

		this.writeToPermanentStorage(grabbedWarrior, LocalDateTime.now()); // store results in permanent storage.

		for (Warrior warrior : warriorList) {
			warrior.setTreasureGrabbed(true);
		}
		GameWarriorBringTreasure.stopGame();
		System.out.println(String.format(grabbedWarrior.getName() + " has grabbed the treasure and become winner\n"));
	}

	/*
	 * To a warrior get registered and notify treasure when he starts swimming.
	 */
	public void registerWarrior(Warrior warrior) {
		warriorList.add(warrior);
	}

	/*
	 * To write results to the permanent storage.
	 */
	public void writeToPermanentStorage(Warrior warrior, LocalDateTime dateTime) {
		FileWriter fileWriter;

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH : mm : ss");

		String str = String.format(
				"Treasure has been grabbed.\r\nGrabbed Warrior\t::\t%s\r\nGrabbed Time\t::\t %s\r\n\r\n",
				warrior.getName(), dtf.format(dateTime));
		try {
			fileWriter = new FileWriter("WBT_Results.txt", true);

			fileWriter.write(str);
			fileWriter.close();
		} catch (Exception e) {
		}
	}

	/*--- Getter and Setter section ---*/
	public String getName() {
		return name;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
}
