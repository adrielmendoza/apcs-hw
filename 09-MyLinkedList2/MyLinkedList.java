public class MyLinkedList{
    private Node head;				
    private int length;

    public MyLinkedList(){
	head = new Node("dummy");
	length = 0;
    }

    public void add(String d){
	Node tmp = new Node(d);
	//head = tmp;
	tmp.setNext(head);
	head = tmp;
	length++;
    }
    
    public String toString(){
        String s = "";
	Node tmp = head;
	while (tmp != null) {
	    s += tmp + ", ";
	    tmp = tmp.getNext();
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
	length++;
    }

    //returns the String @ location i
    public String get(int i){
	if(i >= length - 1){
	    throw new IndexOutOfBoundsException();
	}
	Node temp = head;
	if(i == 0){
	    return temp.getData();
	}
	while(i > 0){
	    temp = temp.getNext();
	    i -= 1;
	}
	return temp.getData();
    }
    
    public String set(int i, String s){
	String resp = "";
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
	resp += temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return resp;
    }

    //remove and return the String at i, exception on error
    public String remove(int i){
	int n = 0;
	String resp = "";
	Node temp = head.getNext();
	Node t2 = head;
	if(i == 0){
	    resp += head.getData();
	    head = head.getNext();
	    return resp;
	}
	if(i >= length() - 1){
	    throw new IndexOutOfBoundsException();
	}
	while(n < i){
	    t2 = temp;
	    resp += temp.getData();
	    temp=temp.getNext();
	    n++;
	}
	t2.setNext(temp.getNext());
	return resp;
    }

    public int find(String s){
	Node pos = head;
	for(int i = 0; i < length; length++){
	    if(pos.getData().equals(s)){
		return i;
	    }
	    pos = pos.getNext();
	}
	return -1;
    }
    
    public int length(){
	return length;
    }	
}
	    
	    
