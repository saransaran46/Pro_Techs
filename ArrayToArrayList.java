import java.util.*;

public class ArrayToArrayList
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		System.out.println("The length of the longest bitonic subarray is"+n);
		List<Integer> cl =new ArrayList<Integer>(arr.length);
		for(int i:arr)
		{
		    cl.add(i);
		}
		System.out.println("The longest bitonic subarray is"+cl);
	}
}
