public class Voiture {

    String couleur;
    int roue;
    String marque;

    public Voiture(String couleur, int roue, String marque) {
        this.couleur = couleur;
        this.roue = roue;
        this.marque = marque;
    }


    @Override
    public String toString() {
        return "Voiture{" +
                "couleur='" + couleur + '\'' +
                ", roue=" + roue +
                ", marque='" + marque + '\'' +
                '}';
    }
}
