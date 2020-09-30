package stack;

import java.util.Stack;

/**
 * 请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(1)。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author ：zhaoRuBing
 * @since ：2020-09-16 10:31
 */
public class MinStack {
    private static Stack<Integer> stack;
    private static Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty()){
            minStack.push(x);
        }else{
            if(x <= minStack.peek()){
                minStack.push(x);
            }
        }
    }

    public void pop() {
        if(minStack.peek().equals(stack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


    public static void main(String[] args) {
        MinStack min = new MinStack();
        min.push(512);
        min.push(-1024);
        min.push(-1024);
        min.push(512);

        traverse();

        min.pop();
        traverse();
//        System.out.println(min.getMin());
        min.pop();
        traverse();
//        System.out.println(min.getMin());
        min.pop();
        traverse();
//        System.out.println(min.getMin());
    }

    /**
     * 遍历测试
     */
    public static void traverse(){
        for (int i:stack) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
        for (int i:minStack) {
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------");
    }
}
