package arraystring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add addLmda = (a,b) -> a+b;
		System.out.println(addLmda.add(1, 2));
		
		List <Person> list = new ArrayList<Person>(10);
		list.add( new Person(35, "Mark", "Zuckerburge"));
		list.add( new Person(40, "Amy", "Jackson"));
		list.add( new Person(50, "Jeff", "Bezos"));
		list.add( new Person(100, "Steve", "Jobs"));
		
		/*Collections.sort( list, (new Comparator<Person>(){
			
			public int compare(Person l1, Person l2){
				
				return l1.lNm.compareTo(l2.lNm);
			}
		}));
		
		for(Person p: list){
			System.out.println(p.lNm);
		}*/
		
		Comparator<Person> cmpLmda = (Person p1, Person p2) -> p1.lNm.compareTo(p2.lNm);
		Collections.sort( list, ((Person p1, Person p2) -> p1.lNm.compareTo(p2.lNm)));
		
		for(Person p: list){
			System.out.println(p.lNm);
		}
		
		

	}
	
	interface Add{
		public int add(int a, int b);
	}
}

class Person{
	int age;
	String fNm;
	String lNm;
	
	public Person(int a, String fn, String Ln){
		age = a;
		fNm = fn;
		lNm = Ln;
	}
}


