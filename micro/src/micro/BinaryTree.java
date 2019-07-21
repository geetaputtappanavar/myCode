package micro;

public class BinaryTree {
	Node root;
	public static void main(String[] args) {
		/*BinaryTree bt = new BinaryTree();
		bt.addNode(30, "aa");
		bt.addNode(15, "bb");
		bt.addNode(40, "cc");*/
		BinaryTree theTree = new BinaryTree();
		theTree.addNode(50, "Boss");
		theTree.addNode(25, "Vice President");
		theTree.addNode(15, "Office Manager");
		theTree.addNode(30, "Secretary");
		theTree.addNode(75, "Sales Manager");
		theTree.addNode(85, "Salesman 1");
		/*theTree.addNode(20, "Salesman 20");
		theTree.addNode(17, "Salesman 17");*/
		/*theTree.addNode(50, "50");
		theTree.addNode(25, "25");
		theTree.addNode(75, "75");
		theTree.addNode(70, "70");
		theTree.addNode(80, "80");*/
		//theTree.printLeafNodes();
		//theTree.printView();
		BinaryTree mirrorTree = new BinaryTree();
		Node mirrorNode = new Node(theTree.root.key, theTree.root.name);
		mirrorTree.root = mirrorNode;
		theTree.printMirrorTree(theTree.root, mirrorTree.root, mirrorTree);
		theTree.printInOrder(theTree.root);
		theTree.printPreOrder(theTree.root);
		//theTree.printPreOrder(theTree.root);
	}

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
		if(root == null) {
			root = newNode;
		}else {
			Node parent = root;
			while(true) {
				
				if(newNode.key<parent.key) {
					if(parent.leftChild==null) {
						parent.leftChild = newNode;
						return;
					}
					else {
						parent = parent.leftChild;
					}
				}else {
					//root.rightChild = newNode;
					if(parent.rightChild==null) {
						parent.rightChild = newNode;
						return;
					}
					else {
						parent = parent.rightChild;
					}
				}
			}
		}
	}
	
	//leaf nodes
	public void printLeafNodes() {
		Node node = root;
		printLeftNodes(node);
	}
	
	public void printLeftNodes(Node node) {
		if (node == null) {
			return;
		}
		if (node.leftChild == null && node.rightChild == null) {
			System.out.println(node);
		}
		printLeftNodes(node.leftChild);
		printLeftNodes(node.rightChild);
	}
	
	//left, right, bottom 
	public void printView() {
		Node node = root;
		//print left
		while(node!=null) {
			System.out.println(node);
			node = node.leftChild;
		}
		
		//print right view
		node = root.rightChild;
		while(node!=null) {
			System.out.println(node);
			node = node.rightChild;
		}
		
		//print bottom view -- leaf nodes		
	}
	
	//mirror tree
	//BinaryTree mirrorTree = new BinaryTree();
	public void printMirrorTree(Node node, Node mNode, BinaryTree mirrorTree) {
		if(node == null) {
			return;
		}else {
			if(node.leftChild!=null) {
				Node leftNode = new Node(node.leftChild.key, node.leftChild.name);
				mNode.rightChild = leftNode;
			}
			if(node.rightChild!=null) {
				Node rightNode = new Node(node.rightChild.key, node.rightChild.name);
				mNode.leftChild = rightNode;
			}
		}
		printMirrorTree(node.leftChild, mNode.rightChild, mirrorTree);
		printMirrorTree(node.rightChild, mNode.leftChild, mirrorTree);
	}
	
	public void printInOrder(Node root) {
		if(root == null) {
			return;
		}
		printInOrder(root.leftChild);
		System.out.println(root.key);
		printInOrder(root.rightChild);
	}
	
	public void printPreOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.key);
		printPreOrder(root.leftChild);
		printPreOrder(root.rightChild);
	}
}

class Node{
	int key;
	String name;
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name){
		this.key = key;
		this.name = name;
	}
	
	public String toString(){
		return name+", "+key;
	}
}
