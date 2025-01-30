/*import java.util.*;
public class comparingstring{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String a= hariom.next();
        String b= hariom.next();
       // HashSet<Character>seta=new HashSet<>();
      //  HashSet<Character>setb=new HashSet<>();
       /*  for(int i=0;i<a.length();i++){
            seta.add(a.charAt(i));
        }*/
       /* for(int i=0;i<b.length();i++){
            setb.add(b.charAt(i));
        }*/
       /* Character arra[]= seta.toArray(Character[]::new);*/
       // Character arrb[]= setb.toArray(Character[]::new);
       /* int indexa=0;
        for(int i=0;i<a.length();i++){
            char cha=a.charAt(i);
            if(!seta.contains(cha)){
                arra[indexa]=cha;
                indexa++;
            }
        }
        int indexb=0;
        for(int i=0;i<b.length();i++){
            char chb=b.charAt(i);
            if(!setb.contains(chb)){
                arrb[indexb]=chb;
                indexb++;
            }
        } 
       Character[] arra=new Character[a.length()];
       Character[] arrb=new Character[b.length()];
       for(int i=0;i<a.length();i++){
        arra[i]=a.charAt(i);
       }
       for(int i=0;i<b.length();i++){
        arrb[i]=b.charAt(i);
       }
       
        if(arra.length!=arrb.length){
            System.out.println("NO");
        }
        else{
            for(int i=0;i<arra.length-1;i++){
                char temp=arra[i];
                arra[i]=arra[i+1];
                arra[i+1]=temp;
                i++;
            }
            boolean isequal=true;
            for(int i=0;i<arra.length;i++){
                if(!arra[i].equals(arrb[i])){
                    isequal=false;
                    break;
                }
            }
            if(isequal){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
import java.util.*;
public class comparingstring{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String a= hariom.next();
        String b= hariom.next();
        HashSet<Character> seta = new HashSet<>();
        HashSet<Character> setb = new HashSet<>();
        for(int i=0;i<a.length();i++){
            seta.add(a.charAt(i));
        }
        for(int i=0;i<b.length();i++){
            setb.add(b.charAt(i));
        }
        Character [] arra= seta.toArray(Character[]::new);
        Character [] arrb= setb.toArray(Character[]::new);
        Arrays.sort(arra);
        Arrays.sort(arrb);
        
        if(arra.length!=arrb.length){
            System.out.println("NO");
        }
        else{
            boolean result=true;
            for(int i=0;i<arra.length;i++){
                if(!arra[i].equals(arrb[i])){
                result=false;
                break;
                }
            }
            if(result){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}*/
import java.util.*;

public class comparingstring {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String a = hariom.next();
        String b = hariom.next();
        if (a.length() != b.length()) {
            System.out.println("NO");
            return;
        }
        List<Integer> diffIndices = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffIndices.add(i);
            }
        }
        if (diffIndices.size() == 2) {
            int i = diffIndices.get(0);
            int j = diffIndices.get(1);
            if (a.charAt(i) == b.charAt(j) && a.charAt(j) == b.charAt(i)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

