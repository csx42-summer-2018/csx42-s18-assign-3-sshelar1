package studentCoursesBackup.util;

import studentCoursesBackup.myTree.Node;

/**
 * 
 * Citation : using https://www.sanfoundry.com/java-program-implement-binary-search-tree/ for creating BST
 *
 */

public class BST {
	
	private Node root;
	private Results results;
	
	public BST(Results results) {
		// TODO Auto-generated constructor stub
		this.setResults(results);
		root = null;
	}
	
	public Node getRoot() {
		return root;
	}
	
	public void setRoot(Node node) {
		this.root = node;
	}
	
	public Results getResults() {
		return results;
	}
	
	public void setResults(Results results) {
		this.results = results;
	}

	public boolean isEmpty() {
		return root == null;
	}
	

	public void insert(Node rootIn) {
		// TODO Auto-generated method stub
		if (root == null) {
			root = rootIn;
		}else {
			Node node = root;
			while (node != null) {
				if (node.getB_number() == rootIn.getB_number()) {
					boolean flag = node.getCourseList().contains(rootIn.getCourseList().get(0));
					if (!flag) {
						node.addCourse(rootIn.getCourseList(), node);
					}
					break;
				}else if (root.getB_number() < rootIn.getB_number()) {
					if (node.getRightNode()==null) {
						node.setRightNode(rootIn);
						break;
					}
					node = node.getRightNode();
				}else if (root.getB_number() > rootIn.getB_number()) {
					if (node.getLeftNode()==null) {
						node.setLeftNode(rootIn);
						break;
					}
					node = node.getLeftNode();
				}
			}
		}
	}

	public void delete(int b_numberIn, Character courseIn) {
		// TODO Auto-generated method stub
		Node node = root;
		while (node != null) {
			if (node.getB_number() < b_numberIn) {
				node = node.getRightNode();
			} else if(node.getB_number() > b_numberIn){
				node = node.getLeftNode();
			} else if (node.getB_number() == b_numberIn) {
				node.update(courseIn);
				node.notifyObservers(courseIn);
			}
		}
	}
}
