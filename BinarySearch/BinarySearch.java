package BinarySearch;

public class BinarySearch {

	static int binarySearch(int []arrayToSearchFrom,int numberToSearch){

		int low=0;
		int high=arrayToSearchFrom.length;
		int mid;

		while(low<=high){
			mid=(low+high)/2;
			if(arrayToSearchFrom[mid]<numberToSearch){
				low=mid+1;
			}
			else if(arrayToSearchFrom[mid]>numberToSearch){
				high=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;//error
	}

	static int binarySearchRecursive(int[] array,int searchNumber,int low,int high){
		if(low>high) return -1;//error

		int mid=(low+high)/2;
		if(array[mid]<searchNumber){
			return binarySearchRecursive(array,searchNumber,mid+1,high);

		}
		else if(array[mid]>searchNumber){
			return binarySearchRecursive(array,searchNumber,low,mid-1);

		}
		else {
			return mid;
		}
	}
}
