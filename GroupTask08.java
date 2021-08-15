package GroupProject01;

public class GroupTask08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int arr[] = { 1, 2 , 3 , 4, 5 , 6 , 7, 8 };
		    int largest = arr[0];
		    int secondLargest = arr[0];
		   
		    System.out.println("The given array is:" );
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i]+" ");
		      
		    }
		    for (int i = 0; i < arr.length; i++) {
		
		      if (arr[i] > largest) {
		        secondLargest = largest;
		        largest = arr[i];
		
		      } else if (arr[i] > secondLargest) {
		        secondLargest = arr[i];
		
		      }
		    }
		    System.out.println();
		    System.out.println("Second largest number is:" + secondLargest);
		
		  }
			
		
	}


