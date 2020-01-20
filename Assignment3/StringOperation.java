import java.util.Scanner;

/*Program for performing different string operations
 * like comparing, reversing, change of upper to lower case and vice versa, etc
 * @author Abhinav Kanchhal
 * */
public class StringOperation 
	{
	
	/*Function to compare two string
	 * @param str1 and str2 use to get two string
	 * */
	public int compare(String str1,String str2)
		{
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2)
				return 0;
		else
			for(int i=0;i<len1;i++)
				{
				if(str1.charAt(i)!=str2.charAt(i))
					{
					return 0;
					}	
				}
		return 1;
		}
	
	/*Function to reverse the the string
	 * @param str is use to get the string 
	 * @return s is use to return the reverse string
	 * */
	public String reverse(String str)
		{
		int len=str.length();
		String s=new String();
		for(int i=0;i<len;i++)
			{
			s+=str.charAt(len-1-i);
			}
		return s;
		}
	
	/*Function is use to convert upper case letter 
	 *of string to lower case and vice versa 
	 * @param str is use to get the string
	 * @return s is use to return converted string 
	 * */
	public String convert(String str)
		{
		int len=str.length();
		String s=new String();
		for(int i=0;i<len;i++)
			{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
				{
				s+=(char)(str.charAt(i)+32);
				}
			else
				if(str.charAt(i)>=97 && str.charAt(i)<=123)
					{
					s+=(char)(str.charAt(i)-32);
					}
				else
					s+=(char)(str.charAt(i));
			}
		return s;
		}
	
	/*Function to find largest word in a string
	 * @param str is use to get the string
	 * @return s is use to return largest word of string 
	 * */
	public String largestWord(String str)
		{
		int len=str.length();
		int count=0,max=-1,j=0;
		String s=new String();
		for(int i=0;i<len;i++)
			{
			if(str.charAt(i)!=' '&& i!=len-1)
				{
				count++;
				}
			else
				{
				if(i==len-1)
					{
					count++;
					i++;
					}	
				if(max <= count)
					{
					max=count;
					j=i-max;
					}
				count=0;
				}
			}
		for(int i=j;i<j+max;i++)
			{
			s+=str.charAt(i);
			}
		return s;
		}
	
	
	public static void main(String[] args) 
		{
		Scanner input = new Scanner(System.in);
		StringOperation s= new StringOperation();
		String str1,str2,str,convStr,largeWord;
		int comp;
		System.out.println("Enter the value of first string");
		str1=input.nextLine();
		System.out.println("Enter the value of second string");
		str2=input.nextLine();
		comp=s.compare(str1,str2);
		str=s.reverse(str1);
		convStr=s.convert(str1);
		largeWord=s.largestWord(str1);
		System.out.println("\nThe result of compare is "+comp);
		System.out.println("\nThe reverse String is \n"+str);
		System.out.println("\nThe converted String is \n"+convStr);
		System.out.println("\nThe largest word in the string is \n"+largeWord);
		input.close();
		}
       
	}

