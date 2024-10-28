
import org.w3c.dom.Node;

import java.io.*;
import java.util.HashMap;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Node> hasNode = new HashMap<>();

        for(int i=0; i<n; i++){
            String input[] = br.readLine().split(" ");
            String parent = input[0];
            hasNode.computeIfAbsent(parent, k -> new Node(parent));
            Node left = new Node(input[1]);
            Node right = new Node(input[2]);
            hasNode.get(parent).left = left;
            hasNode.get(parent).right = right;
            hasNode.put(input[1], left);
            hasNode.put(input[2], right);
        }
        
        preorder(hasNode.get("A"));
        bw.write("\n");
        inorder(hasNode.get("A"));
        bw.write("\n");
        postorder(hasNode.get("A"));
        bw.close();
    }

    static void preorder(Node root) throws IOException {
        if(root.name.equals(".")) return;
        bw.write(root.name);
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) throws IOException {
        if(root.name.equals(".")) return;
        inorder(root.left);
        bw.write(root.name);
        inorder(root.right);
    }

    static void postorder(Node root) throws IOException {
        if(root.name.equals(".")) return;
        postorder(root.left);
        postorder(root.right);
        bw.write(root.name);
    }

    static class Node{
        String name;
        Node left;
        Node right;
        Node(String name){
            this.name = name;
        }
    }
}