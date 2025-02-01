import java.util.Scanner;
public class luckydirection {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        if(s.equals("N")){
            System.out.println("S");
        }
        else if(s.equals("S")){
            System.out.println("N");
        }
        else if(s.equals("W")){
            System.out.println("E");
        }
        else if(s.equals("E")){
            System.out.println("W");
        }
        else if(s.equals("SW")){
            System.out.println("NE");
        }
        else if(s.equals("NE")){
            System.out.println("SW");
        }
        else if(s.equals("NW")){
            System.out.println("SE" );
        }
        else if(s.equals("SE")){
            System.out.println("NW");
        }
    }
}
