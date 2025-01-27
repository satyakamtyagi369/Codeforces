import java.util.Scanner;
public class kstring {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int k= hariom.nextInt();
        String s= hariom.next();
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder basestring = new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]%k!=0){
                System.out.println("-1");
                return;
            }
            for(int j=0;j<freq[i]/k;j++){
                basestring.append((char)(i+'a'));
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<k;i++){
            result.append(basestring);
        }
        System.out.println(result.toString());

    }
}
