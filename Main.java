import estados.*;

class Main {
  public static void main(String[] args) {
    Estado estado;
    for(int i = 0; i < 10; i++)
        {
        estado = 
        (Math.random() < 0.5) ? new Foo() : new Bar();
    
    System.out.println(estado.escribir());
        }
 
}
  

}