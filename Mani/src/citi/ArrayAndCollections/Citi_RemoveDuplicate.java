package citi.ArrayAndCollections;

public class Citi_RemoveDuplicate {
	public static int remove_duplicate(int arr[],int n) {
		if (n==0 || n==1) {
			return n;
		}
		int j=0; //for the next element
		for (int i=0; i< n-1; i++) {
			if (arr[i] !=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]= arr[n-1];
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("******************************************************");
System.out.println("\sjava prgm to remove duplicate elements in the list");
System.out.println("******************************************************");
int arr[]= {10,10,20,50,50,60,60,80,};
int length=arr.length;
length=remove_duplicate(arr,length);
for(int i=0; i<length;i++)
System.out.println(arr[i]+" ");
	}

}

