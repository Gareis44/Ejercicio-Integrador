package Ejercicio1;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private int NumIdentificacion;

    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int NumIdentificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.NumIdentificacion = NumIdentificacion;
    }

    //Metodo para setear las propiedades
    public String getnombre(){
        return nombre;
    }
    public void setNombre(String nombre){this.nombre = nombre;}

    public String getapellido(){
        return apellido;
    }
    public void setApellido(String apellido){this.apellido = apellido;}

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){this.edad = edad;}

    public int getNumIdentificacion(){
        return NumIdentificacion;
    }
    public void setNumIdentificacion(int NumIdentificacion){this.NumIdentificacion = NumIdentificacion;}

    //Metodo para mostrar los atributos
    public void imprimirAtributos() {
        System.out.println(nombre + " " + apellido + " de " + edad + " Numero de Identificacion: " + NumIdentificacion);
    }

}