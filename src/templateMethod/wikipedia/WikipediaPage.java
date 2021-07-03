package templateMethod.wikipedia;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {
	// retorna el título de la página.
	String getTitle();
	
	// retorna una Lista de las páginas de Wikipedia con las que se conecta.
	List<WikipediaPage> getLinks();
	
	// retorna un Map con un valor en texto y la pagina que describe ese valor que aparecen en los infobox de la página de Wikipedia.
	Map<String, WikipediaPage> getInfobox();
}
