/**
 * Code made by @author rafael pontes
 * */

package exerciciospropostos.aula03.jgraphtanswer;

import org.jgrapht.Graph;
import org.jgrapht.graph.SimpleGraph;

public class MySimpleGraph {
	
    static String[] edges = {"ab", "bg", "cd", "bf", "ag", "eb"};
    static Integer[] labels = {1, 2, 3, 4, 5, 6};
    
	public static void main(String[] args) {

		// Main graph instance 
		@SuppressWarnings("rawtypes")
		Graph<Character, RelationshipEdge> g = new SimpleGraph<Character, RelationshipEdge>(RelationshipEdge.class);
		
		// Adding vertices
		for (char ch = 'a'; ch <= 'g'; ch++) {
			g.addVertex(new Character(ch));
		}
		
		// Adding edges
		for (int i = 0; i < edges.length; i++) {
			Character v1 = new Character(edges[i].charAt(0));
			Character v2 = new Character(edges[i].charAt(1));
			Integer eLabel = new Integer(labels[i]);
			g.addEdge(v1, v2, new RelationshipEdge<Character>(v1, v2, eLabel));
		}
		
		// Printing output
		System.out.println("Vértices: " + g.vertexSet());
		System.out.println("Arestas: " + g.edgeSet());
		  
	}
	
}