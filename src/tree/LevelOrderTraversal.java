package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：zhaoRuBing
 * @date ：2020-10-08 18:20
 * @Description: TODO
 */
public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.initTree();
//        System.out.println(levelOrderTraversal(treeNode));
        System.out.println(levelOrderTraversal2(treeNode,0));
    }

    /**
     * 非递归遍历
     * @param root
     * @return
     */
    private static List<Integer> levelOrderTraversal(TreeNode root){
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
                stack.push(temp.leftNode);
            }
            if(temp.leftNode != null){
                stack.push(temp.rightNode);
            }
        }
        return res;
    }


    private static List<List<Integer>> res = new ArrayList<>();
    private static List<List<Integer>> levelOrderTraversal2(TreeNode root, int level){
        bfs(root,level);
        return res;
    }
    private static void bfs(TreeNode root, int level){
        if(root == null){
            return;
        }
        if(level >= res.size()){
            res.add(new ArrayList<Integer>());
        }
        //添加当前元素
        res.get(level).add(root.data);
        bfs(root.leftNode,level+1);
        bfs(root.rightNode,level+1);
    }
}
