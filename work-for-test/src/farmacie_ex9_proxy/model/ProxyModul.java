package farmacie_ex9_proxy.model;

public class ProxyModul implements IModul{
    private IModul modul;

    public ProxyModul(IModul modul) {
        this.modul = modul;
    }

    @Override
    public void achizitioneazaMedicament(Client c) {
        if(c.isAreAsigurare() == true){
            modul.achizitioneazaMedicament(c);
        }
        else {
            System.out.println("Nu s a putut pentru ca clientul nu are asigurare");
        }
    }
}
