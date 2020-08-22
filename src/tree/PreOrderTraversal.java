package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树先序遍历
 *
 * 根——左——右
 *
 * @author ：zhaoRuBing
 * @since ：2020-08-22 10:22
 */
public class PreOrderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.initTree();
        List<Integer> preOrderTraversal = preOrderTraversal(treeNode);
        System.out.println(preOrderTraversal);
        preOrderTraversal2(treeNode);
    }

    /**
     * 非递归遍历
     * @param root
     * @return
     */
    private static List<Integer> preOrderTraversal(TreeNode root) {
        if(root == null){
            return null;
        }
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            res.add(temp.data);
            if(temp.rightNode != null){
                stack.push(temp.rightNode);
            }
            if(temp.leftNode != null){
                stack.push(temp.leftNode);
            }
        }
        return res;
    }

    /**
     * 递归遍历
     * @param root
     */
    private static void preOrderTraversal2(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrderTraversal2(root.leftNode);
        preOrderTraversal2(root.rightNode);
    }
}
