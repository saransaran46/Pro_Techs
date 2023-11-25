import java.util.*;
class VowelConsonentCountSort
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next().toLowerCase();
        String vow="";
        String con="";
        int countvow=0;
        int countcon=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                countvow++;
                vow=vow+str.charAt(i);
            }
            else
            {
                countcon++;   
                con = con+str.charAt(i);
            }
        }
        System.out.println(countvow + "vowels count");
        System.out.println(countcon + "consonents count");
        System.out.println(vow);
        System.out.println(con);
        char cons[]=con.toCharArray();
        char vows[]=vow.toCharArray();
        for(int i=0;i<cons.length;i++)
		{
		    for(int j=i+1;j<cons.length;j++)
		    {
		        if(cons[i]>cons[j])
		        {
		            char a = cons[i];
		            cons[i] = cons[j];
		            cons[j] = a;
		        }
		    }
		}
		System.out.println(cons);
		for(int i=0;i<vows.length;i++)
		{
		    for(int j=i+1;j<vows.length;j++)
		    {
		        if(vows[i]>vows[j])
		        {
		            char a = vows[i];
		            vows[i] = vows[j];
		            vows[j] = a;
		        }
		    }
		}
		System.out.println(vows);
        Arrays.sort(vows);
        System.out.println(vows);
        Arrays.sort(cons);
        System.out.println(cons);
        System.out.print(cons);
        System.out.print(vows);
    }
}