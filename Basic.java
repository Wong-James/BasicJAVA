import java.util.Arrays;
import java.util.ArrayList;

public class Basic{
    public void print255() {
      for(int i = 1; i <= 255; i++){
        System.out.println(i);
      }
    }
    public void printOdds(){
      for(int i = 1; i<= 255; i++){
        if(i%2 == 0){
          System.out.println(i);
        }
      }
    }
    public int sumNums(){
      int sum = 0;
      for(int i = 1; i <= 255; i++){
        sum = sum + i;
      }
      return sum;
    }

    int[] myArray = {1,3,5,7,9,13};
    public void iterateArray() {
      for(int i = 0; i < myArray.length ; i++){
        System.out.println(myArray[i]);
      }
    }

    public void largestNum() {
      int largest = 0;
      for(int i = 1; i <myArray.length; i++){
        if(myArray[i] > myArray[i-1]){
          largest = myArray[i];
        }
      }System.out.println(largest);
    }

    ArrayList<Integer> newArray = new ArrayList<Integer>();
    public void oddNums() {
      for(int i = 1; i <= 255; i++){
        if(i%2 == 1){
          newArray.add(i);
        }
      }System.out.println(newArray);
    }
    
    public double averageNum() {
      double summedNums = 0;
      for(int i = 0; i < myArray.length; i++){
        summedNums = summedNums + myArray[i];
      }
      double average = summedNums/myArray.length;
      return average;
    }

  }
