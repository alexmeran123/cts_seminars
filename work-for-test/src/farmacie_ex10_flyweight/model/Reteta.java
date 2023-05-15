package farmacie_ex10_flyweight.model;

public class Reteta {
    private int numarReteta;
    private float sumaPlata;
    private int nrMedicamente;

    public Reteta(int numarReteta, float sumaPlata, int nrMedicamente) {
        this.numarReteta = numarReteta;
        this.sumaPlata = sumaPlata;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNumarReteta() {
        return numarReteta;
    }

    public float getSumaPlata() {
        return sumaPlata;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }
}
