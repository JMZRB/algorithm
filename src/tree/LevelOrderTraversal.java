package tree;

import java.util.*;

/**
 * @author ：zhaoRuBing
 * @date ：2020-10-08 18:20
 * @Description: TODO
 */
public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.initTree();
        System.out.println(levelOrderTraversal(treeNode));
//        System.out.println(levelOrderTraversal1(treeNode));
//        System.out.println(levelOrderTraversal2(treeNode));
    }

    /**
     * 非递归层序遍历二叉树    [1, 2, 3, 4, 5, 6, 7]
     * @param root
     * @return
     */
    private static List<Integer> levelOrderTraversal(TreeNode root){
        if(root == null){
            return null;
        }
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            res.add(temp.data);
            if(temp.leftNode != null)
                queue.offer(temp.leftNode);
            if(temp.rightNode != null)
                queue.offer(temp.rightNode);

        }
        return res;
    }

    /**
     * 非递归层序遍历二叉树    [[1], [2, 3], [4, 5, 6, 7]]
     * @param root
     * @return
     */
    private static List<List<Integer>> levelOrderTraversal1(TreeNode root){
        if(root == null){
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--){
                TreeNode temp = queue.poll();
                tmp.add(temp.data);
                if(temp.leftNode != null){
                    queue.add(temp.leftNode);
                }
                if(temp.rightNode != null){
                    queue.add(temp.rightNode);
                }
            }
            res.add(tmp);
        }
        return res;
    }

    /**
     * 递归层序遍历二叉树    [[1], [2, 3], [4, 5, 6, 7]]
     */
    private static List<List<Integer>> res = new ArrayList<>();
    private static List<List<Integer>> levelOrderTraversal2(TreeNode root){
        bfs(root,0);
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
