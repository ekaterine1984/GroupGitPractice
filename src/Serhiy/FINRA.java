package Serhiy;

public class FINRA {
    public static void main(String[] args) {

        Numbers1to30();
    }

    public static void Numbers1to30 (){

        String result = "";

        for (int i = 1; i <=30 ; i++) {

            if(i % 15 == 0){
                result +="FINRA ";
            }else if (i % 5 == 0){
                result +="RA ";
            }else if (i % 3 == 0){
                result += "FIN ";
            }else {
                result += i+" ";
            }
        }

        System.out.println(result);

    }
}
