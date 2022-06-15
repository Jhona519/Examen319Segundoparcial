int fibonacci(int n)
{
    if(n>1){
       return fibonacci(n-1)+fibonacci(n-2);
   }
    else if(n=1){
        return1;
   }
    else if(n==0){
        return0;
   }
    else{
        System.out.println("Debes ingresar un tamaño mayoroiguala1");
        return -1;
   }
}


public int tamaño;
public String nombre;

public Fibonacci(){
}
public Fibonacci(String nombre,int tamaño){
    this.nombre=nombre;
    this.tamaño=tamaño;
}

public void mostrarSerie(){
    System.out.println(this.nombre+" de tamaño"+this.tamaño+":");
    for(inti=0;i<tamaño;i++){
        System.out.print(fibonacci(i)+"");
   }
    System.out.println();
}

public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public int getTamaño(){
    return tamaño;
}
public void setTamaño(int tamaño){
    this.tamaño=tamaño;
}

Fibonacci f1=new Fibonacci("fibonacci1",10);
f1.mostrarSerie();