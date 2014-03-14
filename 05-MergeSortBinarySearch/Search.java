public class Search{
    public int rbsearch(int[] L, int n, int low, int high){
	int mid = (low + high)/2;
	if(L[mid] < n){
	    return rbsearch(L, n, mid + 1, high);
	}else if(L[mid] == n){
	    return mid;
	}else if(L[mid] > n){
	    return rbsearch(L, n, low, mid - 1);
	}else{
	    return -1;
	}
    }

    public int ibsearch(int[] L, int n, int low, int high){
	int mid = (low + high)/2;
	while((L[mid] != n) && (low <= high)){
	    if(L[mid] > n){
		low = mid + 1;
	    }else{
		high = mid - 1;
	    }
	}
	if(low == high){
	    return mid;
	}else{
	    return -1;
	}
    }

    public static void main(String[] args){
	Search s = new Search();
	int[] i = {1, 3, 5, 6, 7, 8, 10, 12, 13, 15, 17, 18, 21, 23, 27};
	System.out.println("Should return 4");
	System.out.println(s.rbsearch(i, 7, 0, 14));
	System.out.println("Should return 9");
	System.out.println(s.rbsearch(i, 15, 0, 14));
    }			 
}
	
