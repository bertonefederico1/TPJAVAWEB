package logica;

import datos.*;
import java.util.*;
import entidades.*;

public class ControladorRepuesto {
	
	DatosRepuesto dr;
	RepuestoFiltrar rf;
	
	public ControladorRepuesto(){
		dr = new DatosRepuesto();
		rf = new RepuestoFiltrar();
	}
	
	
	public ArrayList<Repuesto> traerRepuestosBajoStock(){
		return dr.traerRepuestosBajoStock();
	}
	
	public ArrayList<Repuesto> traerRepuestos(){
		return dr.traerRepuestos();
	}
	
	public ArrayList<Repuesto> repuestosFiltrados(String desc_buscar){
		return rf.traerRepuestos(desc_buscar);
	}
	
	public void agregarRepuesto (Repuesto rep){
		dr.agregarRepuesto(rep);
	}
	
	public void modificarRepuesto (Repuesto rep){
		dr.modificarRepuesto(rep);
	}
	
	public void eliminarRepuesto (int cod_repuesto){
		dr.eliminarRepuesto(cod_repuesto);
	}

}
