import java.util.Stack;
/*
    Random stack demonstration written in Java
 */


public class javaStack2 {
    public static void main(String[]args){
        Stack<Integer>mStack = new Stack<>();
        mStack.push(2);
        mStack.push(13);
        mStack.push(45);
        mStack.push(24);
        mStack.push(9);
        mStack.push(81);

        //Prints initial stack
        System.out.println(mStack);

        int y = mStack.pop();

        //Prints value popped from stack
        System.out.println(y);
        //Prints new stack post pop
        System.out.println("Stack post pop: " + mStack);

        int z = mStack.pop();
        System.out.println("Stack post pop x2: " + mStack);



    }
}
