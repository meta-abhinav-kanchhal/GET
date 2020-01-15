package Hexadecimal;

import java.util.Scanner;
import java.lang.Math;

public class HexCalc {
	// To convert hexa decimal no. to decimal
	public static int hexToDecimal(String str) {
		int len, dv = 0, base = 1;
		len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				dv = dv + (str.charAt(i) - 48) * base;
				base = base * 16;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'F') {
				dv = dv + (str.charAt(i) - 55) * base;
				base = base * 16;
			} else {
				System.out.println("*****************************");
				System.out.println("Enter the valid Information");
				System.out.println("*****************************");
				break;
			}
		}
		return dv;
	}

	// To add two no.
	public static void addition(int x, int y) {
		int add;
		add = x + y;
		decimalToHex(add);
	}

	// To subtract two no.
	public static void subtract(int x, int y) {
		int sub;
		sub = x - y;
		decimalToHex(Math.abs(sub));
	}

	// to multiply two no.
	public static void multiply(int x, int y) {
		int multi;
		multi = x * y;
		decimalToHex(multi);
	}

	// To divide two no.
	public static void divide(int x, int y) {
		int div;
		if (y == 0) {
			System.out.println("can't be zero");
		} else {
			div = x / y;
			decimalToHex(div);
		}
	}

	// To Compare the two string(which is greater)
	public static void compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2) {
			System.out.println("String " + s1 + " is greater than " + s2);
		} else if (len1 < len2) {
			System.out.println("String " + s2 + " is greater than " + s1);
		} else {
			int f = 0;
			for (int i = 0; i < len1; i++) {
				if (s1.charAt(i) > s2.charAt(i)) {
					f = 1;
					break;
				} else if (s1.charAt(i) < s2.charAt(i)) {
					f = -1;
					break;
				}
			}
			if (f == 1)
				System.out.println("String " + s1 + " is greater than " + s2);
			else if (f == -1)
				System.out.println("String " + s2 + " is greater than " + s1);
			else
				System.out
						.println("String " + s2 + " and " + s1 + " are equal");

		}
	}

	// To convert decimal no. to Hexa decimal
	public static void decimalToHex(int num) {
		char[] hexaDeciNum = new char[100];
		int i = 0;
		do {
			int temp = 0;
			temp = num % 16;
			if (temp < 10) {
				hexaDeciNum[i] = (char) (temp + 48);
				i++;
			} else {
				hexaDeciNum[i] = (char) (temp + 55);
				i++;
			}
			num = num / 16;
		} while (num != 0);
		System.out.println("*******************");
		System.out.print("The output is ");
		for (int j = i - 1; j >= 0; j--)
			System.out.print(hexaDeciNum[j]);
		System.out.print("\n*******************");
	}

	public static void main(String[] args) {
		boolean valid = true;
		while (valid) {
			Scanner input = new Scanner(System.in);
			System.out
					.println("\n\n\n-------------What do you want to do---------------\n");
			System.out
					.println("Press\n1.For addition\n2.For subtraction\n3.For multiplication\n4.For division\n5.For comparision \n6.For corresponding decimal value of hexa decimal number\n7.For corresponding hexadecimal value of decimal number\n8.For EXIT");
			try {

				int choice = input.nextInt();
				String hexNo1 = "", hexNo2 = "";
				int decNo1 = 0, decNo2 = 0, dec = 0;
				if (choice >= 1 && choice < 7) {
					System.out.println("Enter the hex no. :");
					hexNo1 = input.next();
					decNo1 = hexToDecimal(hexNo1);
					if (choice >= 1 && choice <= 5) {
						System.out.println("Enter the other hex no. :");
						hexNo2 = input.next();
						decNo2 = hexToDecimal(hexNo2);
					}
				}
				if (choice == 7) {
					System.out.println("Enter the decimal no.: ");
					dec = input.nextInt();
				}
				switch (choice) {
				case 1:
					addition(decNo1, decNo2);
					break;

				case 2:
					subtract(decNo1, decNo2);
					break;

				case 3:
					multiply(decNo1, decNo2);
					break;

				case 4:
					divide(decNo1, decNo2);
					break;

				case 5:
					compare(hexNo1, hexNo2);
					break;

				case 6:
					System.out
							.println("\nThe decimal equivalent of hen no. is "
									+ decNo1);
					break;

				case 7:
					decimalToHex(dec);
					break;

				case 8:
					System.exit(0);
					break;

				default:
					System.out.println("*******************");
					System.out.println("Enter valid key");
					System.out.println("*******************");
					break;
				}
			} catch (Exception ex) {
				System.out.println("*********************");
				System.out.println("Enter the valid key");
				System.out.println("*********************");
			}
		}
	}
}