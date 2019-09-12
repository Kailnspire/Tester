import java.util.Stack;

public class javaStack {

    public static void main(String[]args){
        //Create a stack
        Stack<String>stack = new Stack<>();

        //Push add an element to the top of the stack
        stack.push("Jack");
        stack.push("Queen");
        stack.push("King");
        stack.push("Ace");

        System.out.println("Stack =>"+stack);
        System.out.println();

        String topOfStack = stack.pop();//Throws  EmptyStackException if stack is empty
        System.out.println("Pop "+ topOfStack);
        //System.out.println(stack);
        //peak reveals the current item at the top of the stack.
        String revealTop = stack.peek();
        System.out.println("Peek "+ revealTop);
        System.out.println("Pop "+topOfStack);
        System.out.println("Searching the stack to determine how far away King is from the top of the stack: "+stack.search("King"));
        System.out.println(stack.removeElement("Jack"));//removes specific element
        System.out.println(stack);

    }
}
