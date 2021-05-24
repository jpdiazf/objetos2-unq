package practica5.bancosYPrestamos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Banco {
	private Float saldo;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void agregarSolicitud(SolicitudDeCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	public void evaluarSolicitudes() {
		for (SolicitudDeCredito s : solicitudes) {
			this.evaluarSolicitud(s);
		}
	}
	
	public void evaluarSolicitud(SolicitudDeCredito solicitud) {
		if(solicitud.esAceptable()) {
			this.otorgarCredito(solicitud);
		}
	}
	
	public void otorgarCredito(SolicitudDeCredito solicitud) {
		Float monto = solicitud.getMonto();
		solicitud.getCliente().recibirCredito(monto);
	}
	
	public void cobrarPago(Float monto) {
		this.saldo =+ monto;
	}

	public Float getSaldo() {
		return saldo;
	}
	
	public Double getMontoTotalAPagar() {
		return solicitudes.stream()
						  .filter(s -> s.esAceptable())
						  .mapToDouble(s -> s.getMonto())
						  .sum();
	}
}