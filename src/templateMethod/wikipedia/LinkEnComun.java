package templateMethod.wikipedia;

import java.util.List;

public class LinkEnComun extends Filtro {

	@Override
	public boolean filterMethod(WikipediaPage originalPage, WikipediaPage comparingPage) {
		List<WikipediaPage> linksOriginales = originalPage.getLinks();
		List<WikipediaPage> linksAComparar = comparingPage.getLinks();
		
		return this.hayLinksEnComun(linksOriginales, linksAComparar);
	}
	
	// Privates
	
	private boolean hayLinksEnComun(List<WikipediaPage> linksOriginales, List<WikipediaPage> linksAComparar) {
		boolean res = false;
		
		for (int i = 0; i < linksOriginales.size() && !res; i++) {
			WikipediaPage page = linksOriginales.get(i);
			res = res || linksAComparar.contains(page);
		}
		
		return res;
	}
}
