package Java01_탐색.sec03_너비우선탐색BFS;

import java.util.Iterator;
import java.util.LinkedList;

public class Num01_1695
{
	int V;
	LinkedList<Integer> adj[];	//배열
	
	Num01_1695(int v){
		adj = new LinkedList[v];	//v개의 LinkedList 선언 / 생성한다.
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {	//v번째 링크드리스트에 내가 원하는 정수값을 넣는다.
		adj[v].add(w);
	}
	
	void BFS(int s){
		boolean visited[] = new boolean[V];	//해당 노드를 방문했는지 아닌지 확인할 수 있도록 배열 체크
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;	//방문했으니 true로 변결
		queue.add(s);
		
		while(queue.size() != 0) {
			//방문한 노드를 큐에서 추출하고 값을 출력
			s = queue.poll();
			System.out.println(s + " ");
		
			//방문한 노드와 인접한 모든 노드를 가져와 방문 후 큐에 올리고 추출한 뒤 값을 출력
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
