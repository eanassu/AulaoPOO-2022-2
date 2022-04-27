package aulaoexemplo1;

public class Calculadora {
    
    public int somar( int a, int b ) {
        return a + b;
    }
    
    public int potencia( int a, int b ) {
        int result = 1;
        for( int i = 0; i < b; i++ ) result = result * a;
        return result;
    }
}
