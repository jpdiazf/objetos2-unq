package templateMethod.wikipedia;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {
	// retorna el t�tulo de la p�gina.
	String getTitle();
	
	// retorna una Lista de las p�ginas de Wikipedia con las que se conecta.
	List<WikipediaPage> getLinks();
	
	// retorna un Map con un valor en texto y la pagina que describe ese valor que aparecen en los infobox de la p�gina de Wikipedia.
	Map<String, WikipediaPage> getInfobox();
}
