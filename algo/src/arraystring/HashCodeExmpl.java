package arraystring;

import java.util.HashMap;
import java.util.Map;

public class HashCodeExmpl {

	public static void main(String[] args) {

	   Map<Teacher, String> map = new HashMap<Teacher, String>();
       map.put((new Teacher(1,1)), "Rajesh");
       map.put((new Teacher(1,2)), "Rahul");
       map.put((new Teacher(2,1)), "Amit");
       map.put((new Teacher(1,1)), "Ganesh");
       
       for(Teacher c: map.keySet()){
    	   System.out.println(": DeptId "+c.deptId + ", "+  map.get(c));
       }

	}

}

class Teacher {
	int empId;
	int deptId;
	
	public Teacher (int id, int dId){
		empId = id;
		deptId = dId;
		
	}
	
	@Override
	public boolean equals(Object o1){
		
		if(this == o1)
			return true;
		
		if(o1 == null || this.getClass() != o1.getClass())
			return false;
		
		
		return ( this.empId == ((Teacher)o1).empId);
	}
	
	@Override
	public int hashCode(){
		return this.deptId;
	}
	
}
