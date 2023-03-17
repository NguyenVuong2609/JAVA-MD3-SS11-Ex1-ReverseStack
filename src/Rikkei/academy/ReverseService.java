package Rikkei.academy;

import java.util.Arrays;

public class ReverseService {
    public static void main(String[] args) throws Exception {
       int[] arr = {1,2,3,4,5};
        System.out.println("Mảng ban đầu là --> " + Arrays.toString(arr));
        MyStack<Integer> reverseArr = new MyStack<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            reverseArr.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseArr.pop();
        }
        System.out.println("Sau khi reverse --> " + Arrays.toString(arr));
        String[] stringArr = {"Chuan","Yen","Vuong","Van","Thu"};
        System.out.println("Mảng ban đầu là --> " + Arrays.toString(stringArr));
        MyStack<String> reverseStringArr = new MyStack<>(stringArr.length);
        for (int i = 0; i < stringArr.length; i++) {
            reverseStringArr.push(stringArr[i]);
        }
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = reverseStringArr.pop();
        }
        System.out.println("Sau khi reverse --> " + Arrays.toString(stringArr));
    }
}
