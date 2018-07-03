package studentCoursesBackup.util;

import java.util.ArrayList;

import studentCoursesBackup.myTree.Node;

public class TreeBuilder {

	private BST bst, bstBackUp1, bstBackUp2;
	
	public TreeBuilder(BST bstIn, BST bstBackUp1In, BST bstBackUp2In) {
		// TODO Auto-generated constructor stub
		setBst(bstIn);
		setBstBackUp1(bstBackUp1In);;
		setBstBackUp2(bstBackUp2In);
	}

	public BST getBst() {
		return bst;
	}

	public void setBst(BST bst) {
		this.bst = bst;
	}

	public BST getBstBackUp1() {
		return bstBackUp1;
	}

	public void setBstBackUp1(BST bstBackUp1) {
		this.bstBackUp1 = bstBackUp1;
	}

	public BST getBstBackUp2() {
		return bstBackUp2;
	}

	public void setBstBackUp2(BST bstBackUp2) {
		this.bstBackUp2 = bstBackUp2;
	}

	public void delete(int b_numberIn, String courseIn) {
		// TODO Auto-generated method stub
		
	}

	public void insert(int b_numberIn, Character courseIn) {
		// TODO Auto-generated method stub
		Node node = new Node();
		ArrayList<Character> arrayList = new ArrayList<Character>();
		boolean flag = node.validate(courseIn);
		if (flag) {
			arrayList.add(courseIn);
			node.setB_number(b_numberIn);
			node.setCourseList(arrayList);
		}
	}	
	
	public void delete(int b_numberIn, Character courseIn) {
		bst.delete(b_numberIn, courseIn);
	}
	
}
