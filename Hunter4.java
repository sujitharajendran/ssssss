package rsrs;

import java.util.Scanner;

public class Hunter4 {

	public static void main(String[] args) {
	System.out.println("enter the size of the element");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		int s[]=new int[n];
		int ts=0;
	for(int i=0;i<n;i++)
	{
		s[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=1+1;j<n;j++)
		{
			if(s[i]!=s[j])
			{
			ts = s[0];
			}
		}
		
	}
	System.out.println(ts);
	}

}
