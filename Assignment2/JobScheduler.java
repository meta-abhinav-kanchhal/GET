import java.util.Scanner;
import java.lang.Math;

public class JobScheduler {
//calculation of compile time
	public void compTime(int cT[], int rT[][], int n) {
		for (int i = 0; i < n; i++)
			if (i == 0)
				cT[i] = rT[i][0] + rT[i][1];
			else if (rT[i][0] < cT[i - 1])
				cT[i] = cT[i - 1] + rT[i][1];
			else
				cT[i] = rT[i][0] + rT[i][1];
	}
//calculation of turn around time
	public void turnAround(int cT[], int rT[][], int tAT[], int n) {
		for (int i = 0; i < n; i++) {
			tAT[i] = Math.abs(rT[i][0] - cT[i]);
		}
	}
//calculation of waiting time1
	public void waitTime(int tAT[], int rT[][], int wT[], int n) {
		for (int i = 0; i < n; i++) {
			wT[i] = Math.abs(tAT[i] - rT[i][1]);
		}
	}

	public static void main(String[] args) {
		JobScheduler j = new JobScheduler();
		Scanner input = new Scanner(System.in);
		int receiveProcess[][] = new int[10][2], i = 0;
		char choice;
		for (;;) {
			try{
			System.out.println("Enter the Arrival time:");
			receiveProcess[i][0] = input.nextInt();
			System.out.println("Enter the burst time:");
			receiveProcess[i][1] = input.nextInt();
			System.out
					.println("Do you want to enter more\nPress y for YES and any key for NO:");
			choice = input.next().charAt(0);
			i++;
			if (choice == 'y')
				continue;
			else
				break;
		}
		catch(Exception ex)
			{
			input.nextLine();
			System.out.println("enter only integer");
			}
		}
		int numberOfProcess = i;
		int avgWaitingTime = 0, maxWaitingTime = 0;
		i = 0;
		int completionTime[] = new int[10], turnAroundTime[] = new int[10], waitingTime[] = new int[10];
		j.compTime(completionTime, receiveProcess, numberOfProcess);
		j.turnAround(completionTime, receiveProcess, turnAroundTime, numberOfProcess);
		j.waitTime(turnAroundTime, receiveProcess, waitingTime, numberOfProcess);
		System.out
				.println("S.No.\t\tCompletion Time\t\tTurn Around Time\t\tWaiting Time");
		for (i = 0; i < numberOfProcess; i++) {
			System.out.println(i + 1 + "\t\t\t" + completionTime[i] + "\t\t\t"
					+ turnAroundTime[i] + "\t\t\t\t" + waitingTime[i]);
			avgWaitingTime = avgWaitingTime + waitingTime[i];
			if (maxWaitingTime < waitingTime[i])
				maxWaitingTime = waitingTime[i];
		}
		System.out.println("\nAverage Waiting Time of whole process is "
				+ avgWaitingTime / numberOfProcess);
		System.out.println("\nMaximum waiting Time of Process is "
				+ maxWaitingTime);
	}
}
