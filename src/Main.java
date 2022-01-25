import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        String s = readString();
//        System.out.println(task1(s));
//        System.out.println(task2(s));
//        System.out.println(task3(s));
//        System.out.println(task4(s));
//        String s5;
//        System.out.println(s5 = task5(s));
//        System.out.println(task6(s5));
//        System.out.println(task7(s));
        task8(s);
    }



    private String readString() {
        return new Scanner(System.in).nextLine();
    }

    //    private String task1(String s) {
//        char ch = s.charAt(1);
//
//        s.substring(1);
//        s.substring(1, 9);
//        return ""+s.charAt(1)+s.charAt(3)+s.charAt(9);
//
//    }
//
//    private String task2(String s) {
//        char ch = s.charAt(0);
//        s.substring(0);
//        s.substring(0, s.length()-1);
//        return ""+s.charAt(0)+s.charAt(1) + s.charAt(s.length()-1);
//    }
//
//    private String task3(String s) {
//        char ch = s.charAt(s.length()-5);
//        s.substring(s.length()-5);
//        s.substring(s.length()-5, s.length()-1);
//        return ""+s.charAt(s.length()-5)+s.charAt(s.length()-4)+s.charAt(s.length()-3)+s.charAt(s.length()-2)+s.charAt(s.length()-1);
//    }
//
//    private String task4(String s) {
//        char ch = s.charAt(0);
//        s.substring(0);
//        s.substring(0, s.length()-4);
//        String s1 = "";
//      for (int i = 0; i < s.length() - 4; i++) {
//             s1 = s1+s.charAt(i);
//            }
//        return s1;
//    }
//
//    private String task5(String s) {
//        String s1="";
//        char ch = s.charAt(0);
//        for (int i = 0; i <= s.length() - 1; i++) {
//               if (i%2==0){
//                   s1 = s1+s.charAt(i);
//           }}
//        return s1;
//    }
//
//    private int task6(String s) {
//     return s.length();
//
//    }
//
// private String task7(String s) {
//     String s1="";
//     char ch = s.charAt(0);
//     for (int i = s.length()-1; i >=0; i-=2) {
//             s1 = s1+s.charAt(i);
//         }
//     return s1;
//  }
    private void task8(String s) {
        char ch = s.charAt(0);
        s.substring(0);
        s.substring(0, s.length()-1);
        if(s.indexOf("a")==-1) {
            System.out.println("-1");
        }else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    System.out.print("a");
                }
            }
        }

    }
}


/*
Входные данные #1

abrakadabra

Выходные данные #1

rda
ara
abrakad
kadabra
baaar
5
arbadakarba

 */
