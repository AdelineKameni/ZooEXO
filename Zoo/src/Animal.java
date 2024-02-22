public abstract class Animal {
    // rendre private les attributs pour ne pas pouvoir les appeller hors de la class
    private String nom ;
    private String couleur;
    private int age;
    private int id;

    public String getNom() {
        return nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
        if( age<= 0){
            System.out.println(" Entrez un nombre positif ");
        }else{
            this.age = age;
        }

    }
    @Override
    public String toString() {
        return " " +
                "nom='" + nom + '\'' +
                ", couleur='" + couleur + '\'' +
                ", age=" + age +
                ", id=" + id +
                ' ';
    }
}