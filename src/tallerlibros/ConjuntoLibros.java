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
    public void correrLibros(){
    
    }
    
    private int numeroLibros;
    private int librosGuardados;
    private Libro libros[]=new Libro [numeroLibros];
      

}
