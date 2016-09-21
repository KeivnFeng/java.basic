package com.kevin.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TreeNode{
    protected String nodeName;
    protected TreeNode[] childList;

    public TreeNode() {
        initChildList();
    }

    public void addChildNode(TreeNode treeNode) {
        initChildList();
        TreeNode[] temp = Arrays.copyOf(childList, childList.length+1);
        temp[temp.length-1] = treeNode;
        childList = temp;
        
    }

    public void initChildList() {
        if (childList == null)
            childList = new TreeNode[0];
    }
  
    public TreeNode[] getChildList() {
        return childList;
    }

    public void depthTraverse() {
        System.out.print(this.nodeName + " ");
        if (childList == null || childList.length == 0)
            return;
        int childNumber = childList.length;
        for (int i = 0; i < childNumber; i++) {
            TreeNode child = childList[i];
            child.depthTraverse();
        }
    }
    
	public static void levelTraversal(List<TreeNode> nodes) {
		if (nodes == null || nodes.size() == 0) {
			return;
		}
		List<TreeNode> temp = new ArrayList<TreeNode>();
		
		for (TreeNode node : nodes) {
			System.out.print(node.getNodeName() + " ");
			if (node.getChildList() != null && node.getChildList().length > 0) {
				temp.addAll(Arrays.asList(node.getChildList()));
			}

		}
		levelTraversal(temp);
	}
    
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
}