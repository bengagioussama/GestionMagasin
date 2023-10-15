
import java.util.Date;
public class Test {

    public static  void main(String [] arg ) throws MagasinPleinException , PrixNegatifException {




        //Produits
        Produit p1=new Produit();
        Produit p2=new Produit(1024,"Delice","Lait");
        Produit p3=new Produit(2510,"Vitalait","Yaourt");
        Produit p4=new Produit(3250,"Sicam","Tomate",1.2f );
        //


        p1.setMarque("Delice");
        Date d1=new Date();
        p2.setDateexp(d1);
        p2.afficher();
        Produit p5=new Produit(12,"delic",d1);


        Magasin m3 = new Magasin(1,"Carrefour","Centre-Ville");
        Magasin m4 = new Magasin(2,"Monoprix","Menzah 6");

        System.out.println("------------------------------------------------------------------------");


        Caissier c1 = new Caissier(1, "Oussama", "Tunis", 170, 1);
        Caissier c2 = new Caissier(2,"Bengagi","Tunis",50,2);
        System.out.println("------------------------------------------------------------------------");

        Vendeur v1 = new Vendeur(6, "Tarek", "Ariana", 140, 18);
        Responsable r1 = new Responsable(10,"Bouhmid","Borj Louzir",10,340);


        System.out.println("-------------------------------------------------------------------------");

        Vendeur v2 = new Vendeur(7, "Jihed", "BenArous", 155, 12);
        Vendeur v6 = new Vendeur(7,"Jihed","BenArous",155,12);
        Vendeur v3 = new Vendeur(8, "Ameni", "Tunis", 165, 20);
        Vendeur v4 = new Vendeur(9,"Kamel","Tunis",90,10);
        Responsable r2 = new Responsable(9, "Khaoula", "Sfax", 195, 450);
        Caissier c3 = new Caissier(10,"Samir","Benzart",88,9);

        m3.ajouterEmploye(c1);
        m3.ajouterEmploye(c2);
        m3.ajouterEmploye(v1);
        m3.ajouterEmploye(r1);

        m4.ajouterEmploye(v2);
        m4.ajouterEmploye(v3);
        m4.ajouterEmploye(v4);
        m4.ajouterEmploye(r2);
        m4.ajouterEmploye(c3);


        System.out.println("MAGASIN DETAILS");
        m3.afficherEmployees();
        m4.afficherEmployees();



        m3.ajouter(p1);
        m3.ajouter(p2);
        m3.ajouter(p3);
        m3.ajouter(p4);
        m3.ajouter(p5);

        m4.ajouter(p2);
        m4.ajouter(p3);
        m4.ajouter(p4);
        m4.ajouter(p5);
        System.out.println("---------------TOUT Les detaills---------------------");
        m3.afficherDetails();
        m4.afficherDetails();


        System.out.println("-------------------Calculer Salaire--------------------");

        // c1 c2 v1 v2 v3 v4 r1 r2 r3

        System.out.println("Salaire de Caissier 1 : " +c1.calculerSalaire() + "DT") ;
        System.out.println("Salaire de Caissier 2 : " +c2.calculerSalaire()+ "DT");
        System.out.println("Salaire de Responsable 1 : " +r1.calculerSalaire()+ "DT");
        System.out.println("Salaire de Responsable 2 : " +r2.calculerSalaire()+ "DT");
        System.out.println("Salaire de Vendeur 1 : " +v1.calculerSalaire()+ "DT");
        System.out.println("Salaire de Vendeur 2 : " +v2.calculerSalaire()+ "DT");
        System.out.println("Salaire de Vendeur 3 : " +v3.calculerSalaire()+ "DT");
        System.out.println("Salaire de Vendeur 4 : " +v4.calculerSalaire()+ "DT");
        System.out.println("--------------Nbr Employees------------");
        m3.afficheNbEmployes();
        m4.afficheNbEmployes();
        System.out.println("---------------------------------------");

        if (v6.equals(v2)) {
            System.out.println("Same Employee");
        }
        else {
            System.out.println("Not the same Employee");
        }

        System.out.println("---------------------------------------");

        m3.afficheSalaires();
        System.out.println("Afficher Prime Responsable");
        m3.affichePrimesResponsables();
        m4.affichePrimesResponsables();




    }



}
