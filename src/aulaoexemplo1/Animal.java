package aulaoexemplo1;

abstract public class Animal {
    private boolean dormindo;
    private boolean comFome;
    public void alimentar() {
        comFome = false;
    }
    public void dormir() {
        dormindo = true;
    }
    public void acordar() {
        dormindo = false;
    }
    abstract public void falar();
}
