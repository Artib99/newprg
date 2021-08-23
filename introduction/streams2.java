package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class streams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Abijeet");
		names1.add("Adam");
		names1.add("gil");
		names1.add("Atarv");
		names1.add("briar");
int count=0;
		for(int i=0;i<names1.size();i++)
		{
			String actual = names1.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}

	public void streamfilter()
	{
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Abijeet");
		names1.add("adam");
		names1.add("gil");
		names1.add("Atarv");
		names1.add("briar");
		
		Long c = names1.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		Long d = Stream.of("Abijeet","adam","gil","Atarv","briar").filter(s->
		{
			s.startsWith("A");
			return true;
			
		}).count();
		System.out.println(d);
		//print all the names of arraylist where the length of the name is > 4
		names1.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//prints 1 name from the arraylist whose length of the name is >4
		names1.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	public void streamMap()
	
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abijeet");
		names.add("adam");
		names.add("gil");
		names.add("Atarv");
		//print the names  which have last letter as ' a' with uppercase
		//ex:Atarva to 'ATARVA'
		Stream.of("Abijeet","adam","gil","Atarva","briara").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		
		//print names which have first leter as 'a' with uppercase sorted
		List<String>names1=Arrays.asList("Abijeet","adam","gil","Atarva","briara");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//merging 2 different lists
		Stream<String> newstream = Stream.concat(names.stream(), names1.stream());
		newstream.forEach(s->System.out.println(s));
		boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
   public void streamcollect()
   {
	   //collect method used to collect your results and convert back to list
	  List<String> ls =  Stream.of("Abijeet","adam","gil","Atarva","briara").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
	   System.out.println(ls.get(0));
	   
	   List<Integer> values =Arrays.asList(5,2,3,5,5);
	   //print the unique numbers of the array
	   //sort the array - after sort print 3rd index (2,3,5,5,5) i.e '5'
	//   values.stream().distinct().forEach(s->System.out.println(s));
	  List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
	  System.out.println(li.get(2));
	   
	   
   }
}

