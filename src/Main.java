import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[3][3];
        Boolean[][] cos = new Boolean[3][3];
        Integer a = -1, b = 100;
        liczydlo(matrix,cos,a,b);
    }

    public static double liczydlo(Integer[][] tablica2DCyferki, Boolean[][] tablica2DFalszerki, int a, int b) {

        double wynik = 0;
        int pierwszaLiczba = a;
        int drugaLiczba = b;
        Integer[][] tablica2DLiczebki = tablica2DCyferki;
        Boolean[][] tablica2DPrawderki = tablica2DFalszerki;
        int dlugoscTablicy = tablica2DLiczebki.length;
        Random random = new Random();
        int sumaTrueLiczb = 0;
        int ileJestMagicznychLiczbWTejTabeli=0;
        // Wiem że to rozwiązanie działa tylko gdy tablica jest "kwadratem" ale szczerze nie wiem jak to zrobić inaczej
        for (int i = 0; i < dlugoscTablicy; i++) {
            for (int j = 0; j < dlugoscTablicy; j++) {
                if((i+j)+1==dlugoscTablicy+1 && random.nextInt(4)==0) {
                    tablica2DLiczebki[i][j]=1;
                } else if ((i+j)+1==dlugoscTablicy) {
                    tablica2DLiczebki[i][j]=-1;
                }else if(i==j && random.nextInt(4)==0) {
                    tablica2DLiczebki[i][j]=1;
                } else if (i==j) {
                    tablica2DLiczebki[i][j]=-1;
                } else {
                    tablica2DLiczebki[i][j] = random.nextInt(301) - 100;
                }
                if (tablica2DLiczebki[i][j]==pierwszaLiczba||tablica2DLiczebki[i][j]==drugaLiczba){
                    ileJestMagicznychLiczbWTejTabeli++;
                }
            }
        }

        for (int i = 0; i < dlugoscTablicy; i++) {
            for (int j = 0; j < dlugoscTablicy; j++) {
                tablica2DPrawderki[i][j] = random.nextBoolean();
                if (tablica2DPrawderki[i][j]){
                   sumaTrueLiczb += tablica2DLiczebki[i][j];
                }
            }
        }
       // pokazTable2D(tablica2DLiczebki,dlugoscTablicy); //Tu możesz sobie zobaczyć tablicę
       // pokazTable2D(tablica2DPrawderki,dlugoscTablicy);
        wynik =  ileJestMagicznychLiczbWTejTabeli * 1.0 / sumaTrueLiczb;
       // System.out.println(ileJestMagicznychLiczbWTejTabeli); //Tu możesz sobie zobaczyć wyniki
       // System.out.println(sumaTrueLiczb);
       // System.out.println(wynik);
        return wynik;
    }

    public static void pokazTable2D(Integer[][] tablicaNumeryczna,int dlugosc) {
        String odpowiedz="";
        for (int i = 0; i < dlugosc; i++) {
        for(int j = 0; j < dlugosc; j++){
      odpowiedz = odpowiedz + " " + tablicaNumeryczna[i][j].toString();
            }
        odpowiedz = odpowiedz + "\n";
        }
        System.out.println(odpowiedz);
    }
    public static void pokazTable2D(Boolean[][] tablicaNumeryczna,int dlugosc) {
        String odpowiedz="";
        for (int i = 0; i < dlugosc; i++) {
            for(int j = 0; j < dlugosc; j++){
                odpowiedz = odpowiedz + " " + tablicaNumeryczna[i][j].toString();
            }
            odpowiedz = odpowiedz + "\n";
        }
        System.out.println(odpowiedz);
    }
}