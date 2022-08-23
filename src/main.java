import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        strSinifArray();

        ArrayList<String> groups = new ArrayList<String>();
        int[] arr = {10,20,30,40,50};


        //eklemek için
        groups.add("Metalica");
        groups.add("Iron Maiden");
        groups.add("guns' n roses");
        groups.add("black sabbath");

        //silmek için index ve direkt indexin içerisindeki değer ile de silebiliyoruz
        //groups.remove("Iron Maiden");
        groups.remove(1);

        /*
        System.out.println("o. indeks " + groups.get(0));
        System.out.println("2. indeks " + groups.get(2));
        System.out.println("Array list uzunluğu: " + groups.size());
        */

        /*
        //arraylistin bütün elemanlarını yazdırmak istersek bunu yaparız
        for(int i = 0; i < groups.size(); i++){
            System.out.println("Eleman : " + groups.get(i));
        }
        //foreach kullanarak yapacağız aşşağıda
         */

        for(String s:groups){
            System.out.println("Eleman : " + s);
        }
        for (int i : arr){
            System.out.println("Eleman : " + i);
        }

    }

    public static void strSinifArray(){
        String s1 = "Mustafa";
        String s3 = new String("Mustafa");
        String s2 = new String("Mustafa");

        System.out.println(s2.length());
        System.out.println("o. indeks " + s2.charAt(0));
        System.out.println("5. indeks " + s2.charAt(5));
        System.out.println("o. indeks " + s2.charAt(s2.length()-1));

        //stringimiz Mu ile mi başlıyor
        System.out.println(s2.startsWith("Mu"));
        // stringimiz an ile mi bityor
        System.out.println(s2.endsWith("an"));


    }
}
