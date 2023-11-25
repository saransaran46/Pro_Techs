import java.util.Scanner;
public class ReverseArrWithInValue
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int N = sc.nextInt();
		int arr[] = new int[N];
		System.out.println("reverse size");
		int k = sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int  i=0;i<N;i++)
		{
		    arr[i]=sc.nextInt();
		    /*int temp = N-k;
		    if(i==temp)
		    {
		        i++;
		        //int res = arr[i];
		        System.out.print(arr[i]+" ");
		        break;
		    }
		}
		for(int  i=0;i<k;i++)
		{
		    System.out.print(arr[i]+" ");
		}*/


		}
		System.out.println("The result:");
		for(int i=N-1;i>k;i--)
		{
		    System.out.print(arr[i]+" ");
		}
		for(int i=0;i<=k;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
