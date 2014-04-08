public class myStack{
    private int top;
    private int[] list;

    public myStack(){
	list = new int[10];
	top = -1;
    }
    
    public void grow(){
	if(top > list.length){
	    int[] temp = new int[list.length+1];
	    System.arraycopy(list,0,temp,0,list.length);
	    list = temp;
	}
    }
	
    public void push(int i){
        grow();
	list[top + 1] = i;
	top++;
    }

    public int pop(){
	int ret = list[top];
	list[top] = 0;
	if(top != 0){
	    top--;
	}
	return ret;
    }

    public int peek(){
	return list[top];
    }

    public boolean isEmpty(){
	return top == -1;
    }
    
    public String toString(){
	String resp = "";
        for(int i = top; i >= 0; i--){
            resp += list[i] + ", ";
	}
	return resp.substring(0, resp.length()-2);
    }
	    
}
