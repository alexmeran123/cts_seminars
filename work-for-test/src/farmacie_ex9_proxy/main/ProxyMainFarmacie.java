package farmacie_ex9_proxy.main;

import farmacie_ex9_proxy.model.Client;
import farmacie_ex9_proxy.model.IModul;
import farmacie_ex9_proxy.model.ModulAchizitionare;
import farmacie_ex9_proxy.model.ProxyModul;

public class ProxyMainFarmacie {
    public static void main(String[] args) {
        Client client = new Client("Gigel", false, "Paracetamoale");
        Client client1 = new Client("Cornel", true, "Panadoale");

        IModul modul = new ModulAchizitionare();

        modul.achizitioneazaMedicament(client);

        IModul proxyModul = new ProxyModul(modul);

        proxyModul.achizitioneazaMedicament(client);
    }
}
