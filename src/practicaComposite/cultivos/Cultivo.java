package practicaComposite.cultivos;

public abstract class Cultivo implements IPartePorcion {
	protected double gananciaAnual;
	
	@Override
	public double getGananciaAnual(int piso) {
		if(piso == 1) {
			return this.gananciaAnual;
		} else {
			return this.gananciaAnual / (4 * piso);
		}
	}
}
