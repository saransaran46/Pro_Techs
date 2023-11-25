import java.util.Scanner;
import java.io.*;
class MaximumPossDiffer
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
	System.out.println("Enter array elements :");
	for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int subset__1 = 0;
        int subset__2 = 0;
        for(int i=0;i<size;i++)
        {
            boolean isSingleOcuurance = true;
            for(int j=i+1;j<size;j++)
            {
                if(arr[i] == arr[j])
                {
                    isSingleOcuurance = false;
                    arr[i] = arr[j] = 0;
                    break;
                }
            }
            if(isSingleOcuurance)
            {
                if(arr[i] > 0)
                {
                    subset__1+=arr[i];
                }
                else
                {
                    subset__2+=arr[i];
                }
            }
        }
        int res = 0;
        res = subset__1 - subset__2;
        System.out.print("total difference of the maximum subarray"+res);
    }
}