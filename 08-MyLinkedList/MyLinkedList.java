public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head = null;
    }

    public void add(String d){
	Node tmp = new Node(d);
	//head = tmp;
	tmp.setNext(head);
	head = tmp;
    }
    
    public String toString(){
	String s = "";
	while(){
	}
	return s;
    }

    //add @ location i (0 at front)
    //error if you try to add part to the end
    public void add(int i, String s){
	if(i >= length() - 1){
	    throw new IndexOutOfBoundsException();
	}
	Node temp = head;
	if(i == 0){
	    add(s);
	}
	while(i != 1){
	    temp = temp.getNext();
	    i -= 1;
	}
	Node temp2 = temp.getNext();
	temp.setNext(new Node(s));
	temp.getNext().setNext(temp2);
    }

    //returns the String @ location i
    public String get(int i){
	if(i >= length() - 1){
	    throw new IndexOutOfBoundsException();
	}
	Node temp = head;
	if(i == 0){
	    return temp;
	}
	while(i > 0){
	    temp = temp.getNext();
	    i -= 1;
	}
	return temp;
    }
    
    public String set(int i, String s){
	if(i >= length() - 1){
	    throw new IndexOutOfBoundsException();
	}
	Node temp = head;
	if(i == 0){
	    Node hold = head.getNext();
	    add(s);
	    head.setNext(hold);
	}
	while(i != 1){
	    temp = temp.getNext();
	    i -= 1;
	}
	Node hold = temp.getNext();
	temp.setNext(new Node(s));
	temp.getNext().setNext(hold);
    }

    //work on the case where i = 0
    public String remove(int i){
	int n = 0;
	temp = head.getNext();
	t2 = head;
	while(n < i){
	    t2 = temp;
	    temp=temp.getNext();
	    n++;
	}
	t2.setNext(temp.getNext());
    }
}
	    
	    
	 
	
	
	
	

}