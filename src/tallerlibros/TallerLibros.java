
package tallerlibros;
import java.util.Scanner;


public class TallerLibros {

    public static void main(String[] args) {
       Scanner in= new Scanner (System.in);
        int n=0,opcion, numeroPaginas, calificacion,eliminar;
        String   titulo, autor;
        boolean confirmar, exit=false, calif=false;
        
        ConjuntoLibros conjunto =new ConjuntoLibros(10);
        System.out.println("Bienvenido al almacenamiento de libros '\n elija la opcion de la accion deceada");
        do{
        
        System.out.println("\n1. añadir libros \n2. eliminar un libro\n"
                         +"3. mejor y peor calificacion de los libros\n"
                         +"4. ver contenido del conjunto de libros\n"
                        + "5. salir");
                         
        opcion=in.nextInt();
        switch(opcion){
            case 1: 
                    System.out.println("deme titulo del libro");
                    titulo=in.next();
                    System.out.println("deme autor");
                    autor=in.next();
                    System.out.println("deme numero de paginas");
                    numeroPaginas=in.nextInt();
                    do{
                    System.out.println("deme calificacio (0-10)");
                    calificacion=in.nextInt();
                    if(calificacion>=0&&calificacion<=10){
                        calif=true;
                    }
                    else {System.out.println("calificacion incorrecta");}
                    }while(calif==false); 
                    calif=false;
                    Libro libro=new Libro(titulo, autor, numeroPaginas, calificacion);
                    confirmar=conjunto.agregarLibro(libro);
                    System.out.println(confirmar);
                    conjunto.getprintInformaciónColeccion();
                    
                    break;
            case 2: conjunto.getprintInformaciónColeccion();
                    System.out.println("desea eliminar por titulo o autor (digite 1 para titulo o 2 para autor");
                    eliminar=in.nextInt();
                    if(eliminar==1){
                    System.out.println("digite el titulo del libro que desea eliminar");
                    titulo=in.next();
                    confirmar=conjunto.eliminarLibrosNombre(titulo);
                    System.out.println(confirmar);
                    }
                    if(eliminar==2){
                    System.out.println("digite el nombre del autor a eliminar");
                    autor=in.next();
                    confirmar=conjunto.eliminarLibrosAutor(autor);
                    System.out.println(confirmar);
                    if(eliminar!=1&&eliminar!=2){
                        System.out.println("opcio incorrecta");
                    }
                   
                } 
                    break;
                case 3: 
                    System.out.println("el/los mejores libros son: ");
                    conjunto.getMejoresLibros();
                    System.out.println("\nel/los peores libros son: ");
                    conjunto.getPeoresLibros();
                    break;
                 
                case 4:
                    System.out.println("el conjunto de libros esta compuesto por: ");
                    conjunto.getprintInformaciónColeccion();
                    break;
                case 5:
                    System.out.println("gracias por usar el almacenamiento de los libros");
                    exit=true;
                    break;
                default: System.out.println("digito no permitido");
                break;
            }
            
            
    }while(exit==false);
    }
    
}
