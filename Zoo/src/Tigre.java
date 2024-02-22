public class Tigre extends Animal {
    public void parler(){
        System.out.println("Je suis un Tigre, je rugit !!!");
    }

    @Override
    public String toString() {
        return "Tigre{"+super.toString()
                +"}";
    }
}

