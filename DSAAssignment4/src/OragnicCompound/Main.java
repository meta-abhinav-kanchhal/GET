package OragnicCompound;

/*@author Abhinav Kanchhal
 * Main class
 * */
public class Main {

	public static void main(String[] args) {
		String compound="CH3(C4)4CH3(CH4)2O";
		OraganicCompound obj = new OraganicCompound();
		int size=compound.length();
		obj.calculateCompound(compound,size,1);
	}

}