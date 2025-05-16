import java.util.*;

class OScodemode {

    static void CalculateWaitingAndTurnaroundTime(int at[], int bt[], int N) {
        int[] wt = new int[N];
        int[] tat = new int[N]; // turnaround time array
        wt[0] = 0;

        System.out.print("P.No.\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time\n");
        System.out.print("1\t\t" + at[0] + "\t\t" + bt[0] + "\t\t" + wt[0] + "\t\t" + bt[0] + "\n");

        for (int i = 1; i < N; i++) {
            wt[i] = (at[i - 1] + bt[i - 1] + wt[i - 1]) - at[i];
            tat[i] = wt[i] + bt[i]; // Calculating Turnaround Time
            System.out.print((i + 1) + "\t\t" + at[i] + "\t\t" + bt[i] + "\t\t" + wt[i] + "\t\t" + tat[i] + "\n");
        }

        float averageWT;
        float averageTAT;
        float sumWT = 0;
        float sumTAT = 0;

        for (int i = 0; i < N; i++) {
            sumWT = sumWT + wt[i];
            sumTAT = sumTAT + tat[i];
        }

        averageWT = sumWT / N;
        averageTAT = sumTAT / N;

        System.out.print("Average waiting time = " + averageWT);
        System.out.print("\nAverage turnaround time = " + averageTAT);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of processes: ");
        n = sc.nextInt();

        int[] at = new int[n];
        int[] bt = new int[n];

        System.out.println("Enter the arrival times: ");
        for (int i = 0; i < n; i++) {
            at[i] = sc.nextInt();
        }

        System.out.println("Enter the burst times: ");
        for (int j = 0; j < n; j++) {
            bt[j] = sc.nextInt();
        }

        CalculateWaitingAndTurnaroundTime(at, bt, n);
    }
}
