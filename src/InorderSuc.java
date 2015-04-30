import java.util.*;
class TreeNode{
	int val;
	TreeNode parent, left, right;
}
public class InorderSuc {
	public static TreeNode search(TreeNode root){
		if(root==null) return null;
		TreeNode p=null;
		if(root.parent==null && root.right!=null){
			p=leftModeChild(root.right);
		}else{
			while((p=root.parent)!=null){
				if(p.left==root){
					break;
				}
				root=p;
			}
		}
		return p;
	}
	public static TreeNode leftModeChild(TreeNode root){
		while(root.left!=null)
			root=root.left;
		return root;
	}
}
