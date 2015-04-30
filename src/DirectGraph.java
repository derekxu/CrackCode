import java.util.*;
enum state{
	unvisited, visiting, visited;
}
class Node{
	state status;
	List<Node> neighbors;
	public List<Node> getAdjacent(){
		return neighbors;
	}
}
public class DirectGraph {

	
	public boolean search(Graph g, Node start, Node end){
		if(g==null) return false;
		
		for(Node n:g.getNodes())
		{
			n.status=state.unvisited;
		}
		LinkedList<Node> q = new LinkedList<>();
		start.status=state.visiting;
		q.push(start);
		while(!q.isEmpty())
		{
			Node node = q.poll();
			node.status=state.visited;
			for(Node n:node.getAdjacent()){
				if(n!=null && n.status!=state.visited)
				{
					if(n==end)
					{
						return true;
					}
					n.status=state.visiting;
					q.add(n);
				}
			}
		}
		return false;
	}
}
