import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[3][3];
        Boolean[][] cos = new Boolean[3][3];
        Integer a = 3, b = 7;
liczydlo(matrix,cos,a,b);
    }

    public static int liczydlo(Integer[][] tablica2DCyferki, Boolean[][] tablica2DFalszerki, int a, int b) {

        int wynik = 0;
        Integer[][] tablica2DLiczebki = tablica2DCyferki;
        Boolean[][] tablica2DPrawderki = tablica2DFalszerki;
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; i++) {
                int losowa = random.nextInt(-301) + 200;
                tablica2DLiczebki[i][j] = losowa;
            }
        }
        pokazTable2D(tablica2DLiczebki);
        return wynik;
    }

    public static void pokazTable2D(Integer[][] tablicaNumeryczna) {
        String odpowiedz="";
        System.out.println("d");
        for (int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; i++){
      odpowiedz = odpowiedz + " " + tablicaNumeryczna[i][j].toString();
            }
        odpowiedz = odpowiedz + "\n";
        }
        System.out.println(odpowiedz);
    }
}