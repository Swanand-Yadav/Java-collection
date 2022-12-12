import java.util.Set;
import java.util.TreeSet;

public class TreeSet_default_natural_Sorting_with_Comparable 
{
	public static void main(String[] args) 
	{
		Set<Integer> treeset=new TreeSet<Integer>(); // OR TreeSet<Integer> treeset=new TreeSet<Integer>();
		
		treeset.add(5);
		treeset.add(45);
		treeset.add(4);
		treeset.add(36);
		treeset.add(36); // It can not take duplicates elements also
		treeset.add(94);
		//treeset.add(null);
		
		/*
		 * We can take only one null in empty treeSet but not with any element should be there because 
		 * if we take null then while sorting it trying to compare the element to each other so it found 
		 * null and we can not compare with null so it gives NullPointerException at runtime.
		 * 
		 * Also we can not take Heterogeneous elements because while sorting we can not sort with integer
		 * to String or vice-versa or with any element.
		 * 
		 * For Default sorting there are two rules:
		 * 			1) Elements should be homogeneous.
		 * 			2) Elements should be comparable. ( should be like this c.add("A") but not 
		 * 			   c.add(new StringBuffer("A")) Because String class implements Comparable(I) but 
		 * 			   not StringBuffer class )
		 * 
		 * In Comparable there is only one method: compareTo()
		 * 
		 * Internally JVM will call obj.compareTo(obj1) method to sort default/natural sorting.
		 */
		
		System.out.println(treeset); // While printing they don't have any insertion order.
	}

}
