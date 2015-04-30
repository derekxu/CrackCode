import java.util.*;
/*
class TreeNode{
	int val;
	TreeNode left, right;
	public TreeNode(int v)
	{
		val=v;
		left=null;
		right=null;
	}
}*/

public class LowestCommonAncestor {
	static int TWO_NODES = 2;
	static int ONE_NODE = 1;
	static int NO_NODE = 0;
	
	public int cover(TreeNode root, TreeNode p, TreeNode q, List<TreeNode>res)
	{
		if(root==null) return 0;
		
		int ret=NO_NODE;
		int left=cover(root.left,p,q,res);
		ret+=left;
		if(ret==TWO_NODES)
		{
			return left;
		}

		if(root==p||root==q){
			ret+=ONE_NODE;
		}
		
		if(ret==TWO_NODES)
		{
			res.set(0,root);
			return ret;
		}		
		int right=cover(root.right,p,q,res);
		
		if(ret==ONE_NODE && right == ONE_NODE)
		{
			res.set(0,root);
		}	
		
		return ret+right;	
	}
	public TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
		List<TreeNode>res = new ArrayList<>();
		res.add(null);
		if(cover(root,p,q,res)==TWO_NODES){
			return res.get(0);
		}
		
		return null;
	}
}
