// Part of OpenGenus
// From https://iq.opengenus.org/bidirectional-search/
import java.util.*;

public class Main{
	
	public static void main(String[] args) {
	    Scanner inp=new Scanner(System.in);
	    System.out.println("Enter the number of vertices: ");
	    int v=inp.nextInt();
	    System.out.println("Enter the number of edges: ");
	    int e=inp.nextInt();
	    Graph G=new Graph(v, e);
	    for(int i=0;i<G.E;i++){
	    	System.out.print("Edge " + i + " Vertex 1:");
	        int x=inp.nextInt();
	        System.out.print("Edge " + i + " Vertex 2:");
	        int y=inp.nextInt();
	        G.add_edge(x,y);
	    }

	    String path = BidirectionalSearch.BidirectionalSearchPath(G, 0, 2);
	    if(path.equals(""))
	        System.out.println("Path does not exist");
	    else
	        System.out.println("Path : " + path);
	}
	
}


