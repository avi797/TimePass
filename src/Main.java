import java.util.*;
public class Main {
	

		
		public static void BubbleSort(int array[]) {
			
			int n = array.length;
			
			
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-1-i;j++) {
					if(array[j]>array[j+1]) {
						int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
					}
				}
				
			}
			
			
		}
		
		public static void main(String[] agrs) {
			
			
		Scanner sc= new Scanner(System.in);
		System.out.println("hey!! welcome to program");
		System.out.println("enter the size of an array ");
		int size = sc.nextInt();
		
		System.out.println("enter the elements of an array ");
		int array[]= new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]= sc.nextInt();	
		}
		
		System.out.println("Array Before Bubble Sort");
		for(int i = 0; i < array.length; i++) {
	        System.out.print(array[i] + " ");
	     }
		System.out.println();
		BubbleSort(array);
		
		 System.out.println("Array After Bubble Sort");

	     for(int i = 0; i < array.length; i++) {
	        System.out.print(array[i] + " ");
	     }
		}
		

	}



