package ar.unrn.modelo;

import java.util.ArrayList;
import java.util.List;

public class ItemHistoriasDeUsuario implements Items{
	String nombreTarea;
	int tiempoTarea;
	List<Items> items = new ArrayList<Items>();

	public ItemHistoriasDeUsuario(String nombreTarea, int tiempoTarea) {
		super();
		this.nombreTarea = nombreTarea;
		this.tiempoTarea = tiempoTarea;
	}


	@Override
	public int tiempoEnTareas() {
		int tiempo = 0;
		for(Items item: items) {
			tiempo = tiempo + item.tiempoEnTareas();
		}
		return tiempo;
	}
	
	public void agregarTarea(Items item) {
		items.add(item);
	}

	@Override
	public String toString() {
		return "CompositeHistoriasDeUsuarios [nombreTarea=" + nombreTarea + ", tiempoTarea=" + tiempoTarea + ", items="
				+ items + "]";
	}

	public void mostrarItems() {
		for(Items item: items) {
			System.out.println(item.toString());
		}
	}


	
}
