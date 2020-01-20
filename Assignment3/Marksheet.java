import java.util.Scanner;

/*Program to calculate average, max. marks
 * min. marks, percent of student pass
 * @author Abhinav kanchhal
 * */
public class Marksheet 
	{
	/*Function to calculate average marks of students
	 * @param g[] is array of marks obtained by students
	 * @param n is the no. of students
	 * @return average marks as avg/n
	 * */
	public float average(float g[],int n)
		{
		float avg=0;
		for(int i=0;i<n;i++)
			avg=avg+g[i];
		return avg/n;
		}
	
	/*Function to calculate max. obtained marks
	 * @param g[] is array of marks obtained by students
	 * @param n is the no. of students
	 * @return mx is use to return max. marks 
	 * */
	public float max(float g[],int n)
		{
		float mx=g[0];
		for(int i=1;i<n;i++)
			{
			if(mx<g[i])
				
				mx=g[i];
			}	
		return mx;
		}
	
	/*Function to calculate min. obtained marks
	 * @param g[] is array of marks obtained by students
	 * @param n is the no. of students
	 * @return mn is use to return min. marks
	 * */
	public float min(float g[],int n)
		{
		float mn=g[0];
		for(int i=1;i<n;i++)
			{
			if(mn>g[i])
				{
				mn=g[i];
				}
			}
		return mn;
		}
	
	/*Function to percentage of students pass
	 * @param g[] is array of marks obtained by students
	 * @param n is the no. of students
	 * @return perc is use to return percentage of student pass
	 * */
	public float perOfStudPass(float g[],int n)
		{
		float perc;
		int count=0;
			for(int i=0;i<n;i++)
				{
				if(g[i]>40)
					{
					count++;
					}
				}
		perc=count*100/n;
		return perc;
		}
	
	
	public static void main(String[] args)
		{
		Marksheet m= new Marksheet();
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter the no. of students:");
		int nos=input.nextInt();
		float grade[]=new float[10];
		for(int i=0;i<nos;i++)
			{
			System.out.println("Enter the grade of student no. "+(i+1)+":");
			grade[i]=input.nextFloat();
			}
		float avg=m.average(grade,nos);
		float maxM=m.max(grade,nos);
		float minM=m.min(grade,nos);
		float studentPass=m.perOfStudPass(grade,nos);
		System.out.println("\nThe average marks of the students is "+String.format ("%,.2f",avg));
		System.out.println("\nThe maximum marks is "+String.format ("%,.2f",maxM));
		System.out.println("\nThe minimum marks is "+String.format ("%,.2f",minM));
		System.out.println("\nThe percentage of student pass is "+String.format ("%,.2f",studentPass));
		input.close();
		}

	}

