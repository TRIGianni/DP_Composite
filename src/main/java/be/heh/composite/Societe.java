package be.heh.composite;

public abstract class Societe {
    protected int nbreVehicules;
    protected static final double COUTUNITVEHICULE = 5.0; //constante

    public void ajouteVehicule(){
        nbreVehicules++;
    }

    public abstract double calculCoutEntretien();

    public int getNbreVehicules(){
        return this.nbreVehicules;
    }
}
