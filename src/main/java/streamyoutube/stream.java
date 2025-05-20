package streamyoutube;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a list and filter all even numbers.
//		List<Integer> l = new ArrayList<>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		l.add(4);
//		l.add(5);
		
		List<Integer> l1 =	Arrays.asList(11,2,3,4,5);
		List<Integer> levenlist = new ArrayList<>();
//		l.stream().filter(e->e%2==0).collect()
		
		for (Integer integer : l1) {
			if(integer % 2 ==0)
			{
				levenlist.add(integer);
			}
		}
		System.out.println(levenlist);
		
		List<Integer> newevenlist = l1.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println(newevenlist);
		
		List<Integer> newevenlist1=l1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(newevenlist1);
		
	}

}
