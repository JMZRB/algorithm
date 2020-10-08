package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树中序遍历
 *
 * 左——根——右
 *
 * @author ：zhaoRuBing
 * @since ：2020-08-22 10:23
 */
public class InOrderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.initTree();
        System.out.println(inOrderTraversal(treeNode));
//        inOrderTraversal2(treeNode);
    }

    /**
     * 非递归遍历
     * @param root
     * @return
     */
    private static List<Integer> inOrderTraversal(TreeNode root){
        if(root == null){
            return null;
        }
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()){
            if(root != null){
                stack.push(root);
                root = root.leftNode;
            }else {
                root = stack.pop();
                res.add(root.data);
                root = root.rightNode;
            }
        }
        return res;
    }

    /**
     * 递归遍历
     * @param root
     */
    private static void inOrderTraversal2(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTraversal2(root.leftNode);
        System.out.println(root.data);
        inOrderTraversal2(root.rightNode);
    }
}
