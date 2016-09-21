package com.kevin.test;

import java.util.List;
import java.util.ArrayList;

public class Node{
    protected String nodeName;
    protected List<Node> childList;

    public Node() {
    	if (childList == null)
            childList = new ArrayList<Node>();
    }

    public void addChildNode(Node Node) {
        childList.add(Node);
        
    }

    public List<Node> getChildList() {
        return childList;
    }
    
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    
    
    public static void traversal(List<Node> nodes) {
		if (nodes == null || nodes.size() == 0) {
			return;
		}
		List<Node> temp = new ArrayList<Node>();
		
		for (Node node : nodes) {
			System.out.println(node.getNodeName() + " ");
			if (node.getChildList() != null && !node.getChildList().isEmpty()) {
				temp.addAll(node.getChildList());
			}
		}
		traversal(temp);
	}
    
    public static void main(String args[]){

		Node root = new Node();
		root.setNodeName("a");
		
		Node nodeB1 = new Node();
		nodeB1.setNodeName("b");
		root.addChildNode(nodeB1);
		Node nodeC1 = new Node();
		nodeC1.setNodeName("e");
		nodeB1.addChildNode(nodeC1);
		
		Node nodeB2 = new Node();
		nodeB2.setNodeName("c");
		root.addChildNode(nodeB2);
		Node nodeC2 = new Node();
		nodeC2.setNodeName("f");
		nodeB2.addChildNode(nodeC2);
		
		Node nodeB3 = new Node();
		nodeB3.setNodeName("d");
		root.addChildNode(nodeB3);
		Node nodeC3 = new Node();
		nodeC3.setNodeName("g");
		nodeB3.addChildNode(nodeC3);
		
		List<Node> list = new ArrayList<Node>();
		list.add(root);
		traversal(list);
		
    }
}