//package dataStructure;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		//copair two array object using  == operator		
		if(arr1 == arr2)
		{
			System.out.println(" True returns by == operator ");
		}
		else
		{
			System.out.println(" False returns by == operator ");
		}
		
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("true retuns by  equals method of Arrays class of java.util package");
		}
	}

}
