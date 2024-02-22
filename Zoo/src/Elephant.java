public class Elephant extends Animal {
    public void parler(){
        System.out.println("Je suis un elephant , je barrit !!!");
    }

    @Override
    public String toString() {
        return "Elephant{"+super.toString()
                +"}";
    }
}

