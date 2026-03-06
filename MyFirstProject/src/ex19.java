//arrays class 메소드

import java.util.Arrays;

public class ex19 {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};
        Arrays.sort(arr); // 오름차순 정렬
        System.out.println(Arrays.toString(arr));

        int[][] arr2D = {{11,12},{21,22}};

        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.deepEquals(str2D,str2D2));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(arr3));
    }
}
 