import java.io.*;
import java.util.*;

public class coci16c1p4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] from = new int[n-1];
        int[] to = new int[n-1];

        for (int i = 0; i < n - 1; i++) {
            String line = br.readLine();
            String[] arr = line.split(" "); 
            from[i] = Integer.parseInt(arr[0]);
            to[i] = Integer.parseInt(arr[1]);
        }

        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < n-1; i++) {
            nodes[from[i]-1].edges.add(nodes[to[i]-1]);
            nodes[to[i]-1].edges.add(nodes[from[i]-1]);
        }

        Magic min = new Magic(Integer.MAX_VALUE, 1);

        for (int i = 0; i < n; i++) {
            Magic mag = minMagic(nodes[i], new Magic(1,0), "");
            if (mag.getValue() < min.getValue()) min = mag;
        }

        System.out.println(min.product + "/" + min.steps);

        
    }

    static Magic minMagic(Node node, Magic magic, String path) {
        Magic min = new Magic(magic.product * node.value, magic.steps + 1);

        for (int i = 0; i < node.edges.size(); i++) {
            if (!path.contains(node.hashCode() + "")) {
                Magic mag = minMagic(node.edges.get(i), new Magic(magic.product * node.value, magic.steps + 1), path + node.hashCode() + " "); 
                if(mag.getValue() < min.getValue()) min = mag;
            }
        }

        return min;
    }

    static class Magic {
        int product;
        int steps;
        public Magic(int product, int steps) {
            this.product = product;
            this.steps = steps;
        }

        public double getValue() {
            return(double)product/steps;
        }
    }

        

    static class Node {
        int value;
        ArrayList<Node> edges;
        Node left, right;

        public Node(int value) {
            this.value = value;
            edges = new ArrayList<>();
        }
    }
}
