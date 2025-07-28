package udemy;

public class StringFunktionenTesten {

    public static void main(String[] args) {

        String str = "";
            for(int i = 0; i < 100; i++){
                str += i;
                System.out.println(str);
            }
            System.out.println("---------------------------");

        StringBuffer str1 = new StringBuffer();
        for(int i = 0; i < 100; i++){
            str1.append(i);
            System.out.println(str1);
        }
    }

}
