import java.util.Scanner;
public class AddUncommonEleInArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array 1111:");
		int m = sc.nextInt();
		int arr[] = new int[m];
		System.out.println("Enter the array 1111 elements based on the size:");
		for(int i=0;i<m;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
		System.out.println("Enter the size of the array 2222:");   
		int n = sc.nextInt();
		int arr2[] = new int[n];
		System.out.println("Enter the array 2222 elements based on the size:");
	    for(int i=0;i<n;i++)
		{
	       arr2[i] = sc.nextInt();
        }
        
		int sum = 0;
		for(int i=0;i<m;i++)
		{
		    int temp = 1;
		    for(int j=0;j<n;j++)
		    {
		        if(arr[i] == arr2[j])
		        {
		            temp = 0;
		            break;
		        }
		    }
		    if(temp == 1)
		    {
		        sum += arr[i];
		    }
		}
	
		for(int j=0;j<n;j++)
		{
		    int temp =1;
		    for(int i=0;i<m;i++)
		    {
		        if(arr2[j] == arr[i])
		        {
		            temp = 0;
		            break;
		        }
		    }
		    if(temp == 1)
		    {
		        sum += arr2[j];
		    }
		}
		System.out.print("The sum of the uncommon elements"+"   ---"+sum);
	}
}
