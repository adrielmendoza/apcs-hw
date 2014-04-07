public class myStack{
    private int top;
    private String[] list;

    public myStack(){
	list = new String[10];
	top = -1;
    }
    
    public void grow(){
	if(top > list.length){
	    String[] temp = new String[list.length+1];
	    System.arraycopy(list,0,temp,0,list.length);
	    list = temp;
	}
    }
	
    public void push(String s){
        grow();
	list[top + 1] = s;
	top++;
    }

    public String pop(){
	String ret = list[top];
	list[top] = null;
	top--;
	return ret;
    }

    public String peek(){
	return list[top];
    }

    public boolean isEmpty(){
	return top == -1;
    }
    
    public String toString(){
	String resp = "";
	for(String s: list){
	    if(s != null){
		resp += s + ", ";
	    }
	}
	return resp.substring(0, resp.length()-2);
    }
	    
}
