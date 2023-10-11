public class Magasin {
    private int identifiant;
    private String nom;
    private String adresse;

    private static final int CAPACITE_PR=50;
    private static final int EMP_CAP = 20;



    private Produit[] tabprod=new Produit[CAPACITE_PR];

    private employe[] tabemp = new employe[EMP_CAP];

    private int comp;
    private int comp_emp;
    private static int totalPr;

    public Magasin(){}
    public Magasin(int id, String nom, String ad)
    {
        this.identifiant=id;
        this.nom = nom;
        adresse=ad;
    }
    public  void ajouter(Produit p)
    {if(chercherPro(p)==false){
        if(comp<CAPACITE_PR){
            tabprod[comp]=p;
            comp++;
            totalPr++;}
        else{

            System.out.println("Magasin plein");
        }}
    else {

        System.out.println("le produit existe");
    }
    }

    public void afficher()
    {
        System.out.println("id :"+identifiant+"adresse :"+adresse);


        for (int i=0;i<comp;i++)
            tabprod[i].afficher();
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean chercherPro(Produit p)
    {

        for (int i=0;i<comp;i++)
        {
            if(Produit.comparer(p,tabprod[i]))
                return true;
        }
        return false;
    }

    public Magasin plusProduit(Magasin m1)
    {

        if(this.comp> m1.comp)
            return this;
        else if(this.comp<m1.comp)
            return m1;
        return null;
    }
    public static Magasin plusProduit(Magasin m1,Magasin m2)
    {

        if(m2.comp> m1.comp)
            return m2;
        else if(m2.comp<m1.comp)
            return m1;
        return null;
    }



    public int search(Produit p)
    {

        for (int i=0;i<comp;i++)
        {if(p.comparer(tabprod[i]))
            return i;}
        return -1;
    }
    public boolean supprimer(Produit p)
    {

        int indic=search(p);
        if (indic==-1) return false;
        for (int i=indic;i<comp;i++)
            tabprod[i]=tabprod[i+1];
        tabprod[comp]=null;
        comp--;
        return true;
    }

    public void ajouterEmploye(employe e) {
        if ((comp_emp) < EMP_CAP) {
            tabemp[comp_emp] = e;
            comp_emp++;
        }
    }

    public void afficherEmployees() {
        System.out.println("Magasin : " + identifiant + ", " + nom + ", " + adresse);

        System.out.println("Employes :");
        for(employe e : tabemp) {
            if (e != null){
                System.out.println(e);
            }

        }
    }

    public void afficherDetails() {
        System.out.println("Magasin : " + identifiant + ", " + nom + ", " + adresse);
        System.out.println("Produits :");
        for(Produit p : tabprod) {
            if(p!=null) {
                System.out.println(p);
            }

        }
        System.out.println("Employes :");
        for(employe e : tabemp) {
            if(e!=null) {
                System.out.println(e);
            }

        }
    }

    @Override
    public String toString() {

        String str="L'ensemble des produits :\n";

        for (int i=0;i<comp;i++)
            str+=tabprod[i]+"\n";

        return "identifiant"+identifiant+"adresse "+adresse+str;
    }




    public void afficheSalaires() {
        for (int i=0 ; i<tabemp.length;i++) {
            if (tabemp[i] != null) {
                System.out.println(tabemp[i].calculerSalaire());
            }
        }
    }

    public void affichePrimesResponsables() {
        for(employe e : tabemp) {
            if(e instanceof Responsable) {
                Responsable r = (Responsable) e;
                System.out.println(r.getNom() + " : " + r.getPrime() + " DT");
            }
        }
    }
    public void afficheNbEmployes() {
        int nbCaissiers = 0;
        int nbVendeurs = 0;
        int nbResponsables = 0;

        for(employe e : tabemp) {
            if(e instanceof Caissier) {
                nbCaissiers++;
            }
            else if(e instanceof Vendeur) {
                nbVendeurs++;
            }
            else if(e instanceof Responsable) {
                nbResponsables++;
            }
        }
        System.out.println("Magasin : " + identifiant + ", " + nom + ", " + adresse);
        System.out.println("Caissiers : " + nbCaissiers);
        System.out.println("Vendeurs : " + nbVendeurs);
        System.out.println("Responsables : " + nbResponsables);
    }

}



