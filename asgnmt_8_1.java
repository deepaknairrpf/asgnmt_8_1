import java.util.*;
public class asgnmt_8_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		ArrayList<String> al = new ArrayList<String>();
		al.add("Deepak");
		al.add("AcadGild");
		al.add("Java");
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		al.add(temp);
	 Iterator itr=al.iterator();
	 System.out.println("The elements in the array list are");
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 
		
		

	}

}
