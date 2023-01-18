public class Main {
    public static void main(String[] args) {
        int numerolf = 0;

        if (numerolf > 0) {
            System.out.println("Este numero es positivo");
        } else if (numerolf < 0) {
            System.out.println("Este numero es negativo");
        } else {
            System.out.println("Este numero es cero");
        }


        int numeroWhile = -1;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        int i = 3;
        do {
            System.out.println(i);
            i++;
        } while (i < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "hola";
        switch (estacion) {
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            default: System.out.println("Esta no es una estacion");
        }


    }
}