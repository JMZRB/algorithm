package tree;

/**
 * 二叉树
 *
 * @author ：zhaoRuBing
 * @since ：2020-08-22 18:42
 */
public class TreeNode {
    public Integer data;
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode(Integer data){
        this.data = data;
    }

    /**
     * 构建一棵二叉树
     * @return
     */
    public static TreeNode initTree(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.leftNode = new TreeNode(2);
        treeNode.rightNode = new TreeNode(3);
        treeNode.leftNode.leftNode = new TreeNode(4);
        treeNode.leftNode.rightNode = new TreeNode(5);
        treeNode.rightNode.leftNode = new TreeNode(6);
        treeNode.rightNode.rightNode = new TreeNode(7);
        return treeNode;
    }
}
