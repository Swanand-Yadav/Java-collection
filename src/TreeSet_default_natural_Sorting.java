import java.util.Set;
import java.util.TreeSet;

public class TreeSet_default_natural_Sorting 
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
		 * to String or vice-versa or with any element
		 */
		
		System.out.println(treeset); // While printing they don't have any insertion order.
	}

}
