package eva2_7_this;
public class EVA2_7_THIS {
    public static void main(String[] args) {
        //imprimir();
        //this no se puede usar en un contexto estático 
    }
    
}




//this es una referencia a una instancia de la clase
//todos los objetos tienen this
//pueden usar this en cualquier clase
//this solo funciona internamente dentro del objeto
class persona{
    private String nombre;

    public persona(String nombre) {
        this.nombre = nombre;
        //this.nombre es el atributo de la clase
        //nombre es la variable (parámetro) declarado en el metodo
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimirDatos(){
        System.out.println("El nombre es: " + this.nombre);
    }
    
    public void imprimir(){
        //simon, si se ve el this
    }
}