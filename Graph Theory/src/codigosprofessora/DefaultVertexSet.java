package codigosprofessora;

import java.util.Iterator;
import java.util.Set;

public class DefaultVertexSet {
	// Para um conjunto de V�rtices retorna o objeto v�rtice identificado pelo label

	static public DefaultVertex getVertexfromLabel (Set <DefaultVertex> V, String label) {
		Iterator<DefaultVertex> it = V.iterator();
		while (it.hasNext()) {
			DefaultVertex v = it.next();
			String l = v.getLabel();
			if (l.equals(label)) {
				return v;
			}
		}
		return null;
	}
	
	
	
}
