/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod.singleton;

/**
 *
 * @author User
 */
public class ClaseSingleton {
     //atributos que tendrán las instancias
    private String nombre;
    private String apellido;
    private static ClaseSingleton singleton = null;

    private ClaseSingleton(String nombre, String apellido) {

        
        this.nombre = nombre;
        this.apellido = apellido;
    }
//metodo para generar Instancias(crear nuevos objetos)
    //comprueba si existe
    //si existe, devuelve el existente
    // si no crea el nuevo
 public static ClaseSingleton getInstance(String nombre, String apellido) {

        if (singleton == null) {

            return singleton = new ClaseSingleton(nombre, apellido);

        } else {
            return singleton;
        }

    }

    //muestra el ultimo singleton creado
    public void mostrarSingleton() {

        System.out.println(nombre + " , " + apellido);

    }

    //gettres y stteres
   //para iniciar y darle valor a las variables
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido;
    }
//devuelve la secuencia de caracteres indicada
    @Override
    public String toString() {
        return "Singleton{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}


