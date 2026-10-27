package br.com.senai.patrimonio.recursividade;

public class InversaoString {
    public static String inverteString(String string){
        if(string == null || string.length() <= 1){
            return string;
        }
        return inverteString(string.substring(1) +
                string.charAt(0));

    }
}
