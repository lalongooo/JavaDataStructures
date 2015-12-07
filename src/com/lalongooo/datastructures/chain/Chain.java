package com.lalongooo.datastructures.chain;

public class Chain {

	public static void main(String[] args) {
		Link left = new Link();
		Link middle = new Link();
		Link right = new Link();

		left.append(middle);
		middle.append(right);

		System.out.println(whichSideIsLonger(right));
	}

	public static Side whichSideIsLonger(Link link) {

		int leftLinks = leftCounter(link);
		int rightLinks = rightCounter(link);

		if (leftLinks > rightLinks) {
			return Side.LEFT;
		}

		if (leftLinks < rightLinks) {
			return Side.RIGHT;
		}

		return Side.NONE;
	}

	public static int leftCounter(Link link) {
		int leftLinks = 0;
		if (link.getLeft() != null) {
			leftLinks += leftCounter(link.getLeft());
		}

		return leftLinks + 1;
	}

	public static int rightCounter(Link link) {
		int rightLinks = 0;
		if (link.getRight() != null) {
			rightLinks += rightCounter(link.getRight());
		}

		return rightLinks + 1;
	}
}
