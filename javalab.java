import java.util.ArrayList;
import java.util.List;

public class javalab{
    public static int parseAndSum(List<String> numbers) {
        List<Integer> intlist = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            intlist.add(Integer.parseInt(numbers.get(i)));
        }
        int sum = 0;
        for (int i = 0; i < intlist.size(); i++) {
            sum =sum+ intlist.get(i);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("300");
        numbers.add("30");
        numbers.add("39");
        System.out.println("Sum: " + parseAndSum(numbers));
    }
}