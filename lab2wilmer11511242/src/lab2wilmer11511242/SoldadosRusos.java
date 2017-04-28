package lab2wilmer11511242;

public class SoldadosRusos {

    private String nombre;
    private int id;
    private int edad;
    private int rango;
    private int resistencia;
    private String tipoArma;
    private String arma;

    public SoldadosRusos() {
    }

    public SoldadosRusos(String nombre, int id, int edad, int rango, int resistencia, String tipoArma, String arma) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.rango = rango;
        this.resistencia = resistencia;
        this.tipoArma = tipoArma;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "SoldadosRusos{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", rango=" + rango + ", resistencia=" + resistencia + ", tipoArma=" + tipoArma + ", arma=" + arma + '}';
    }
  

}
