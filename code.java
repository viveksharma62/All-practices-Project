import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Process {
    private String name;
    private int burstTime;

    public Process(String name, int burstTime) {
        this.name = name;
        this.burstTime = burstTime;
    }

    public String getName() {
        return name;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void reduceBurstTime(int time) {
        burstTime -= time;
    }
}

public class code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Process[] processes = new Process[4];

        // Taking input for burst time of each process
        for (int i = 0; i < processes.length; i++) {
            System.out.print("Enter burst time for process P" + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            processes[i] = new Process("P" + (i + 1), burstTime);
        }

        int quantum = 3; // Quantum for Round Robin scheduling

        roundRobin(processes, quantum);
        
        scanner.close();
    }

    public static void roundRobin(Process[] processes, int quantum) {
        Queue<Process> queue = new ArrayDeque<>();
        for (Process process : processes) {
            queue.add(process);
        }

        int currentTime = 0;

        System.out.println("Process\t\tRemaining Time");

        while (!queue.isEmpty()) {
            Process currentProcess = queue.poll();
            int remainingTime = currentProcess.getBurstTime();

            if (remainingTime <= quantum) {
                currentTime += remainingTime;
                currentProcess.reduceBurstTime(remainingTime);
                System.out.println(currentProcess.getName() + "\t\t" + 0);
            } else {
                currentTime += quantum;
                currentProcess.reduceBurstTime(quantum);
                System.out.println(currentProcess.getName() + "\t\t" + currentProcess.getBurstTime());
                queue.add(currentProcess);
            }
        }

        System.out.println("All processes executed.");
    }
}
