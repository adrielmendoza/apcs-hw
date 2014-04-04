import java.io.*;
import java.util.*;

public class MyLLIterator<E> implements Iterator{
    private Node current;

    public MyLLIterator<E>(Node n){
	current = n;
    }

    public boolean hasNext(){
	if(current != null){
	    return true;
	}
	return false;
    }

    public E next(){
	E data = current.getData();
	current = current. current.getNext();
	return data;
    }
    
    public void remove(){}
}