package mx.sostech;

public class SuperHumano extends Humano {

    private String alias, poder, faccion, kriptonita;
    int lvlPelea;

    public int getLvlPelea() {
        return lvlPelea;
    }

    public void setLvlPelea(int lvlPelea) {
        this.lvlPelea = lvlPelea;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getFaccion() {
        return faccion;
    }

    public void setFaccion(String faccion) {
        this.faccion = faccion;
    }

    public String getKriptonita() {
        return kriptonita;
    }

    public void setKriptonita(String kriptonita) {
        this.kriptonita = kriptonita;
    }
}
