package sort;

public class InterpolationSearch {

	public static void main(String[] args) {
		
       int [] arr = {3, 10, 14, 29, 37, 48, 55, 67, 72, 87};
       int pos = intPolSrch(55, arr, 0, 9);
       System.out.println("Item found at position "+pos);
	}

	public static int intPolSrch(int pItem, int arr[], int pLow, int pHigh) {
		
		if(pItem<arr[pLow] || pItem > arr[pHigh]) {
			System.out.println("Item doesn't exist");
			return -1;
		}
		
		int pos = pLow + ((pItem - arr[pLow]) * (pHigh-pLow)) / (arr[pHigh] - arr[pLow]);
		
		if(arr[pos] == pItem) {
			return pos;
		}else {
			if(pItem < arr[pos]) {
				return intPolSrch(pItem, arr, pLow, pos-1);
			}else {
				return intPolSrch(pItem, arr, pos+1, pHigh);
			}
		}
		
	}
}
