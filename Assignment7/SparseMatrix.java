
public  final class SparseMatrix {
	private final int[][] matrix;
	
	SparseMatrix(int[][] arr)
	{
		matrix= arr.clone();
	}
	public int[][] getMatrix()
	{
		return matrix.clone();
	}
	
	public int[][] storeNonZero()
	{
		int count=0,index=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j]!=0)
				{
				 count++;
				}
			}
		}
		int[][] triples=new int[3][count];
	     for(int i=0;i<matrix.length;i++)
	        {
	    	   for(int j=0;j<matrix[0].length;j++)
	    	     {
	    		    if(matrix[i][j]!=0)
	    		     {
	    		    	triples[0][index]=i;
	    		    	triples[1][index]=j;
	    		    	triples[2][index]=matrix[i][j];
	    		    	index++;
	    		     }
	    	     }
	        }
	           
	     return triples;		
	}
	
	public int[][] transpose()
	{
		int[][] transpose=new int[matrix[0].length][matrix.length];
		int triple[][]=storeNonZero();
		int rowindex=0,columnindex=0;
			for(int j=0;j<triple[0].length;j++)
			{
				rowindex=triple[1][j];
				columnindex=triple[0][j];
				transpose[rowindex][columnindex]=triple[2][j];
			}		
	return transpose;			
	   }
	
	public boolean symmetric()
	{
		int[][] transpose=transpose();
		if((matrix.length!=transpose.length) || (matrix[0].length!=transpose[0].length))
	        return false;
	     else
	     {
	    	 for( int i=0;i<matrix.length;i++)
	    	 {
	    		 for(int j=0;j<matrix[0].length;j++)
	    		 {
	    			if(transpose[i][j]==matrix[i][j])
	    				continue;
	    			else
	    				return false;
	    		 }
	    	 }
	     }
	return true;		
	}
	
	public int[][] addMatrix(SparseMatrix s1,SparseMatrix s2)
	{
		int matrix1[][]=s1.getMatrix();
		int matrix2[][]=s2.getMatrix();
	int addMatrix[][]=new int[matrix1.length][matrix1[0].length];	
	
	if((matrix1.length!=matrix2.length) || (matrix1[0].length!=matrix2[0].length))
	{	System.out.println("size must be same");
	     System.exit(0);
	}
	else
	{
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[0].length;j++)
			{
				addMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
	}
		
	return addMatrix;	
	}
	
	public int[][] multiplyMatrix(SparseMatrix s1,SparseMatrix s2)
	{
		int matrix1[][]=s1.getMatrix();
		int matrix2[][]=s2.getMatrix();
		int multiplyMatrix[][]=new int[matrix1.length][matrix2[0].length];
		
		if(matrix1[0].length != matrix2.length)
		{
			System.out.println("order must be same");
			System.exit(0);
		}
		
		else
		{
		    for (int i = 0; i < matrix1.length; ++i) 
		    {
		        for (int j = 0; j < matrix2[0].length; ++j)
		        {
		            for (int k = 0; k < matrix1[0].length; ++k)
		            {
		                multiplyMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
		            }
			
		        }
		    }
		} 
		
	return multiplyMatrix;	
	}
	
	    public static void main(String[] args)
	     {
		SparseMatrix s1=new SparseMatrix(new int[][]{{3,-2,5},{3,0,4}});
		SparseMatrix s2=new SparseMatrix(new int[][]{{2,3},{-9,0},{0,4}});
		int arr[][]=s1.multiplyMatrix(s1,s2);
		for(int i=0;i<arr.length;i++)
			{
			   for(int j=0;j<arr[0].length;j++)
			    {
				   System.out.print(arr[i][j]+"  ");
			    }
			   System.out.println("\n");
			} 
		//boolean a=s1.symmetric();
	//	System.out.println(a);
		

		
	       }
}
	
	
	


