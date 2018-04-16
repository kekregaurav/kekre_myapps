package sort;

class ShellSort {
	
	int [] list = null;
	
	public ShellSort (int listSize){
		list = new int [listSize];
	}
	
	public void addValues (int pInt, int pPstn){
		
		if(list != null && pPstn < list.length ){
			list[pPstn] = pInt;
		}
	}
	
   
	public void displayList(){
		
		if(list !=null){
			for (int val: list){
				System.out.print(val+ " | " );
			}
		}
	}
	
	
	public void sort(){
		
		int interval = 0;
		
		while (interval < list.length/3){
			interval = interval * 3 + 1;
		}
		
		/*while(interval >= 1){
			
			for(int i = 0; i<list.length; i++){
				
				if(i+interval < list.length && list[i+interval] > list[i]){
					list[i] = list[i+interval] + list[i];
					list[i+interval] = list[i] - list[i+interval];
					list[i] = list[i] - list[i+interval];
					this.displayList();
					System.out.println();
				}
			}
			
			interval = (interval - 1)/3;
		}*/
		
		int inner = 0, outer = 0, temp = 0;
		
		while(interval>0) // decreasing h, until h=1
		{
			// h-sort the file
			for(outer=interval; outer<list.length; outer++)
			{
				temp = list[outer];
				inner = outer;
				
				while(inner > interval-1 && list[inner-interval] <= temp)
				{
					list[inner] = list[inner-interval];
				    inner -= interval;
				    
				}
				list[inner] = temp;
				System.out.println();
			    this.displayList();
				System.out.println();
			} // end for
			interval = (interval-1) / 3; // decrease h
		}
		
	}
	
	
}


public class RunShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShellSort ss = new ShellSort(10);
		
		ss.addValues(7, 0);
		ss.addValues(10, 1);
		ss.addValues(1, 2);
		ss.addValues(9, 3);
		ss.addValues(12, 4);
		ss.addValues(11, 5);
		ss.addValues(4, 6);
		ss.addValues(8, 7);
		ss.addValues(15, 8);
		ss.addValues(2, 9);
		
		System.out.print("List before shell sorting : " );
		ss.displayList();
		
		ss.sort();
		System.out.print("List after shell sorting : " );
		ss.displayList();
	}

}
