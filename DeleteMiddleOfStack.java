package GFG_Questions;

import java.util.Stack;

public class DeleteMiddleOfStack {

    public void deleteMiddle(Stack<Integer> stack, int sizeOfStack, int current){

        if(stack.isEmpty() || current == sizeOfStack){
            return ;
        }

        int el = stack.pop();

        deleteMiddle(stack, sizeOfStack, current+1);

        if(current != sizeOfStack/2){
            stack.push(el);
        }
    }

    public void mainDeleteMiddleOfStack(){

        Stack<Integer> stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        System.out.println(stack.size());

        deleteMiddle(stack, stack.size(), 0);

        System.out.println(stack);
    }
}
