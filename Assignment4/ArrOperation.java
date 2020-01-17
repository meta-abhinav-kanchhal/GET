package assignment4;

import java.util.Scanner;

public class ArrOperation 
	{
	
	public int maxMirror(int[] a) 
		{
		int count = 0, i = 0, j = 0, max = -1;
		for (i = 0; i < a.length; i++) 
			{
			count=0;
		     int m=i;
			for (j = a.length-1; j >= 0 && m<a.length; j--) 
				{
				if (a[m] == a[j])
					{
					m++;
					count++;
					}	 
				else 
					{
					if(count>max )
						{
						max=count;
						}
					count=0;
					m=i+1;
					if(a[i]==a[j])
						{
						count+=1;
						}
					}
				}
			if(count>max)
				{
				max=count;
				}
			}
		return max;
	}


	
	public int countClump(int[] arr) 
		{
		int f = 0, c = 0, i = 1;
		for (i = 1; i < arr.length; i++) 
		{
			if (arr[i - 1] == arr[i] && i < arr.length) {
				f = 1;
				if (i != arr.length - 1)
					continue;
			}

			c = f + c;
			f = 0;
		}

		return c;
	}
	
	public  int[] fixXY(int[] a,int X,int Y)
	{
		int i=0,k=0,p;
		for(i=1;i<a.length;i++)
		{
			if(a[i-1]==X && a[i]!=Y)
			{
				for(k=1;k<a.length;k++)
				{
                     if(a[0]==Y){
                    	 p=a[0];
                    	 a[0]=a[i];
                    	 a[i]=p;
                     }
                     else if(a[k]==Y && a[k-1]!=X )
					{
						p=a[k];
						a[k]=a[i];
						a[i]=p;
					}
                     }
				
			}
				else if(a[i-1]==X && a[i]==Y)
					{
					continue;
					}
			
			}
		return a;
			
		} 
	
	
	public int splitString(int[] arr)
	{
		int i=0,j=arr.length-2,k=arr.length-1,m=0;
			
	do{
			int sum1=0,sum2=0;
		if(j>=0)
		{
			for(i=j;i>=0;i--)
				sum1=sum1+arr[i];
			}
			if(k>=0){
			for(m=arr.length-1;m>=k;m--)
				sum2=sum2+arr[m];
			if(sum1==sum2)
				return j+1;
			}
		
			j--;
			k--;
		}while(j>=0);
		
			return -1;
		}

	
	


}
