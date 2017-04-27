import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static int[][] graphs;
    private static int numberOfVertexes;
    private static int numberOfEdges;
    private static ArrayList<Integer> results = new ArrayList<>();

    public static void main(String[] args) {
        init();
        solution(0, 0);
        System.out.println(Collections.min(results));
    }

    private static void init() {
        Scanner in = new Scanner(System.in);
        numberOfVertexes = in.nextInt();
        numberOfEdges = in.nextInt();
        graphs = new int[numberOfVertexes][numberOfVertexes];

        for (int edgeNumber = 0; edgeNumber < numberOfEdges; edgeNumber++) {
            graphs[in.nextInt() - 1][in.nextInt() - 1] = in.nextInt();
        }
    }

    private static void solution(int begin, int fareToBegin) {
        for (int end = 0; ; end++) {
            if (graphs[begin][end] != 0) {
                fareToBegin = fareToBegin + Math.max(0, graphs[begin][end] - fareToBegin);
                if (end == numberOfVertexes - 1) {
                    results.add(fareToBegin);
                    return;
                }

                solution(end, fareToBegin);
            } else {
                if (end == numberOfVertexes - 1) {
                    return;
                }
            }
        }
    }
}
