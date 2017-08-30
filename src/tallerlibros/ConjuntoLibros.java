/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlibros;

/**
 *
 * @author ESTUDIANTE
 */
public class ConjuntoLibros {

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public Libro getLibro(int index) {
        return libros[index];
    }

    public ConjuntoLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }
            
    public boolean agregarLibro(Libro volumen){
    boolean exito=false;
    if(this.librosGuardados<this.numeroLibros){
        this.libros[librosGuardados]=volumen;
        librosGuardados=librosGuardados+1;
        exito=true;
    }
    return exito;
    }
    
    //correrLibros elimina los espacios vacios entre los libros, dejandolos todos al final del arreglo
   
    
    public Libro[] getPeoresLibros(){
        Libro tempLibro=null;
        int calificacion=10;
        int numeroDePeores=0;
        Libro peoresLibros[]=new Libro[numeroDePeores];
        for(int i=0; i<numeroLibros; ++i){
            if(this.libros[i].getCalificacion()<calificacion){
             calificacion=this.libros[i].getCalificacion();
            }
        }
        for(int i=0; i<numeroLibros; ++i){
            if(this.libros[i].getCalificacion()==calificacion){
             numeroDePeores=numeroDePeores+1;
            }
        }
        for(int i=0; i<numeroLibros; ++i){
            if(this.libros[i].getCalificacion()==calificacion){
             peoresLibros[i]=this.libros[i];
            }
        }
        return peoresLibros;
    }
    
    public Libro[] getMejoresLibros(){
        Libro tempLibro=null;
        int calificacion=0;
        int numeroDeMejores=0;
        Libro mejoresLibros[]=new Libro[numeroDeMejores];
        for(int i=0; i<numeroLibros; ++i){
            if(this.libros[i].getCalificacion()>calificacion){
             calificacion=this.libros[i].getCalificacion();
            }
        }
        for(int i=0; i<numeroLibros; ++i){
            if(this.libros[i].getCalificacion()==calificacion){
             numeroDeMejores=numeroDeMejores+1;
            }
        }
        for(int i=0; i<numeroLibros; ++i){
            if(this.libros[i].getCalificacion()==calificacion){
             mejoresLibros[i]=this.libros[i];
            }
        }
        return mejoresLibros;
    }
    
    
    private int numeroLibros;
    private int librosGuardados;
    private Libro libros[]=new Libro [numeroLibros];
      

}
