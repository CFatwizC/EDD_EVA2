package eva2_8_super;
public class EVA2_8_SUPER {
    
    public static void main(String[] args) {
      Animal Animal=new Animal("cualquier cosa", 50);
      mamifero mamifero=new mamifero("Rojo", "Javier", 40);
      canes canes=new canes();
    }
    
}

class Animal{
    private String nombre;
    private int peso;

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("IT'S ALIVE" + " constructor 2");

    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Animal(){
        System.out.println("IT'S ALIVE");
    }
    public void respirar(){
        System.out.println("Estoy respirando");
    }
}

    class mamifero extends Animal{
        private String colorP;

    public String getColorP() {
        return colorP;
    }

    public void setColorP(String colorP) {
        this.colorP = colorP;
    }

    public mamifero(String colorP, String nombre, int peso) {
        super(nombre, peso);
        this.colorP = colorP;
        System.out.println("Hola, soy el constructor 2");
    }

    

   
        
    
        public mamifero(){
            //super --> apunta a constructores y a methods de la super clase
            super(); //ve cosas de la super clase, que en este caso es la que esta vinculada al extends //LLamada al constructor default que en este caso es animal por lo mismo del extends
            //lo primero a llamar a un constructor es llamar al constructor de la superclase (ejecuta lo de el metodo "animal");
            System.out.println("Dios es grande");
        }
    }

class canes extends mamifero{
    public canes(){
        super();
        System.out.println("Soy un can");
    }
}
