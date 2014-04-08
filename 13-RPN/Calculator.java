import java.util.Scanner;

public class Calculator{

    public static void main(String[] args){
	myStack stack = new myStack();
	System.out.println("Type in 'reset' to reset the calculator.");
	while(true){
	    System.out.println("Current result: ");
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    if (s.equals("+")) {
		int result = stack.pop() + stack.pop();
		stack.push(result);
		System.out.println(result);
	    }else if(s.equals("-")) {
		int result = stack.pop() - stack.pop();
		stack.push(result);
		System.out.println(result);
	    }else if(s.equals("*")) {
		int result = stack.pop() * stack.pop();
		stack.push(result);
		System.out.println(result);
	    }else if(s.equals("/")) {
		int result = stack.pop() / stack.pop();
		stack.push(result);
		System.out.println(result);
	    }else if(s.equals("reset")){
		stack = new myStack();
	    }else{
		stack.push(Integer.parseInt(s));
	    }
	}
    }
}
