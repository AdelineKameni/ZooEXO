import java.util.ArrayList;

public class List {
    ArrayList<Animal> listAnimal = new ArrayList<>();
    int idTigre=0;
    public void addAnimal(Animal t){
        idTigre++;
        t.setId(idTigre);

        // ajouter des elements d'une list
        listAnimal.add(t);
        System.out.println("Bien ajouter");
    }
}
