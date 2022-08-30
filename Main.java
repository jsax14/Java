

public class Main {
    public static void main(String[] args) {
        int numeroIf = 8;
        if (numeroIf == 0) {
            System.out.println("es cero");
        } else if (numeroIf < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println("es positivo");
        }


        //2do punto
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("while: " + numeroWhile);
            numeroWhile++;
        }

        //3er punto
        int numeroDoWhile = 5;
        do {
            System.out.println("do while: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 6);
        //4to punto
        int numeroFor = 0;
        for (int i = 0; i <= 3; i++) {
            System.out.println("for :" + numeroFor);
            numeroFor++;

        }

        //5to punto
        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("es otra estacion");
        }

    }
}