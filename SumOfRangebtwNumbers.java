import java.util.Scanner;
class SumOfRangeBtwTheNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array ");
		int size = sc.nextInt();
		int N[] = new int[size];
		System.out.println("sum total");
		int sum = sc.nextInt();
		int res = 0;
		int x=0;
		int y=0;
		System.out.println("array elements are:");
		for(int i=0;i<N.length;i++)
		{
		    N[i] =sc.nextInt();
		}
		for(int i=0;i<N.length;i++)
		{
		    res = N[i];
		    for(int j=i+1;j<N.length;j++)
		    {
		        res = res + N[j];
		        if(res == sum)
		        {
		        x=i+1;
		        y= j+1;
		        break;
		        }
		    }
		    if(res == sum)
		        {
		        break;
		        }
		}
		System.out.println("the range of the index sum is:"+x+" "+y);
	}
}
