package studentCoursesBackup.myTree;

import java.util.List;

public class Node implements SubjectI, ObserverI{

	private int B_number;
	private Node leftNode;
	private Node rightNode;
	
	private List<ObserverI> observersList;
	private List<ObserverI> courseList;
	
	public Node() {
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerObserver(ObserverI o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(ObserverI o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
}
