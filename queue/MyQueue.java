public class MyQueue{
    private Node head, tail;
    private int size;

    public MyQueue(){
	head = null;
	tail = head;
	size = 0;
    }

    public void enqueue(String s){
	n = new Node(s);
	if(tail == null){
	    tail = n;
	    head = n;
	}else{
	    tail.setNext(n);
	    tail = n;
	}
	size++;
    }

    public String dequeue(){
	String s;
	if(head == null){
	    s = null;
	}else{
	    s = head.getData();
	    head = head.getNext();
	    size--;
	    if(head == null){
		tail == null;
	    }
	}
	return s;
    }

    public String front(){
	if(head == null){
	    return null;
	}
	return head.getData();
    }

    public int length(){
	return size;
    }

    public boolean isEmpty(){
	return head == null;
    }

    public String toString(){
	String s = "Head --> ";
	if(head == null){
	    s = s + "null -->";
	}
	Node tmp = head;
	while(tmp != null){
	    s = s + tmp.getData() + " --> ";
	    tmp = tmp.getNext();
	}
	s = s.substring(0, s.length() - 4);
	s = s + " <-- tail";
	return s;
    }
}
