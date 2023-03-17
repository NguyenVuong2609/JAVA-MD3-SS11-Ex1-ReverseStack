package Rikkei.academy;

import java.util.Arrays;

public class ReverseService {
    public static void main(String[] args) {
        MyStack<Integer> test = new MyStack<>(5);
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        System.out.println("Mảng ban đầu -->" + test);
        System.out.println("Sau khi reverse -->" + Arrays.toString(test.reverseStack()));
        MyStack<String> testString = new MyStack<>(5);
        testString.push("Yen");
        testString.push("Chuan");
        testString.push("Vuong");
        testString.push("Van");
        testString.push("Thu");
        System.out.println("Mảng ban đầu -->" + testString);
        System.out.println("Sau khi reverse -->" + Arrays.toString(testString.reverseStack()));
    }
}
