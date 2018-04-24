/**
  Code that implements a Graph that follows these rules:

  Dados números inteiros p e q, seja V o conjunto {1,2,3,...,pq-2,pq-1,pq}. Digamos que 2 elementos k e k' de V, com k < k', são adjacentes se k'=k+q ou (k mod q <> 0 e k' = k+1). Esta relação de adjacência define um grafo co conjunto de vértices V. Apresente a definição formal deste grafo considerando que p = 3 e q = 4. (mod denota o resto da divisão e <> a diferença entre 2 números)

  @author Rafael Pontes
*/

import javafx.util.Pair;
import java.util.TreeSet;

class Edge implements Comparable<Edge> {

    private Pair<Integer, Integer> edge;

    Edge(Integer v1, Integer v2) {
        edge = new Pair<Integer, Integer>(v1, v2);
    }

    public int compareTo(Edge o) {
        return this.getV1() - o.getV1();
    }

    public Integer getV1() {
      return edge.getKey();
    }

    public Integer getV2() {
      return edge.getValue();
    }

}

class GraphBasedOnPQ {
  public static void main(String[] args) {
    int p = 3;
    int q = 4;
    int[] vertices = new int[(p*q)];

    for (int i = 0; i < vertices.length; i++) {
      vertices[i] = i + 1;
    }

    TreeSet<Edge> edges = new TreeSet<Edge>();

    for (int k = 0; k < vertices.length; k++) {
      for (int klinha = 0; klinha < vertices.length; klinha++) {
        if (vertices[k] >= vertices[klinha]) continue;
        if ((vertices[klinha] == vertices[k] + q) || (vertices[k] % q != 0) && (vertices[klinha] == vertices[k] + 1)) {
          Edge newEdge = new Edge(new Integer(vertices[k]), new Integer(vertices[klinha]));
          edges.add(newEdge);
        }
      }
    }
    printIntArray(vertices);
    printEdgeList(edges);
  }

  private static void printIntArray(int[] a) {
    System.out.print("vertices: {");
    for (int i: a) {
      if(i != a[a.length-1]) {
        System.out.print(i + ", ");
      } else {
        System.out.println(i + "}");
      }
    }
  }

  private static void printEdgeList(TreeSet<Edge> edges) {
    System.out.print("edges: {");

    edges.forEach((edge) -> {
      System.out.print("(" + edge.getV1().toString() + ", " + edge.getV2().toString() + "), ");
    });
    System.out.println("}");
  }
}
