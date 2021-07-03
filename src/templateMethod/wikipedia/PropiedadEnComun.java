package templateMethod.wikipedia;

import java.util.Set;

public class PropiedadEnComun extends Filtro {
	
	
	@Override
	public boolean filterMethod(WikipediaPage originalPage, WikipediaPage comparingPage) {
		Set<String> propiedadesOriginales = originalPage.getInfobox().keySet();
		Set<String> propiedadesAComparar = comparingPage.getInfobox().keySet();
		
		return this.hayPropiedadesEnComun(propiedadesOriginales, propiedadesAComparar);
	}

	// Privates
	private boolean hayPropiedadesEnComun(Set<String> propiedadesOriginales, Set<String> propiedadesAComparar) {
		boolean res = false;
		
//		for (int i = 0; i < propiedadesOriginales.size() && !res; i++) {
//			WikipediaPage page = propiedadesOriginales.get(i);
//			res = res || propiedadesAComparar.contains(page);
//		}
		
		for (String p : propiedadesOriginales) {
			res = res || propiedadesAComparar.contains(p);
		}
		
		return res;
	}
}
