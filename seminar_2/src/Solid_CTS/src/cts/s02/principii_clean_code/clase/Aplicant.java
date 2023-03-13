package Solid_CTS.src.cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;

	private static int pragAcceptare=80;
	protected String[] denumireProiect;


	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatut(){
//		if(this.punctaj> Aplicant.pragAcceptare)
			System.out.println("Aplicantul "+this.nume+" "+this.prenume+
					((this.punctaj <  Aplicant.pragAcceptare)?"nu ":"") +
					" a fost acceptat.");
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public void setDenumireProiect(String[] denumireProiect) {
		this.denumireProiect = denumireProiect;
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
	}
	public void setNr_proiecte(int nr_proiecte) {
		this.nr_proiecte = nr_proiecte;
	}

	public static void setPragAcceptare(int pragAcceptare) {
		Aplicant.pragAcceptare = pragAcceptare;
	}

	protected String finantareaPrimita(int sumaFinantata){
		return nume + prenume + " primeste " + sumaFinantata +" Euro/zi in proiect.";
	}
	public abstract void afisareaFinantarii();

	@Override
	public String toString() {
		return "Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte +  ", DenumireProiect=" + Arrays.toString(denumireProiect) ;
	}
}