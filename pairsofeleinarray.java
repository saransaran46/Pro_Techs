import java.util.Scanner;
public class pairsofeleinarray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int num = sc.nextInt();
		System.out.println("enter the size of an array:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("array elements are .....");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("");
		int count = 0;
		System.out.println("Pairs of elements are....");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] + arr[i] == num)
				{
					count++;
					System.out.println("("+arr[i]+","+arr[j]+")");
					
				}
			}
		}
		System.out.println("total pairs of elements counted..."+count);
		
	}
}
