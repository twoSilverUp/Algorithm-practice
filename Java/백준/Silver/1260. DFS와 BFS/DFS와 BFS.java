import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	static ArrayList<Integer> visitedDfs = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		int nodes = kbd.nextInt();
		int edges = kbd.nextInt();
		int start = kbd.nextInt();
		int[][] graph = new int[nodes+1][nodes+1];
		
		for(int i=0; i<edges; i++) {
			int node1 = kbd.nextInt();
			int node2 = kbd.nextInt();
			graph[node1][node2] = graph[node2][node1] = 1;
		}
		
		dfs(graph, start, nodes);
		for(int i=0; i<visitedDfs.size(); i++) {
			System.out.print(visitedDfs.get(i)+" ");
		}
		System.out.println();
		bfs(graph, start, nodes);
		
	}
	
	static void dfs(int[][]graph, int start, int nodes) {
		visitedDfs.add(start);
		for(int i=1; i<nodes+1; i++) {
			if(graph[start][i]==1&&!visitedDfs.contains(i)) {
				dfs(graph, i, nodes);
			}
		}
	}
	
	static void bfs(int[][]graph, int start, int nodes) {
		ArrayList<Integer> visited = new ArrayList<Integer>();
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited.add(start);
		queue.add(start);
		
		while(!queue.isEmpty()) {
			start = queue.removeFirst();
			for(int i=1; i<nodes+1; i++) {
				if(graph[start][i]==1&&!visited.contains(i)) {
					visited.add(i);
					queue.add(i);
				}
			}
		}
		for(int i=0; i<visited.size(); i++) {
			System.out.print(visited.get(i)+" ");
		}
		System.out.println();
	}
}
