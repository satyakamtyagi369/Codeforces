import java.util.*;
public class antonandletters{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String input = hariom.nextLine();
        input = input.substring(1, input.length() -1).trim();
        Set<Character> set = new HashSet<>();
        if(!input.isEmpty()){
            String[] letters = input.split(", ");
            for(int i=0;i<letters.length;i++){
                set.add(letters[i].charAt(0));
            }
        }
        System.out.print(set.size());
    }
}