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


    }
}