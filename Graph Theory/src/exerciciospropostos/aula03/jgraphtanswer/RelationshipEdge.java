package exerciciospropostos.aula03.jgraphtanswer;

import org.jgrapht.graph.DefaultEdge;

@SuppressWarnings("serial")
public class RelationshipEdge<V> extends DefaultEdge {

	private V v1;
    private V v2;
    private Integer label;

    public RelationshipEdge(V v1, V v2, Integer label) {
        this.v1 = v1;
        this.v2 = v2;
        this.label = label;
    }

    public V getV1() {
        return v1;
    }

    public V getV2() {
        return v2;
    }
    
    public Integer getLabel() {
    	return label;
    }

    public String toString() {
        return "ψ(" + label.toString() + ") = {" + v1.toString()
        		+ ", " + v2.toString() + "}";
    }
}

