package two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
    @link https://leetcode.com/problems/container-with-most-water/description/
 */

public class ContainerWithMostWater {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = Arrays
                    .stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        int left = 0;
        int right = list.length-1;
        int maxArea = 0;

        while (left<right) {
            maxArea = Math.max((right-left)*Math.min(list[right],list[left]), maxArea);

            if(list[left]<list[right]) left++;
            else right--;
        }

        System.out.println(maxArea);

    }
}
