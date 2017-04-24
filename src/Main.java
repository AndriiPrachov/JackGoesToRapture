import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Graph {
        private int vertexOne;
        private int vertexTwo;
        private int edge;

        Graph(int vertexOne, int vertexTwo, int edge) {
            this.vertexOne = vertexOne;
            this.vertexTwo = vertexTwo;
            this.edge = edge;
        }

        public int getVertexOne() {
            return vertexOne;
        }

        public void setVertexOne(int vertexOne) {
            this.vertexOne = vertexOne;
        }

        public int getVertexTwo() {
            return vertexTwo;
        }

        public void setVertexTwo(int vertexTwo) {
            this.vertexTwo = vertexTwo;
        }

        public int getEdge() {
            return edge;
        }

        public void setEdge(int edge) {
            this.edge = edge;
        }

        public String toString() {
            System.out.println("vertexOne == " + vertexOne + ", vertexTwo == " + vertexTwo +
            ", edge == " + edge);
            return null;
        }
    }

    public static void main(String[] args) {
        List<Graph> graphs = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int vertexOne = in.nextInt();
            int vertexTwo = in.nextInt();
            int edge = 0;

            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            if (lineScanner.hasNext()) {
                edge = in.nextInt();
            }
            Graph graph = new Graph(vertexOne, vertexTwo, edge);
            System.out.println(graph.toString());
            graphs.add(graph);
        }

        System.out.println(graphs.size());
    }
}
