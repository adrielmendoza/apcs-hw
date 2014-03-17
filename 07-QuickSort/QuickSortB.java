import java.util.*;
import java.util.Arrays;

//I'm not sure where I am supposed to recursively call this

public class QuickSortB{
    public static int[] partition(int[] a, int L, int R){
	int pivind = ((R - L) / 2) + L;
	int temp = a[R];
	a[R] = a[pivind];
	a[pivind] = temp;
	int wall = L;
	for(int i = L; i < R - 1; i++){
	    if(a[i] < a[wall]){
		temp = a[i];
		a[i] = a[wall];
		a[wall] = temp;
		wall++;
	    }else{
		temp = a[i];
		a[i] = a[wall + 1];
		a[wall + 1] = temp;
	    }
	}
	a[R] = a[wall];
	a[wall] = a[pivind];
	return a;
    }

    public static int[] qsort2(int[] a){
	if(a.length <= 1){
	    return a;
	}
	return partition(a, 0, a.length - 1);
    }

    public static void main(String[] args){
	int[] i = {12, 1, 16, 4, 21, 19, 6, 22, 3, 15, 54, 10};
	System.out.println(Arrays.toString(i));
	System.out.println(Arrays.toString(qsort2(i)));
    }
}
	
