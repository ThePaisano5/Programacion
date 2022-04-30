package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

public static void main(String[] args) {


Persona[] lasPersonas=new Persona[2];
lasPersonas[0]=new Empleado2("Esteban Ruiz", 10000,2018,05,18);
lasPersonas[1]=new Alumno("Santiago","Ingenieria de Sistemas");

for(Persona p: lasPersonas) {
System.out.println(p.dameNombre()+","+p.dameDescripcion());
}
}
}

//////////////////////////////////////////////////////


abstract class Persona{
private String nombre;


public Persona(String nom) {
nombre=nom;

}
public String dameNombre() {

return nombre;
}
public abstract String dameDescripcion();


}
/////////////////////////////////////////////////////////////
class Empleado2 extends Persona{

private double sueldo;
private Date altaContrato;
private static int IdSiguiente;
private int Id;



public Empleado2(String nom, double sue, int agno, int mes, int dia){
super(nom);
sueldo=sue;

GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
altaContrato= calendario.getTime();
++IdSiguiente;
Id=IdSiguiente;

}


public String dameDescripcion(){
return "este empleado tiene Id=" +Id+ "con un sueldo = "+ sueldo;
}


//getters

public double dameSueldo() {
return sueldo;
}

public Date dameFechaDeContrato () {
return altaContrato;
}

//setters
public void subeSueldo(double porcentaje) {
double aumento=sueldo*porcentaje/100;
sueldo+=aumento;
}
}

//////////////////////////////////////////////////////////////////////////////////
class Alumno extends Persona{

private String carrera;
private String nombre;
public Alumno(String nom, String car) {
super(nom);
nombre=nom;
carrera=car;
}
public String dameDescripcion(){
return "este alumno se llama: "+nombre+" esta estudiando la carrera de =" +carrera;
}

}