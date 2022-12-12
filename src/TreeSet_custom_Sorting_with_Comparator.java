import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class myComparator implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		
		if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else
			return 0;
	}
}

public class TreeSet_custom_Sorting_with_Comparator 
{
	public static void main(String[] args) 
	{
		// WAP to display integer TreeSet object in descending order
		
		Set<Integer> treeset=new TreeSet<Integer>(new myComparator()); 
		/*
		 * If we not passing above argument then JVM will call compareTo() which is meant for default 
		 * natural sorting but we need to sort in our own way i.e. custom sorting then JVM will consider 
		 * this comparator object which is passed in constructor and call compare() method.
		 * 
		 * In Comparator there is two method:
		 * 		1) compare()
		 * 		2) .equals() -> This is optional because object level .equals() is called so only compare 
		 * 		   method will call even comparator is Interface.
		 */
		
		treeset.add(5); 
		treeset.add(45); // compare(45,5) it will return -ve
		treeset.add(4);
		treeset.add(36);
		treeset.add(36); 
		treeset.add(94);
		
		System.out.println(treeset); // After comparator it will return descending order 

	}

}
