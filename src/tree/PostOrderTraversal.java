package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树后序遍历
 *
 * 左——右——根
 *
 * @author ：zhaoRuBing
 * @since ：2020-08-22 10:23
 */
public class PostOrderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.initTree();
        System.out.println(postOrderTraversal(treeNode));
//        postOrderTraversal2(treeNode);
    }

    /**
     * 非递归遍历
     * @param root
     * @return
     */
    private static List<Integer> postOrderTraversal(TreeNode root) {
        if(root == null){
            return null;
        }
        //List<Integer> res = new ArrayList<>();
        LinkedList<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode  temp = stack.pop();
            //向指定索引处添加元素
            //res.add(0,temp.data);
            res.addFirst(temp.data);
            if(temp.leftNode != null){
                stack.push(temp.leftNode);
            }
            if(temp.rightNode != null){
                stack.push(temp.rightNode);
            }
        }
        return res;
    }

    /**
     * 递归遍历
     * @param root
     */
    private static void postOrderTraversal2(TreeNode root) {
        if(root == null){
            return;
        }
        postOrderTraversal2(root.leftNode);
        postOrderTraversal2(root.rightNode);
        System.out.println(root.data);
    }
}
