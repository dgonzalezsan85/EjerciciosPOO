package actividadextra2.entidades;

public class Figura {
    private int lado;
    private int base;
    private int altura;
    private int radio;
    private int apotema;
    private int diagMay;
    private int diagMen;

    public Figura() {
    }

    public Figura(int lado, int base, int altura, int radio, int apotema, int diagMay, int diagMen) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
        this.apotema = apotema;
        this.diagMay = diagMay;
        this.diagMen = diagMen;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }

    public int getDiagMay() {
        return diagMay;
    }

    public void setDiagMay(int diagMay) {
        this.diagMay = diagMay;
    }

    public int getDiagMen() {
        return diagMen;
    }

    public void setDiagMen(int diagMen) {
        this.diagMen = diagMen;
    }
    
    
    
    
                    
}
