package aulaoexemplo1;

public class AulaoExemplo1 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int x;
        x = calc.somar(1, 2);
        System.out.println(x);
        x = calc.potencia(2, 4);
        System.out.println(x);
        
        Cachorro dog = new Cachorro();
        dog.falar();
        
        Animal animal;
        animal = new Cachorro();
        animal.falar();
        animal = new Gato();
        animal.falar();
        
        animal = new Animal();
    }
    
}
