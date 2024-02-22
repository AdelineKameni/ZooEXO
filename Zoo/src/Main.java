//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tigre tigrou;
        //pour instancier
        tigrou = new Tigre();
        tigrou.setAge(-4);
        tigrou.setCouleur("orange");
        tigrou.setNom("tigrou");

        Tigre tigresse;
        tigresse = new Tigre();
        tigresse.setAge(6);
        tigresse.setCouleur("blanc");
        tigresse.setNom("tigresse");

        Elephant elephanta;
        elephanta = new Elephant();
        elephanta.setAge(200);

        System.out.println(tigresse);
        System.out.println(tigrou);
        // ajouter les elements dans la list
        List list1 = new List();
        list1.addAnimal(tigrou);
        list1.addAnimal(tigresse);
        list1.addAnimal(elephanta);

        System.out.println(tigresse);
        System.out.println(tigrou);
        System.out.println(elephanta);

        tigrou.parler();
        elephanta.parler();
    }
}