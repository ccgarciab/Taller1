package tallerlibros;

public class ConjuntoLibros {

    private int numeroLibros=20;
    private int librosGuardados=0;
    private Libro libros[]=new Libro [numeroLibros];
    
    public int getNumeroLibros() {
        return numeroLibros;
    }

    public Libro getLibro(int index) {
        if(index<numeroLibros)
            return libros[index];
        else
            return null;
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
    
    public void getprintInformaciónColeccion(){
        System.out.println("Numero de libros en la coleccion: "+this.librosGuardados);
        System.out.println("Espacio en la coleccion: "+(this.numeroLibros-this.librosGuardados)+" libros");
        System.out.println('\n');
        for(int i=0; i<librosGuardados; ++i){
            System.out.println("Libro "+(i+1));
            System.out.println("Titulo: "+this.libros[i].getTitulo());
            System.out.println("Autor: "+this.libros[i].getAutor());
            System.out.println("Numero de paginas: "+this.libros[i].getNumeroPaginas());
            System.out.println("Calificacion: "+this.libros[i].getCalificacion());
            System.out.println('\n');
        }
    }
    
    
    public void getPeoresLibros(){
        Libro tempLibro=null;
        int calificacion=10;
        int numeroDePeores=0;
        int j=0;
        Libro peoresLibros[]=new Libro[librosGuardados];
        if(librosGuardados>0){
        for(int i=0; i<librosGuardados; ++i){
            if(this.libros[i].getCalificacion()<calificacion){
             calificacion=this.libros[i].getCalificacion();
            }
        }
         for(int i=0; i<librosGuardados; i++){
            if(this.libros[i].getCalificacion()==calificacion){
             peoresLibros[j]=this.libros[i];
             numeroDePeores++;
             j++;
            }
        }
        
        for(int i=0; i<numeroDePeores; i++){
            System.out.println((i+1)+". libro: "+peoresLibros[i].getTitulo()+" calificacion: "+calificacion);
        }
    }
        else System.out.println("no hay libros");
    }
    public void getMejoresLibros(){
        Libro tempLibro=null;
        int calificacion=0;
        int numeroDeMejores=1;
        int j=0;
        Libro mejoresLibros[]=new Libro[librosGuardados];
        if (librosGuardados>0) {
        for(int i=0; i<librosGuardados; i++){
            if(this.libros[i].getCalificacion()>calificacion){
             calificacion=this.libros[i].getCalificacion();
             
            }
        }
        for(int i=0; i<librosGuardados; i++){
            if(this.libros[i].getCalificacion()==calificacion){
             mejoresLibros[j]=this.libros[i];
             numeroDeMejores++;
             j++;
            }
        }
        
        for(int i=0; i<j;i++){
            System.out.println((i+1)+". libro: "+mejoresLibros[i].getTitulo()+" calificacion: "+calificacion);
                    
        }
    }
        else System.out.println("no hay libros");
    }
    public boolean eliminarLibrosNombre(String nombre){
        int libroborrado=0;
        boolean exito=false;
        for(int i=0; i<librosGuardados;i++){
        if(this.libros[i].getTitulo().equals(nombre)){
            this.libros[i]=null;   
            exito=true;
        }
        }
        
        
        for (int i = 0; i < librosGuardados; i++) {
            if(this.libros[i]==null){
                libroborrado++;
            }
            if(i>0){
            if (this.libros[i]!=null&&this.libros[i-1]==null){
                this.libros[i-libroborrado]=this.libros[i];
                this.libros[i]=null;
            }
        }
        }librosGuardados-=libroborrado;
        return exito;
    }
    
    public boolean eliminarLibrosAutor(String autor){
       int libroborrado=0;
        boolean exito=false;
        
        for(int i=0; i<librosGuardados;i++){
        if(this.libros[i].getAutor().equals(autor)){
            this.libros[i]=null;   
            exito=true;
        }
        }
      for (int i = 0; i < librosGuardados; i++) {
            if(this.libros[i]==null){libroborrado++;
            }
            if(i>0){
            if (this.libros[i]!=null&&this.libros[i-1]==null){
                this.libros[i-libroborrado]=this.libros[i];
                this.libros[i]=null;
            }
        }
        }librosGuardados-=libroborrado;
        return exito;
    }
      

}
