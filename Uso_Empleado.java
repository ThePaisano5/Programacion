package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

public static void main(String[] args) {

 /*Empleado empleado1=new Empleado("sebastian", 1000000, 2018,03,23);
Empleado empleado2=new Empleado("diego", 1930000, 2018,03,23);
Empleado empleado3=new Empleado("pedro", 1230000, 2018,03,23);
empleado1.subeSueldo(5);
empleado2.subeSueldo(5);
empleado3.subeSueldo(5);
System.out.println("nombre: "+ empleado1.dameNombre()+" sueldo: "+ empleado1.dameSueldo()
+" fecha de contrato: "+ empleado1.dameFechaDeContrato());
System.out.println("nombre: "+ empleado2.dameNombre()+" sueldo: "+ empleado2.dameSueldo()
+" fecha de contrato: "+ empleado2.dameFechaDeContrato());
System.out.println("nombre: "+ empleado3.dameNombre()+" sueldo: "+ empleado3.dameSueldo()
+" fecha de contrato: "+ empleado3.dameFechaDeContrato());
for(int i=0;i<3;i++) {
misEmpleados[i].subeSueldo(5);
}
for(int i=0;i<3;i++) {
System.out.println("nombre: "+ misEmpleados[i].dameNombre()+" sueldo: "+ misEmpleados[i].dameSueldo()
+" fecha de contrato: "+ misEmpleados[i].dameFechaDeContrato());
}*/
Jefatura jefe_RRHH=new Jefatura("marco",200000,2009,05,1);
jefe_RRHH.estableceIncentivo(89000);

Empleado[] misEmpleados=new Empleado[5];

misEmpleados[0]=new Empleado("sebastian", 1000000, 2018,03,23);
misEmpleados[1]=new Empleado("diego", 1930000, 2018,03,23);
misEmpleados[2]=new Empleado("pedro", 1230000, 2018,03,23);
misEmpleados[3]=jefe_RRHH; //polimorfismo o principio de sustitucion
misEmpleados[4]=new Jefatura("maria", 1237100,2003,9,12);
Jefatura jefa_finanzas=(Jefatura)misEmpleados[4];//casting de objetos o transformar un tipo
jefa_finanzas.estableceIncentivo(2000000); //de objeto a otro tipo.

for (Empleado e: misEmpleados) {
e.subeSueldo(5);
}

for (Empleado e: misEmpleados) {
System.out.println("nombre: "+ e.dameNombre()+" sueldo: "+ e.dameSueldo()
+" fecha de contrato: "+ e.dameFechaDeContrato());
}

}

}

//////////////////////////////////////////////////////////////////////////////////////////7

class Empleado{
private String nombre;
private double sueldo;
private Date altaContrato;
private static int IdSiguiente;
private int Id;



public Empleado(String nom, double sue, int agno, int mes, int dia){
nombre=nom;
sueldo=sue;

GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
altaContrato= calendario.getTime();
++IdSiguiente;
Id=IdSiguiente;

}


//getters
public String dameNombre() {

return nombre + " Id: "+Id;
}
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

//////////////////////////////////////////////////////////////////////////////
class Jefatura extends Empleado{

private double incentivo;


public Jefatura (String nom,double sue,int agno,int mes , int dia) {
super(nom,sue,agno,mes,dia);
}

public void estableceIncentivo (double b) {
incentivo=b;
}

public double dameSueldo() {
double sueldoJefe=super.dameSueldo();
return sueldoJefe+incentivo;
}

}