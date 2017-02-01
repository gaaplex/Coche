
package coche;

public class Furgoneta extends Coche {
    
    
    private int capacidadDeCarga;
    private int NumPasajeros;
    

    public  Furgoneta( int NumPasajeros,int capacidadDeCarga){
        
        super();
        this.NumPasajeros = NumPasajeros;
        this.capacidadDeCarga = capacidadDeCarga;
        
        
         
        
        
    }
    
    public String DimeDatosFurgoneta(){
        
        return "La capacidad de carga es"+capacidadDeCarga+" y el numero de  pasajetos es "+NumPasajeros;
        
    }
    
}
