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
	
	public void insert (int B_number) {
		root = insert(B_number, root);
	}

	private Node insert(int b_number, Node rootIn) {
		// TODO Auto-generated method stub
		if (rootIn == null) {
			root = rootIn;
		}
		return root;
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
