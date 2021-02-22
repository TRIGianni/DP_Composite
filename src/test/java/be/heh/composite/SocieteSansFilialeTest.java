package be.heh.composite;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class SocieteSansFilialeTest {

@Test
public void ajoutDeuxVehicules(){
    Societe societe1 = new SocieteSansFiliale();
    societe1.ajouteVehicule();
    societe1.ajouteVehicule();
    assertEquals("Deux vehicules",2,societe1.getNbreVehicules());
    }

@Test
public void calculeCoutEntretienDeuxVehicules(){
    Societe societe1 = new SocieteSansFiliale();
    societe1.ajouteVehicule();
    societe1.ajouteVehicule();
    double cout = societe1.calculCoutEntretien();
    assertEquals("Cout de deux vehicules",10.0,cout,0.01);
}
}
