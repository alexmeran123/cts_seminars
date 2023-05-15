package farmacie_ex13_state.model;

public class StareSolicitata implements IState{
    @Override
    public void changeState(Reteta reteta) {
      if(reteta.getState() instanceof StareAchizitionata){
          System.out.println("nu s a putut solicita pentru ca reteta deja a fost achizitionata");
      }
      else {
          System.out.println("S a solicitat reteta cu numarul " + reteta.getNrReteta());
          reteta.setState(this);
      }
    }
}
