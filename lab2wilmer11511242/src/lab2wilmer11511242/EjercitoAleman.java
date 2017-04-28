/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2wilmer11511242;

/**
 *
 * @author HP
 */
public class EjercitoAleman {
    private String Alias;
    private int edad;
    private String Casta;
    private int Resistencia;
    private String Tipodearma;
    private String Arma;

    public EjercitoAleman() {
    }

    public EjercitoAleman(String Alias, int edad, String Casta, int Resistencia, String Tipodearma, String Arma) {
        this.Alias = Alias;
        this.edad = edad;
        this.Casta = Casta;
        this.Resistencia = Resistencia;
        this.Tipodearma = Tipodearma;
        this.Arma = Arma;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCasta() {
        return Casta;
    }

    public void setCasta(String Casta) {
        this.Casta = Casta;
    }

    public int getResistencia() {
        return Resistencia;
    }

    public void setResistencia(int Resistencia) {
        this.Resistencia = Resistencia;
    }

    public String getTipodearma() {
        return Tipodearma;
    }

    public void setTipodearma(String Tipodearma) {
        this.Tipodearma = Tipodearma;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String Arma) {
        this.Arma = Arma;
    }

    @Override
    public String toString() {
        return "EjercitoAleman{" + "Alias=" + Alias + ", edad=" + edad + ", Casta=" + Casta + ", Resistencia=" + Resistencia + ", Tipodearma=" + Tipodearma + ", Arma=" + Arma + '}';
    }
    
}
