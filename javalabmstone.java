import java.util.ArrayList;
import java.util.List;

public class javalabmstone {
    public static int parseAndSum(List<String> numbers) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            intList.add(Integer.parseInt(numbers.get(i)));
        }
        int sum = 0;
        for (int i = 0; i < intList.size(); i++) {
            sum += intList.get(i);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("10");
        numbers.add("20");
        numbers.add("30");
        System.out.println("Sum: " + parseAndSum(numbers));
    }
}