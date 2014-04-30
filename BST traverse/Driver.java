public class Driver{
    public static void main(String[] args){
	BST tree = new BST();
	tree.insert(4);
	tree.insert(7);
	tree.insert(14);
	tree.traverse(tree.root);
    }
}