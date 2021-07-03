package templateMethod.wikipedia;

public class MismaLetraInicial extends Filtro {

	@Override
	public boolean filterMethod(WikipediaPage originalPage, WikipediaPage comparingPage) {
		String letraInicio = this.letterTitle(originalPage);
		
		return this.startsWith(comparingPage, letraInicio);
	}
	
	// Privates
	private boolean startsWith(WikipediaPage page, String letraInicio) {
		String letraAComparar = page.getTitle().substring(0, 1).toLowerCase();
		
		return letraInicio.equals(letraAComparar);
	}
	
	private String letterTitle(WikipediaPage page) {
		String titulo = page.getTitle();
		
		return titulo.substring(0, 1).toLowerCase();
	}
}
