public class Driver{
    public static void main(String[] args){
	myStack a = new myStack();
	a.push("one");
	a.push("two");
	a.push("three");
	System.out.println(a);
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.pop());
	a.push("Hello");
	a.push("World");
	System.out.println(a);
	System.out.println(a.peek());
    }
}
