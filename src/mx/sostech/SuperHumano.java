package mx.sostech;

public class SuperHumano extends Humano {

    private String alias, poder, faccion, kriptonita;
    int lvlPelea, mov1, mov2, mov3;

    public int getLvlPelea() {
        return lvlPelea;
    }

    public void setLvlPelea(int lvlPelea) {
        this.lvlPelea = lvlPelea;
    }

    public int getMov1() {
        return mov1;
    }

    public void setMov1(int mov1) {
        this.mov1 = mov1;
    }

    public int getMov2() {
        return mov2;
    }

    public void setMov2(int mov2) {
        this.mov2 = mov2;
    }

    public int getMov3() {
        return mov3;
    }

    public void setMov3(int mov3) {
        this.mov3 = mov3;
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
