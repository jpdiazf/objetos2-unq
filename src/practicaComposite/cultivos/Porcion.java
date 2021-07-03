package practicaComposite.cultivos;

import java.util.List;

public class Porcion implements IPartePorcion {
	List<IPartePorcion> elementos;
	
	public Porcion(List<IPartePorcion> elementos) {
		this.elementos = elementos;
	}
	
	public List<IPartePorcion> getElementos() {
		return this.elementos;
	}

	@Override
	public double getGananciaAnual(int piso) {
		double res = 0;
		
		for (IPartePorcion elem : elementos) {
			res += elem.getGananciaAnual(piso + 1);
		}
		
		return res;
	}
}
