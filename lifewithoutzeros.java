import java.util.*;
public class lifewithoutzeros {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int a = hariom.nextInt();
        int b = hariom.nextInt();
        int c = a+b;
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listb = new ArrayList<>();
        ArrayList<Integer> listc = new ArrayList<>();
        while(a > 0){
            int digit = a% 10 ;
            if(digit !=0){
                lista.add(digit);
            }
            a = a/10;
        }
        while(b>0){
            int digit = b% 10 ;
            if(digit !=0){
                listb.add(digit);
            }
            b=b/10;
        }
        while(c>0){
            int digit = c%10;
            if(digit !=0){
                listc.add(digit);
            }
            c = c/10;
        }
        int suma=0;
        int sumb=0;
        int sumc=0;
        for(int i=0;i<lista.size();i++){
            suma = suma*10  + lista.get(lista.size()-1-i);
        }
        for(int i=0;i<listb.size();i++){
            sumb = sumb*10 + listb.get(listb.size()-1-i);
        }
        for(int i=0;i<listc.size();i++){
            sumc = sumc*10 + listc.get(listc.size()-1-i);
        }
        if(suma + sumb == sumc){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
