import java.util.*;
public class abovetheclouds {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n=hariom.nextInt();
            String s= hariom.next();
            int peechecount[]=new int[26];
            for(int i=0;i<n;i++){
                peechecount[s.charAt(i)-'a']++;
            }
            int aagecount[] = new int[26];
            boolean ok = false;
            for(int k=0;k<n;k++){
                int c=s.charAt(k)-'a';
                peechecount[c]--;
                if(k>=1&&k<=n-2){
                    if(peechecount[c]>0||aagecount[c]>0){
                        ok=true;
                        break;
                    }
                }
                peechecount[c]++;
            }
            System.out.println(ok ? "Yes":"No");
        }
    }
}
