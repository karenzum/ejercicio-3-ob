public class Main {
    public static void main(String[] args){
        int result = 0;
        result = suma(1,2,3);
        System.out.println("El resultado es: " + result);
        coche ar = new coche();
        ar.añadirPuerta();
        System.out.println("El numero de puertas es: " + ar.numPuertas);

    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

 class coche{
    public int numPuertas = 4;
    public void añadirPuerta(){
          this.numPuertas++;
    }
}
