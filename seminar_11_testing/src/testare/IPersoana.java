package testare;

public interface IPersoana {
	public String getSex();
	
	public int getVarsta() throws NenascutException;
	
	public boolean checkCNP();
}
