/**
 *
 * @author Flávio e Daniel
 */

package apagando;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apagando {
    public static void main(String[] args) {
        try{
            BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
            
            String[] acao = s.readLine().split((" "));
            int qtd = Integer.parseInt(acao[0]);
            int apg = Integer.parseInt(acao[1]);
            int exc = 0;
            
            char[] strPremio = s.readLine().toCharArray();
            String maior = "";

            for(int i = 0; i < strPremio.length - 1; i++){
                int a = Character.getNumericValue(strPremio[i]);
                int b = Character.getNumericValue(strPremio[i + 1]); 
                if(b > a){
                    if(maior.length() > 0){
                        maior = maior.substring(0, maior.length() - 1);                        
                    }
                    maior += Integer.toString(b);
                    exc++;
                }
                else{
                    maior += Integer.toString(a);
                }
                if (apg == exc)
                    break;
            }

            System.out.println(maior);
        }
        catch(IOException | NumberFormatException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }    
}
