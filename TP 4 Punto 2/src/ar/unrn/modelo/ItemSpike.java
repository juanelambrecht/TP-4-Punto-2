package ar.unrn.modelo;

public class ItemSpike  implements Items{
	String nombreTarea;
	int tiempoTarea;
	
	public ItemSpike(String nombreTarea, int tiempoTarea) {
		super();
		this.nombreTarea = nombreTarea;
		this.tiempoTarea = tiempoTarea;
	}


	@Override
	public int tiempoEnTareas() {
	
		return this.tiempoTarea;
	}

	
	public void mostrarItem() {
		System.out.println(this.toString());
	}


	@Override
	public String toString() {
		return "Spike [nombreTarea=" + nombreTarea + ", tiempoTarea=" + tiempoTarea + "]";
	}

	
}
