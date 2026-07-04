package ComputingContests.cccPractice.S1Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCCS1ComputerPurchase {

    static class Computer {
        String name;
        int score;

        Computer(String name, int ram, int cpu, int disk) {
            this.name = name;
            this.score = 2 * ram + 3 * cpu + disk;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());

        List<Computer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = input.readLine().split(" ");
            String name = parts[0];
            int ram = Integer.parseInt(parts[1]);
            int cpu = Integer.parseInt(parts[2]);
            int disk = Integer.parseInt(parts[3]);

            list.add(new Computer(name, ram, cpu, disk));
        }

        list.sort((a, b) -> {
            if (b.score != a.score)
                return b.score - a.score;
            return a.name.compareTo(b.name);
        });

        list.sort((a, b) -> {
            if (b.score != a.score)
                return b.score - a.score;
            return a.name.compareTo(b.name);
        });

        if (!list.isEmpty()) {
            System.out.println(list.get(0).name);
        }
        if (list.size() > 1) {
            System.out.println(list.get(1).name);
        }
    }
}