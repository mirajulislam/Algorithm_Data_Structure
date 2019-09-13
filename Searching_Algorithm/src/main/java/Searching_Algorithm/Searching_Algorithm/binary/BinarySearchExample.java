package Searching_Algorithm.Searching_Algorithm.binary;

public class BinarySearchExample {

	public static void main(String[] args) {
		 int arr[] = {1,2,3,4,5,6,7,8,9,11,12,13};  
	        int key =5;  
	        int last=arr.length-1;  
	        binarySearch(arr,0,last,key);     
	}
	 // 1,2,3,4,5,6,7,8,9,11,12,13;
	 //key=5
	
//	1st step
	 //mid=0+12/2=6
	//arr[mid]=6
	//arr[mid]<key
	//6<5 it is false;
	//arr[mid] == key
	//6==5 it is also false
    //6>5 true
	//last=mid-1=6-1=5
	
	
	
//	2nd step
//	first=0;last=5, mid=(first+last)/2=3
	
	
	
	public static void binarySearch(int arr[], int first, int last, int key) {
		 int mid = (first + last)/2;   
	 
		  while( first <= last ){ 
			  if ( arr[mid] < key ){  
			        first = mid + 1;    
			        
			      }else if(arr[mid] == key) {
			    	  
			    	  System.out.println(mid);
			    	  break;
			      }else {
			    	  last=mid-1;
			      }
			  
			  mid=(first+last)/2;
		  }
		  if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }
		 
		
	}

}
