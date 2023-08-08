public class Main 
{ 
    public static void main(String[] args){
        Voiture voiture = new Voiture();
        voiture.start();
        
        Bateau bateau = new Bateau();
        bateau.start();
    }
}
class Vehicule{
    void start(){
        System.out.println("Voooooom");
    }
}
class Voiture extends Vehicule {
    }
class Bateau extends Vehicule {
}
