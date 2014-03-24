public class LLDriver{
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();
	
	L.add("Sully");
	System.out.println(L);
	L.add("Mike"); 
	System.out.println(L);
	L.add("Randall");
	System.out.println(L);
	L.add("Boo");
	System.out.println(L);
	L.set(3, "hi");
	System.out.println(L);
    }
}
