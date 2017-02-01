 /* Este progrmama contien una importante linea de cógo que  representa el uso de la herencia en Java*/


package coche;
 


 
public class Uso_Vehiculo {

	public static void main (String args []){
		
	 
	 Coche miCoche1 = new Coche();
         
	 miCoche1.setColor("negro");
       
         Furgoneta miFurgoneta1 = new Furgoneta(8,500);
         
         miFurgoneta1.setColor("blanco");/* Herencia en acción. No tuve que crear el metodo setColor de la clase  Furgoneta*/
         
         miFurgoneta1.setAsientos_cuero("Si");
         miFurgoneta1.configuar_climatizador("Si");
         
         System.out.println(miCoche1.Datos_Carro()+" "+miCoche1.getColor());
            System.out.println(miFurgoneta1.Datos_Carro()+" "+miFurgoneta1.getColor()+" "+miFurgoneta1.DimeDatosFurgoneta());
            
         
	}
}



