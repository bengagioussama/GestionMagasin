public class Caissier extends employe{
    private int numeroDeCaisse;
    private static  final double tauxHoraire = 5;

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public double calculerSalaire() {

        double salaireBase = tauxHoraire * getNbr_heures();
        if(getNbr_heures() > 180) {

            salaireBase += (getNbr_heures() - 180) * tauxHoraire * 0.15;
        }
        return salaireBase;
    }
}

