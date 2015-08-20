//package dataStructure;

public class MyCaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Integer values are cached from -128 to 127 in java 
		    //so it will return the value from cache (memory location in
		    //RAM only)
		
		
		//case 1: large integer 
		Integer a=2000;
		Integer b=2000;
		
		//this will return false because it is out of caching size limit and 
		//as both references refer to different object they will return false
		if(a==b)
		{
			System.out.println("a == b returns true");
		}
		else
		{
			System.out.println(" a !=b  ");
		}
		
		//case 2:affect of caching in java
		Integer c=20;
		Integer d=20;
		if(c == d)
		{
			System.out.println("c == d returns true");
		}
		else
		{
			System.out.println(" c !=d  ");
		}
		
	}

}
