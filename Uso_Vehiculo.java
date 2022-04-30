package poo;

import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Coche Renault=new Coche (); //INSTANCIAR UNA CLASE
		
		System.out.println("Este coche tiene " + Renault.ruedas + "ruedas.");
		
		Coche micoche=new Coche();
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));;
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));;
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println("El precio final del coche es: "+ micoche.precio_coche());*/
		
		
		Coche coche1= new Coche();
		coche1.establece_color("morado");
		Furgoneta furgoneta1=new Furgoneta(8, 500);
		furgoneta1.establece_color("blanco");
		furgoneta1.configura_climatizador("si");
		furgoneta1.configura_asientos("no");
		
		System.out.println(coche1.dime_datos_generales()+ " "+ coche1.dime_color());
		System.out.println(furgoneta1.dime_datos_generales()+ " "+furgoneta1.dimeDatosFurgonetas() + " "+furgoneta1.dime_color());
		
		
	}
}