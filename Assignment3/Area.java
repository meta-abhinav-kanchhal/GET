import java.util.Scanner;

/*Program to calculate different areas
 * @author Abhinav kanchhal
 * */
public class Area 
	{
	
	/*Function to calculate area of triangle
	 * @param w is use to get width of triangle
	 * @param h is use to get height of triangle
	 * @return ar is use return calculated area
	 * */
	public double triArea(double w,double h)
		{
		double ar;
		ar=0.5*w*h;
		return ar;
		}
	

	/*Function to calculate area of rectangle
	 * @param w is use to get width of rectangle
	 * @param h is use to get height of rectangle
	 * @return ar is use return calculated area
	 * */
	public double rectArea(double w,double h)
		{
		double ar;
		ar=w*h;
		return ar;
		}
	
	/*Function to calculate area of square
	 * @param w is use to get width of square
	 * @return ar is use return calculated area
	 * */
	public double sqrArea(double w)
		{
		double ar;
		ar=w*w;
		return ar;
		}
	
	/*Function to calculate area of cicle
	 * @param r is use to get radius of circle
	 * @return ar is use return calculated area
	 * */
	public double cirArea(double r)
		{
		double ar;
		ar=3.14*r*r;
		return ar;
		}
	
	
	public static void main(String[] args) 
		{
		Area a= new Area();
		Scanner input = new Scanner(System.in);
		while(true)
			{
			System.out.println("---Which area you want to calculate---");
			System.out.println("Press\n1.For triangle\n2.For rectangle\nFor square\n4.For circle ");
			int choice=input.nextInt();
			switch(choice)
				{
				case 1:	System.out.println("Enter the width of triangle:");
						double  width=input.nextDouble();
						System.out.println("Enter the heigth of triangle:");
						double  heigth=input.nextDouble();
						double tArea=a.triArea(width,heigth);
						System.out.println("\nArea="+tArea);
						break;
						
				case 2:	System.out.println("Enter the width of rectangle:");
						width=input.nextDouble();
						System.out.println("Enter the heigth of triangle:");
						heigth=input.nextDouble();
						double rArea=a.rectArea(width,heigth);
						System.out.println("\nArea="+rArea);
						break;

				case 3:	System.out.println("Enter the width of rectangle:");
						width=input.nextDouble();
						double sArea=a.sqrArea(width);
						System.out.println("\nArea="+sArea);
						break;
						
				case 4:	System.out.println("Enter the width of rectangle:");
						double radius=input.nextDouble();
						double cArea=a.cirArea(radius);
						System.out.println("\nArea="+cArea);
						break;
						
				case 5:	System.exit(0);
						input.close();
						break;
						
				default:System.out.println("Enter the valid input");
				}
			}
		}
	}
