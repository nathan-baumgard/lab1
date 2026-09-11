//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Nathan Baumgard
 */

public class Main {
  public static void main(String[] args) {

    // Initialize the array
    int[] values = {5, 9, 3, 12, 7, 3, 11, 5};
    int i = 0;

    // Output array in order using a while loop
    while (i < values.length) {
      System.out.println(values[i]);
      i++;
    }

    // Output array in reverse order using a for loop
    for (i = values.length - 1; i >= 0; i--) {
      System.out.println(values[i]);
    }

    // Output the first and last elements of the array
    System.out.println(values[0]);
    System.out.println(values[values.length - 1]);

    // Create an instance of Lab1 and call the methods - the instructions specified "output" for previous steps, so I did not print the results of these method calls
    Lab1 lab = new Lab1();
    lab.max(5, 10);
    lab.min(5, 10);
    lab.sum(values);
    lab.average(values);
    lab.max(values);
    lab.min(values);
    
  }
}     

// Add all of the methods here
class Lab1 {

  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public int sum(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }

  public double average(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return (double) sum / nums.length;
  }

  public int max(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  public int min(int[] nums) {
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }
} 