//Nadin situmeang- 12S25052
import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] judul = new String[10], kode = new String[10], namaMK = new String[10], dosen = new String[10], deadline = new String[10], idTugas = new String[10];
        int[] kesulitan = new int[10], hari = new int[10];
        double[] prioritas = new double[10];
        String command;

        JumlahData = 0;
        command = input.nextLine();
        while (!command.equals("---")) {
            if (command.equals("Add task")) {
            }
        }
    }
    
    public static int addTask(String[] judul, String[] kode, String[] namaMK, String[] dosen, String[] deadline, String[] idTugas, int[] kesulitan, int[] hari, String status, double[] prioritas, int n) {
        if (n < 10) {
            judul[n] = input.nextLine();
            kode[n] = input.nextLine();
            namaMK[n] = input.nextLine();
            dosen[n] = input.nextLine();
            deadline[n] = input.nextLine();
            idTugas[n] = input.nextLine();
            kesulitan[n] = Integer.parseInt(input.nextLine());
            hari[n] = Integer.parseInt(input.nextLine());
            status[n] = input.nextLine();
            prioritas[n] = kesulitan[n] * 1.0 / hari[n];
            n = n + 1;
        } else {
            System.out.println("Memori Penuh");
        }
        
        return n;
    }
}

