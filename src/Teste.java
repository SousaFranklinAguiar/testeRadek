import java.util.*;

public class Teste {

    public static void main(String[] args) {
        //questao10();
        Set<String> lista = new HashSet<>();
        lista.add("a");
        lista.add("b");
        Iterator<String> it = lista.iterator();
        int i = 0;
        //ConcatERemove("arz", "arz", 8);

    }

    public static void ConcatERemove(String s, String t, int k) {
        System.out.println(s);
        System.out.println(t);

        String a = s;
        String b = t;
        String aux = b;
        int contador = 0;

        int c = 0;

        if (a.length() >= b.length()) {
            c = a.length() - b.length();
            contador += c;
            while (true) {
                if (a.length() == b.length()) {
                    break;
                } else {
                    a = a.substring(0, a.length() - 1);
                }
            }
            while (true) {
                if (a.equals(b)) {
                    break;
                }
                a = a.substring(0, a.length() - 1);
                b = b.substring(0, b.length() - 1);

                contador++;

            }
            c = aux.length() - a.length();
            contador += c;
            System.out.println("Quantidade de operações necessárias: "+contador);
            System.out.println("Quantidade de operações solicitadas: "+k);
        } else {

            while (true) {
                if (a.length() == b.length()) {
                    break;
                } else {
                    b = b.substring(0, b.length() - 1);
                }
            }
            for (int i = 0; i < b.length(); ) {
                if (a.equals(b)) {
                    break;
                }
                a = a.substring(0, a.length() - 1);
                b = b.substring(0, b.length() - 1);

                contador++;
            }
            c = aux.length() - a.length();
            contador += c;
            System.out.println("Quantidade de operações necessárias: "+contador);
            System.out.println("Quantidade de operações solicitadas: "+k);
        }
        if (contador > k) {
            System.out.println("não");
        } else {
            System.out.println("sim");
        }
    }

    //QUESTÃO 6
    public static void questao6() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0) {
                if ((i % 5) == 0) {
                    System.out.println("FooBaa");
                }
                System.out.println("Foo");
            } else if ((i % 5) == 0) {
                if ((i % 3) == 0) {
                    System.out.println("FooBaa");
                }
                System.out.println("Baa");
            } else {
                System.out.println(i);
            }
        }
    }

    //QUESTÃO 10
    public static void questao10(){
        ConcatERemove("arepo", "arzozoe", 8);
    }

}



