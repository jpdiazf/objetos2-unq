package composite;

import java.util.ArrayList;
import java.util.List;

public class CultivoMixto extends PorcionTierra {
	
	List<PorcionTierra> cultivos = new ArrayList<PorcionTierra>();
	
	public CultivoMixto() {}
	
	public void agregarCultivo(PorcionTierra nuevoCultivo) {
		if (cultivos.size() < 4 ) {
			cultivos.add(nuevoCultivo);
		}
	}
	
	public void borrarCultivo(Integer numeroCultivo) {
		this.cultivos.remove(this.cultivos.get(numeroCultivo));
	}
	
	public float gananciaAnualTrigo() {
		float ganancia = 0;
		for(PorcionTierra cultivo : this.cultivos) {
			ganancia +=  cultivo.gananciaAnualTrigo() / 4;
		}
		return ganancia;
	}

	public float gananciaAnualSoja() {
		float ganancia = 0;
		for(PorcionTierra cultivo : this.cultivos) {
			ganancia +=  cultivo.gananciaAnualSoja() / 4;
		}
		return ganancia;
	}
}
