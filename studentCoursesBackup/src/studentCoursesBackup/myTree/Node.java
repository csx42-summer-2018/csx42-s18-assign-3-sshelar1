package studentCoursesBackup.myTree;

import java.util.ArrayList;
import java.util.List;

public class Node implements SubjectI, ObserverI{

	private int B_number;
	private Node leftNode;
	private Node rightNode;
	
	private List<ObserverI> observersList = new ArrayList<ObserverI>();
	private List<Character> courseList = new ArrayList<Character>();
	
	public Node() {
		leftNode = null;
		rightNode = null;
		B_number = 0;
	}
	
	public Node(int B_numberIn) {
		leftNode = null;
		rightNode = null;
		B_number = B_numberIn;
	}

	public int getB_number() {
		return B_number;
	}

	public void setB_number(int b_number) {
		B_number = b_number;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public List<ObserverI> getObserversList() {
		return observersList;
	}

	public void setObserversList(List<ObserverI> observersList) {
		this.observersList = observersList;
	}

	public List<Character> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Character> courseList) {
		this.courseList = courseList;
	}

	@Override
	public void update(Character character) {
		// TODO Auto-generated method stub
		this.getCourseList().remove(character);
	}

	@Override
	public void registerObserver(ObserverI observerI) {
		// TODO Auto-generated method stub
		observersList.add(observerI);
	}

	@Override
	public void removeObserver(ObserverI observerI) {
		// TODO Auto-generated method stub
		observersList.remove(observerI);
	}

	@Override
	public void notifyObservers(Character character) {
		// TODO Auto-generated method stub
		ObserverI observerI;
		for (int i = 0; i < observersList.size(); i++) {
			observerI = observersList.get(i);
			observerI.update(character);
		}
	}

	public boolean validate(Character courseIn) {
		// TODO Auto-generated method stub
		List<Character> validCourses = new ArrayList<Character>();
		validCourses.add('A');
		validCourses.add('B');
		validCourses.add('C');
		validCourses.add('D');
		validCourses.add('E');
		validCourses.add('F');
		validCourses.add('G');
		validCourses.add('H');
		validCourses.add('I');
		validCourses.add('J');
		validCourses.add('K');
		if (validCourses.contains(courseIn)) {
			return true;
		}
		return false;
	}
}
