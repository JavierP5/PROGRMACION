/**
 * Este código te devuelve los multiplos de 7 menores de 100
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class Multiplos {
    public static void main(String[] args){
        for (int i=0;i<100;){
            i = i+7;
            if (i<100){
                System.out.println(i);
            }
        }
    }
}