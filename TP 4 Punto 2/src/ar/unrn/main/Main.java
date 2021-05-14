package ar.unrn.main;

import ar.unrn.modelo.ItemHistoriasDeUsuario;
import ar.unrn.modelo.ItemSpike;

public class Main {

	public static void main(String[] args) {
		ItemHistoriasDeUsuario tarea = new ItemHistoriasDeUsuario("Gestionar usuario", 20);
		
		ItemHistoriasDeUsuario subtarea = new ItemHistoriasDeUsuario("Gestionar usuario", 20);
		
		subtarea.agregarTarea( new ItemHistoriasDeUsuario("Gestionar tarea", 60));
		
		tarea.agregarTarea(subtarea);
		
		ItemSpike tarea2 = new ItemSpike("Tarea de analisis", 30);
		
		tarea.mostrarItems();
		
		tarea2.mostrarItem();
	}

}
