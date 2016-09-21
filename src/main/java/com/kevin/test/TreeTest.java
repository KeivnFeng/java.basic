package com.kevin.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeTest {
	
	public static void main(String args[]){
		
		
	        

		
		
		TreeNode rootTreeANode = new TreeNode();
		rootTreeANode.setNodeName("the");
		
		TreeNode quickNode = new TreeNode();
		quickNode.setNodeName("quick");
		rootTreeANode.addChildNode(quickNode);
		TreeNode jumpsNode = new TreeNode();
		jumpsNode.setNodeName("jumps");
		quickNode.addChildNode(jumpsNode);
		
		
		TreeNode brownNode = new TreeNode();
		brownNode.setNodeName("brown");
		rootTreeANode.addChildNode(brownNode);
		TreeNode overNode = new TreeNode();
		overNode.setNodeName("over");
		brownNode.addChildNode(overNode);
		TreeNode lazyNode = new TreeNode();
		lazyNode.setNodeName("lazy");
		overNode.addChildNode(lazyNode);
		TreeNode dogNode = new TreeNode();
		dogNode.setNodeName("dog");
		overNode.addChildNode(dogNode);
		
		
		TreeNode foxNode = new TreeNode();
		foxNode.setNodeName("fox");
		rootTreeANode.addChildNode(foxNode);
		TreeNode theNode = new TreeNode();
		theNode.setNodeName("the");
		foxNode.addChildNode(theNode);
		
		
		
		/*TreeNode rootTreeBNode = new TreeNode();
		rootTreeBNode.setNodeName("the");
		
		TreeNode quickNode = new TreeNode();
		quickNode.setNodeName("quick");
		rootTreeBNode.addChildNode(quickNode);
		TreeNode brownNode = new TreeNode();
		brownNode.setNodeName("brown");
		quickNode.addChildNode(brownNode);
		
		
		TreeNode foxNode = new TreeNode();
		foxNode.setNodeName("fox");
		rootTreeBNode.addChildNode(foxNode);
		TreeNode jumpsNode = new TreeNode();
		jumpsNode.setNodeName("jumps");
		foxNode.addChildNode(jumpsNode);
		TreeNode overNode = new TreeNode();
		overNode.setNodeName("over");
		jumpsNode.addChildNode(overNode);
		TreeNode theNode = new TreeNode();
		theNode.setNodeName("the");
		jumpsNode.addChildNode(theNode);
		
		TreeNode lazyNode = new TreeNode();
		lazyNode.setNodeName("lazy");
		rootTreeBNode.addChildNode(lazyNode);
		TreeNode dogNode = new TreeNode();
		dogNode.setNodeName("dog");
		lazyNode.addChildNode(dogNode);
		
		rootTreeBNode.traverse();*/
		
		
		
		List<TreeNode> nodes = new ArrayList<TreeNode>();
		nodes.add(rootTreeANode);
		TreeNode.levelTraversal(nodes);
		
		
		
			//System.out.println(xxd());
		
	}
	
	public static String xxd(){
		int x = 0;
		
		try{
			if(x == 0){
				return "return value " + x;
			}else{
				throw new Exception("xxxxxxxxx");
			}
		}catch(Exception e){
			
		}finally{
			System.out.println("finally--------");
		}
		
		return "--------------";
		
	}
	
	/*public static int level=0;
	 
	 public static void findNodeByLevel(List<TreeNode> nodes){
	  if(nodes==null||nodes.size()==0){
	   return ;
	  }
	  level++;
	  ArrayList<TreeNode> temp = new ArrayList();
	  for(TreeNode node:nodes){
	   System.out.print(node.getNodeName() + " ");
	   if(node.getChildList() != null && !node.getChildList().isEmpty()){
		   temp.addAll(node.getChildList());
	   }
	   
	  }
	  nodes.removeAll(nodes);
	  findNodeByLevel(temp);
	 }*/

}
