

package banco3;

import java.io.Serializable;
import java.util.Date;

/* La interface Serializable no tiene métodos, pero es necesario implementarla pues el método writeObject de 
   la clase ObjetOutputStream recibe como  argumento un objeto "Serializable"
*/
public class Cliente implements Serializable{
    
     private String nombre, apellidos;  
     private String direccion, localidad;   //Atributos de los objetos de la clase Cliente
     private Date fechaNacimiento;
     
       Cliente(String aNombre, String aApellidos, String aDireccion, String aLocalidad, Date aFechaNacimiento){
         nombre = aNombre;   
         apellidos = aApellidos;     
         direccion = aDireccion;    //Constructor que recibe como parámetro los datos de los argumentos
         localidad = aLocalidad;   
         fechaNacimiento = aFechaNacimiento;   
     }
       
       
    public  String nombreCompleto() { return nombre + " " + apellidos; }   //usado para mostrar parte de los datos del cliente
            
    public String direccionCompleta() { return direccion + ", " + localidad; }

}
