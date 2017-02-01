 
package coche;
 
public class Coche {//1
	
	private int ruedas;// Se encapsulan las propiedades de la plataforma, para que no se puedan alterar Por otras clases
	
	private int largo;// entero porque esta en cm
	
	private int ancho;
	
	private int motor;// capacidad en cm^3
	
	private int peso_plataforma;
	
	  private String color;
	
	int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	
	public Coche(){// metodo constructor
		// da un estado inicial a los objetos
		
 		ruedas = 4;
		ancho = 2000;
		largo = 3000;
		motor = 1600;
		peso_plataforma =  500;
		
	}
	
	public String getColor(){//2
		
		return  color;
	}//2
								
	public void setColor(String color){//3
		
		this.color = color;
	}//3

	public String Datos_Carro() {//4
		return "La plataforma del vehículo tiene " + ruedas
		+ "\n  mide "+ largo/100+ " metros, con un ancho de "+ancho+
		"cm \n y un peso de la plataforma de "+ peso_plataforma+"kg";
	}//4

	public void setAsientos_cuero(String asientos_cuero) {//5
 
		if(asientos_cuero.equalsIgnoreCase("si")){//6
			
			this.asientos_cuero = true;
			
		}//6
			else{//7
			if(asientos_cuero == "no"){
			this.asientos_cuero = false;
		
				}//7
			}
		}//5
	
	public String getAsientos_cuero(){//8
		
		if(this.asientos_cuero== true){//10
			
			return "El coche tiene asientos de cuero";
		}//10
		else{//9
			
			return "El coche no tiene asientos de cuero";
		}//)
	
	
	}//8
	
	
	public void  configuar_climatizador(String climatizador){//11
		
		if(climatizador.equalsIgnoreCase("si")){//13
			
			this.climatizador = true;
			
			
		}//13
		else{//12
			
			this.climatizador  = false;
			
		}//12
	}//11
		
		public String getClimatizador(){//14
			
			if( this.climatizador == true){//15
				
				return "El auto tiene climatizador";
				
			}//15
				else{//16
				
					return "El auto tiene aire acondicionado";
				}//16
			
		}//14
		
		
		public int PesoDelCoche(){//15  Este metodo tiene  la caracteristica de ser setter y getter, pero es poco recomendada.
		
			int peso_Carroceria = 500;
			
			peso_total  = peso_plataforma + peso_Carroceria;
			
			if(asientos_cuero == true){//16
			
			peso_total = peso_total + 50;
			
			}//16
			
			
			if(climatizador == true){//17
				
				peso_total = peso_total + 20;
			}//17
	
			return peso_total;
		}//15
		
		
		public int precio_final(){//18
		
			int precio_Inicial = 10000;
			
				if(asientos_cuero == true){//19
			
					precio_Inicial +=  + 2000;
					
					}
			
				if(climatizador == true){//20
					
					precio_Inicial += 1500;
				}//20
		
			
			return precio_Inicial;
			
		}//18
		
}//1


