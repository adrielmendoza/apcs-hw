public class myStack{
    private Node top;
    private int numElts;

    public myStack(){
	top = null;
    }
	
    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
    }

    public String pop(){
	String ret = top.getData();
	top = top.getNext();
	numElts++;
	return ret;
    }

    public String peek(){
	return top.getData();
    }

    public boolean isEmpty(){
	return top == null;
    }
    
    public String toString(){
	String s = "";
	Node temp = top;
	while(temp != null){
	    s = s + temp.getData() + ", ";
	    temp = temp.getNext();
	}
	return s.substring(0, s.length()-2);
    }
	    
}