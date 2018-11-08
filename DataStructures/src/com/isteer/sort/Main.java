package com.isteer.sort;

import java.util.*;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i=0, n;
		 Scanner scan = new Scanner(System.in);
		 int[] arr = new int[100];
		 Bubble b = new Bubble();
		    // ask user for number of elements to be sorted
		    System.out.println("Enter the number of elements to be sorted: ");
		    n = scan.nextInt();
		    // input elements if the array
		    System.out.println("Enter the elements:");
		    for(i = 0; i < n; i++)
		    {
		        
		        arr[i] = scan.nextInt();
		    }
		    // call the function bubbleSort
		    b.bubbleSort(arr, n);
		    b.display(arr, n);
		    
		    
	}

}
