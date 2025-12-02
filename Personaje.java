public class Personaje {
    private String nom;
    private int dinero;

    public Personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
    }

    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$.");
    }

    // Nuevo método para cambiar el nombre
    public void cambiarNombre(String nuevoNombre) {
        System.out.println(nom + " ahora se llama " + nuevoNombre + ".");
        this.nom = nuevoNombre;
    }

    public static void main(String[] args) {
        Personaje jugador = new Personaje("Trevor", 500);
        jugador.mostrarInfo();                    // Trevor tiene 500$.
        
        jugador.cambiarNombre("Mike");            // Trevor ahora se llama Mike.
        
        jugador.mostrarInfo();                    // Mike tiene 500$.
    }
}