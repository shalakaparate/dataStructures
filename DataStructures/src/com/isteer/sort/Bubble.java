package com.isteer.sort;

public class Bubble {

	void bubbleSort(int arr[], int n)
	{
	    int i, j, temp;
	    for(i = 0; i < n; i++)
	    {
	        for(j = 0; j < n-i-1; j++)
	        {
	            if( arr[j] > arr[j+1])
	            {
	                // swap the elements
	                temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            } 
	        }
	    }
	}
	public void display(int arr[],int n)
	{
	    // print the sorted array
	    System.out.println("Sorted Array: ");
	    for(int i = 0; i < n; i++)
	    {
	        System.out.println( arr[i]);
	    }
	}
}
