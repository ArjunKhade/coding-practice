package tree;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	
	//DFS  preorder,inorder,postorder
	
	/**********************************************/
	//PreOrder
	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+","); //root
		preOrder(root.left); 					//left
		preOrder(root.right);					//right
	}
	
	/******************************************/
	
	//InOrder
	public static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);					//left
		System.out.print(root.data+",");  //root
		inOrder(root.right);					//right
	}
	
	/********************************************/
	//PostOrder
	public static void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);				//left
		postOrder(root.right);				//right
		System.out.print(root.data+","); //root
	}
	
	/********************************************/

	//BFS  => Queue
	public static void levelOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node current = q.remove();
			if(current == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(current.data+" ");
				if(current.left!= null) {
					q.add(current.left);
				}
				if(current.right!= null) {
					q.add(current.right);
				}
				
			}
		}
		

	}
	
	/*************************************************/
	
	public static int countOfNodes(Node root) {
		if(root==null) {
			return 0;
		}
		
		int leftCount = countOfNodes(root.left);
		int rightCount = countOfNodes(root.right);
		return leftCount+rightCount+1;
	}
	
	/*****************************************/
	//sum of nodes
	public static int sumOfNodes(Node root) {
		if(root==null) {
			return 0;
		}
		
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
	
		return leftSum+rightSum+ root.data;
	}
	
	/*****************************************/
	//height of tree
	public static int heightOfTree(Node root) {
		  if(root == null) {
			  return 0;
		  }
		
		int leftHight = heightOfTree(root.left);
		int rightHight = heightOfTree(root.right);
		
		return Math.max(leftHight, rightHight)+1;
	}
	
	
	/****************************************/
	
	public static int diameterOfTree(Node root) {
		if(root == null) {
			return 0;
		}
		
		int dia1 = diameterOfTree(root.left);
		int dia2 = diameterOfTree(root.right);
		int dia3 = heightOfTree(root.left)+ heightOfTree(root.right)+1;
		
		return Math.max(dia3, Math.max(dia1, dia2));
	}
	
	/****************************************/
	
	public static TreeInfo diameterOfTreeOptimized(Node root) {
		if(root == null) {
			return new TreeInfo(0,0);
		}
		TreeInfo left = diameterOfTreeOptimized(root.left);
		TreeInfo right = diameterOfTreeOptimized(root.right);
		
		int myHeight = Math.max(left.ht,right.ht)+1;
		
		int dia1 = left.dia;
		int dia2 = right.dia;
		int dia3 = left.ht+right.ht+1;
		int myDia = Math.max(Math.max(dia1, dia2),dia3);
		
		TreeInfo myInfo = new TreeInfo(myHeight, myDia);
	
		return myInfo;
	}
	
	/****************************************/
	//Check Subtree
	public static boolean isSubtree(Node root,Node subRoot) {
		    if(subRoot == null) {
		    	return true;
		    }
			if(root == null) {
				return false;
			}
		    
			if(root.data == subRoot.data) {
				if(isIdentical(root,subRoot)) {
					return true;
				}
			}
		
		return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot) ;
	}
	
 static boolean	isIdentical(Node root, Node subroot){
		if(root == null && subroot == null) {
			return true;
		}
		if(root == null || subroot == null) {
			return false;
		}
		
		if(root.data == subroot.data) {
			 return isIdentical(root.left,subroot.left) && isIdentical(root.right,subroot.right) ;
		}
	  
		return false;
	}
	
	/****************************************/
	static class BineryTree {
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			
			return newNode;
		}
	}
	
	/********************************************/	
	

	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class TreeInfo{
		
		int ht;
		int dia;
		public TreeInfo(int ht, int dia) {
			this.ht = ht;
			this.dia = dia;
		}
		
		
	}
	
	/******************************************/
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BineryTree tree= new BineryTree();
		Node root = tree.buildTree(nodes);
		
		//System.out.println(root.data);
		System.out.println("BFS:");
		levelOrder(root);
		
		System.out.println();
		System.out.println("DFS:");
		System.out.print("Preorder:");
		preOrder(root);
		
		System.out.println();
		System.out.print("inorder:");
		inOrder(root);
		
		System.out.println();
		System.out.print("postOrder:");
		postOrder(root);
		
		System.out.println();
		System.out.print("CountOfNode:");
		
		System.out.println(countOfNodes(root));
		System.out.println();
		System.out.print("SumOfNode:");
		System.out.println(sumOfNodes(root));
		System.out.println();
		System.out.print("heightOfTree:");
		System.out.println(heightOfTree(root));
		System.out.println();
		System.out.print("diameterOfTree:");
		System.out.println(diameterOfTree(root));
		System.out.println();
		System.out.print("diameterOfTreeOptimized:");
		System.out.println(diameterOfTreeOptimized(root).dia);
		
		
	}
	
	
	

}
