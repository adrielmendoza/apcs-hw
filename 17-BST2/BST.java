public class BST{
    private Node root;

    public BST(){
	root = null;
    }

    public void insert(int x){
	Node n = new Node(x);
	if(root == null){
	    root = n;
	    return;
	}
	Node curr = root;
	while(true){
	    if(n.getData() > curr.getData()){
		if(curr.getRight() == null){
		    curr.setRight(n);
		    return;
		}
		curr = curr.getRight();
	    }else if(n.getData() < curr.getData()){
		if(curr.getLeft() == null){
		    curr.setLeft(n);
		    return;
		}
		curr = curr.getLeft();
	    }
	}
    }

    public Node search(int x){
	Node curr = root;
	while(curr != null && curr.getData() != x){
	    if(curr.getData() > x){
		curr = curr.getLeft();
	    }else{
		curr = curr.getRight();
	    }
	}
	return curr;
    }

    public Node search2(Node n, int x){
	if(n.getData() == x || n == null){
	    return n;
	}
	if(n.getData() > x){
	    return search2(n.getLeft(), x);
	}else{
	    return search2(n.getRight(), x);
	}
    }

    public Node delete(int x) {
	Node n = search(x);
        if(n == null){
            return n;
	}else if((n.getLeft() == null) && (n.getRight() == null)){
	    n = null;
	}else if((n.getLeft() != null)  && (n.getRight() == null)){
	    n = n.getLeft();
	    n.setLeft(null);
        }else if((n.getLeft()==null)&&(n.getRight()!=null)){
	    n = n.getRight();
	    n.setRight(null);
	}
	return n;

    }
}


