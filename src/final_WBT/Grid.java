package final_WBT;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Grid {
	private static Node grid[][];
	private static ArrayList nodeList;
	protected static GUI gui;

	private static Random randomInt = new Random();

	/**
	 * to generate/ reset random node array which is not reserved before
	 * 
	 * @return
	 */
	public static ArrayList<int[]> generateNodes() {
		nodeList = new ArrayList();
		for (int x = 2; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				int[] cordinate = { x, y };
				nodeList.add(cordinate);
			}
		}
		int[] center = { 5, 5 };
		nodeList.remove(center);
		return (ArrayList<int[]>) nodeList;
	}

	/**
	 * to fill all the grid locations with empty nodes initially.
	 */
	public static void fillGridWithNode() {
		grid = new Node[11][11];
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				grid[i][j] = new Node(i, j);
			}
		}
	}

	/**
	 * set new position for warriors.
	 */
	public static void setInhabitantPosition(int a, int b, Warrior warrior) {
		Node node = grid[a][b];
		warrior.setNode(node);
		grid[a][b].setInhabitant(warrior);
		warrior.setGrid(grid);
	}

	/**
	 * set new position for treasure.
	 */
	public static void setInhabitantPosition(int a, int b, Treasure treasure) {
		Node node = grid[a][b];
		treasure.setNode(node);
		grid[a][b].setInhabitant(treasure);
	}

	/**
	 * set new position for Fishes and Lotus.
	 */
	public static void setInhabitantPosition(Inhabitant inhabitant) {
		int[] cordinate;
		cordinate = generateRandomCordinate();
		int a = cordinate[0];
		int b = cordinate[1];
		Node node = grid[a][b];
		inhabitant.setNode(node);
		grid[a][b].setInhabitant(inhabitant);
	}

	/**
	 * to get random coordinate that available. the coordinate is restricted by
	 * object type going to reserve it
	 */
	public static int[] generateRandomCordinate() {
		int[] node = (int[]) nodeList.remove(randomInt.nextInt(nodeList.size()));
		return node;
	}

	public static Node[][] getGrid() {
		return grid;
	}

	public static void setGui(GUI guiIn) {
		gui = guiIn;
	}
}
