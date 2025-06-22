import java.util.*;
public class conflicttwo {
    static class Node {
        final Node parent;
        final String part;
        Node(Node parent, String part) {
            this.parent = parent;
            this.part = part;
        }
    }
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int q = hariom.nextInt();
        hariom.nextLine();
        Node server = new Node(null, "");
        Node[] pc = new Node[n+1];
        for (int i = 1;i <= n;i++) {
            pc[i]=server;
        }
        for (int i = 0;i < q;i++) {
            String line =hariom.nextLine();
            String[] parts =line.split("\\s+");
            int type =Integer.parseInt(parts[0]);
            int p= Integer.parseInt(parts[1]);
            if (type == 1) {
                pc[p] = server;
            } else if (type == 2) {
                pc[p] = new Node(pc[p], parts[2]);
            } else {
                server = pc[p];
            }
        }
        Deque<String> stack = new ArrayDeque<>();
        for (Node cur = server; cur != null; cur = cur.parent) {
            if (!cur.part.isEmpty()) stack.push(cur.part);
        }
        StringBuilder out = new StringBuilder();
        while (!stack.isEmpty()) {
            out.append(stack.pop());
        }
        System.out.println(out.toString());
    }
}
