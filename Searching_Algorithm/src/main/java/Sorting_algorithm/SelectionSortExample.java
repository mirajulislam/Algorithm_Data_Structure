package Sorting_algorithm;

public class SelectionSortExample {
	
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
        
        selectionSort(arr1);
        for(int i:arr1){  
            System.out.print(i+" ");  
        } 
    }

	private static void selectionSort(int[] arr1) {


		for(int i=0;i<arr1.length;i++) {
			int index=i;
			
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[j]<arr1[index]){
					index=j;
				}
			}
			
			  int smallerNumber = arr1[index];   
	            arr1[index] = arr1[i];  
	            arr1[i] = smallerNumber;  
			
			}
		
	}

}
