public class Main {
    public static void main(String[] args) {
        //ejercicio 1
        System.out.println("     Ejercicio 1 if");
        int numeroIf=5;
        if(numeroIf == 0)
        {
            System.out.println("El número es 0");
        } else if (numeroIf < 0) {
                System.out.println("El número es negativo!");
        }else System.out.println("El número es positivo!");


        //ejercicio 2 while
        System.out.println("     Ejercicio 2 while");
       int numeroWhile = 0;
       while (numeroWhile < 3){
           numeroWhile++;
           System.out.println(numeroWhile);
       }
        // ejercicio 3 do while
        System.out.println("     Ejercicio 3 do while");
        int numeroDOWhile = 0;
        do{
            numeroDOWhile++;
            System.out.println(numeroDOWhile);
        }while (numeroWhile < -8);

        // Ejercicio 4 bucle for
        System.out.println( "       // Ejercicio 4 bucle for");
        int numeroFor;
        for (numeroFor =0; numeroFor<= 3;numeroFor++)
        {
            System.out.println(numeroFor);
        }

        // Ejercicio 5 Switch
        System.out.println( "       // Ejercicio 5 Switch");
        var estacion =  "verano";

        switch ( estacion){
            case "primavera":
                System.out.println("La estación es Primavera");
            break;

            case  "verano":
                System.out.println("La estación es Verano");
            break;

            case "otoño":
                System.out.println("La estación es Otoño");
            break;

            case "invierno":
                System.out.println("La estación es Invierno");
            break;
            default:
                System.out.println("No es una estación");
        }


    }
}