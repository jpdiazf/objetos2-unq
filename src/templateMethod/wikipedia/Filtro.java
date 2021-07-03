package templateMethod.wikipedia;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Filtro {
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikiPages) {
		List<WikipediaPage> paginas = wikiPages.stream()
											   .filter(p -> this.filterMethod(page, p))
											   .collect(Collectors.toList());
		
		return paginas;
	}
	
	public abstract boolean filterMethod(WikipediaPage originalPage, WikipediaPage comparingPage);
}