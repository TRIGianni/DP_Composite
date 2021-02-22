package be.heh.composite;

public class SocieteSansFiliale extends Societe {

    @Override
    public double calculCoutEntretien() {
        double cout = this.nbreVehicules * Societe.COUTUNITVEHICULE;
        return cout;
    }
}
