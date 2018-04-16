package arraystring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	int id;
	String name;
	
	Employee(int pID, String pName){
		this.id = pID;
		name = pName;
	}
}

class EmplComparator implements Comparator<Employee>{
	
	
	public int compare(Employee e1, Employee e2){
		
		if(e1.id<e2.id) 
			return -1;
		else if(e1.id == e2.id)
			return 0;
		else
		   return 1;
	}
}

public class ComparatorExmpl {
	
	
	public static void main(String[] args) {
		
		List<Employee> eList  =  new ArrayList<Employee>();
		eList.add(new Employee(18, "Gary"));
		eList.add(new Employee(1, "Fenna"));
		eList.add(new Employee(12, "Shenna"));
		eList.add(new Employee(10, "Lenna"));
		eList.add(new Employee(5, "Tenna"));
		eList.add(new Employee(1, "Fenna"));
		
		Collections.sort(eList, new EmplComparator());
		
		for(Employee e: eList){
			System.out.println(" Employee ID "+e.id + ", Employee Name "+ e.name);
		}
		
		Employee r = new Employee(5, "");
		try{
		r.wait();
		r.notify();
		}catch(InterruptedException e){
			
		}
System.out.println("habibi habibi");
	}

}
