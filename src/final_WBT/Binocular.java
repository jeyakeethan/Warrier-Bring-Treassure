package final_WBT;

public class Binocular {

	public Node lookArround(Node node) {
		if (node.getX() + 1 < 9 && Grid.getGrid()[node.getX() + 1][node.getY()].getLotus() != null)
			return Grid.getGrid()[node.getX() + 1][node.getY()];
		else if (node.getX() > 0 && Grid.getGrid()[node.getX() - 1][node.getY()].getLotus() != null)
			return Grid.getGrid()[node.getX() - 1][node.getY()];
		else if (node.getY() > 0 && Grid.getGrid()[node.getX()][node.getY() - 1].getLotus() != null)
			return Grid.getGrid()[node.getX()][node.getY() - 1];
		else if (node.getY() < 9 && Grid.getGrid()[node.getX()][node.getY() + 1].getLotus() != null)
			return Grid.getGrid()[node.getX()][node.getY() + 1];
		return null;
	}
}
