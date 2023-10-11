public class Responsable extends  employe{
    private  int prime;
    private static final double tauxHoraire = 10;
    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, int prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public double calculerSalaire() {

        double salaireBase = tauxHoraire * getNbr_heures();
        if(getNbr_heures() > 160) {
            salaireBase += (getNbr_heures() - 160) * tauxHoraire * 1.2;
        }
        return salaireBase + prime;
    }

    public int getPrime() {
        return prime;
    }
}
