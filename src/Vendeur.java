public class Vendeur extends  employe{
    private int tauxDeVente;
    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, int tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public double calculerSalaire() {
        return (450 * tauxDeVente)/100;
    }

}
