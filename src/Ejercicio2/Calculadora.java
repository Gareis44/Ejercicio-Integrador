package Ejercicio2;

public class Calculadora {
    private int A;
    private int B;
    private String simbolo;
    private int resultado;


    public Calculadora(int A, int B, String simbolo){
        this.A = A;
        this.B = B;
        this.simbolo = simbolo;
    }

    //Metodo para mostrar los atributos
    public void imprimirAtributos() {
        if (simbolo.equals("+")){
            resultado = A + B;
        } else if (simbolo.equals("-")) {
            resultado = A - B;
        } else if (simbolo.equals("*")) {
            resultado = A * B;
        } else if (simbolo.equals("/")) {
            resultado = A / B;
        }
        System.out.println("///RESULTADO = " + resultado);
    }


}
