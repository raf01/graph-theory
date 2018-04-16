/**
  Code that implements a Graph of Word-Vertices whose edges connect vertices that differ by one letter only.
  @author Rafael Pontes
*/

import javafx.util.Pair;
import java.util.TreeSet;

class Edge implements Comparable<Edge> {

    private Pair<String, String> edge;

    Edge(String v1, String v2) {
        edge = new Pair<String, String>(v1, v2);
    }

    public int compareTo(Edge o) {
        return this.getV1().compareTo(o.getV1());
    }

    public String getV1() {
      return edge.getKey();
    }

    public String getV2() {
      return edge.getValue();
    }

}

class WordGraph {
  public static void main(String[] args) {

    String[] vertices = {
      "caiado", "cavado", "cavalo", "girafa", "ralo", "ramo", "rata", "rato", "remo", "reta", "reto", "rota", "vaiado", "varado", "virada", "virado", "virava"
    };

    TreeSet<Edge> edges = new TreeSet<Edge>();

    for (int k = 0; k < vertices.length; k++) {
      for (int klinha = 0; klinha < vertices.length; klinha++) {
        if (numberOfDiffLetters(vertices[k], vertices[klinha]) == 1) {
          Edge newEdge = new Edge(vertices[k], vertices[klinha]);
          Edge newEdgeReverse = new Edge(vertices[klinha], vertices[k]);
          if (!edges.contains(newEdgeReverse))
            edges.add(newEdge);
        }
      }
    }
    printIntArray(vertices);
    printEdgeList(edges);
  }

  private static void printIntArray(String[] a) {
    for (String i: a) {
      if(i != a[a.length-1]) {
        System.out.print(i + ", ");
      } else {
        System.out.println(i + ".");
      }
    }
  }

  private static void printEdgeList(TreeSet<Edge> edges) {
    System.out.print("edges: {");

    edges.forEach((edge) -> {
      System.out.print("(" + edge.getV1() + ", " + edge.getV2() + "), ");
    });
    System.out.println("}");
  }

  private static int numberOfDiffLetters(String a, String b) {
    if (a.length() != b.length()) return -1;
    int diffCount = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(i)) {
        diffCount++;
      }
    }
    return diffCount;
  }
}
