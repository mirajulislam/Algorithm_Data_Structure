package Searching_Algorithm.Searching_Algorithm.Linear_Search;

public class Linear_Search {

	public static void main(String[] args) {
		
		int[] a1= {10,20,50,50,70,90};    
        int key = 50;    
        
 
       linearSearch(a1, key); 
	}
	
	public static  void linearSearch(int[] arr, int key){
		
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                System.out.println(i+" ");  
            }    
        }    
          
    }   

}
