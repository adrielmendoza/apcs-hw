import java.util.*;
import java.util.Arrays;

public class QuickSort{
    public int[] QuickSort(int[] a){
	int low = 0;
	int high = a.length - 1;
	if(a.length <= 1){
	    return a;
	}
	int i = (int)((Math.random() * (high - low)) + low);
	int pivot = a[i];
	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();
	for(int j = 0; j < a.length; j++){
	    if(pivot > a[j]){
		left.add(a[j]);
	    }
	    if(pivot < a[j]){
		right.add(a[j]);
	    }
	}
	int[] leftA = new int[left.size()];	
	int[] rightA = new int[right.size()];
	for(int x = 0; x < left.size(); x++)
	    leftA[x] = left.get(x);
	for(int x = 0; x < right.size(); x++)
	    rightA[x] = right.get(x);
	leftA = QuickSort(leftA);
	rightA = QuickSort(rightA);
	ArrayList<Integer> hold = new ArrayList<Integer>();
	for(int j = 0; j < leftA.length; j++){
	    hold.add(leftA[j]);
	}
	hold.add(pivot);
	for(int j = 0; j < rightA.length; j++){
	    hold.add(rightA[j]);
	}				   
	int[] resp = new int[a.length];
	for(int j = 0; j < a.length; j++){
	    resp[j] = hold.get(j);
	}
	return resp;    
    }

    public static void main(String[] args){
	QuickSort q = new QuickSort();
	int[] a = {9, 27, 15, 1, 12, 13, 17, 54, 162, 15425, 66, 3};
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(q.QuickSort(a)));
    }
}
	
	
