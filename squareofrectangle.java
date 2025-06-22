import java.util.*;
public class squareofrectangle{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int l1=hariom.nextInt();
            int b1=hariom.nextInt();
            int l2=hariom.nextInt();
            int b2=hariom.nextInt();
            int l3=hariom.nextInt();
            int b3=hariom.nextInt();
            long area= (long)l1*b1 + (long)l2*b2 + (long)l3*b3;
            int S = (int)Math.sqrt(area);
            boolean ok=false;
            if((long)S*S==area){
                int l[]={l1,l2,l3};
                int b[]={b1,b2,b3};
                for(int i=0;i<3&&!ok;i++){
                    for(int j=0;j<3&&!ok;j++){
                        if(j==i) continue;
                        for(int k=0;k<3&&!ok;k++){
                            if(k==i||k==j) continue;
                            int la=l[i], ba=b[i];
                            int lb=l[j], bb=b[j];
                            int lc=l[k], bc=b[k];
                            if(ba==bb&&bb==bc&&ba==S&&la+lb+lc==S){
                                ok=true;
                            }
                            else if(la==lb && lb==lc && la==S && ba+bb+bc==S){
                                ok=true;
                            }
                            else if(la==S && ba<S){
                                int h=S-ba;
                                if (bb == h && bc== h && lb + lc == S) {
                                    ok = true;
                                }
                            }
                             else if (ba == S && la < S) {
                                int w = S - la;
                                if (lb == w && lc == w && bb+ bc == S) {
                                    ok = true;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(ok ? "YES":"NO");
        }
    }
}