package com.harshit.binary_search.binary;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ceiling_of_number {
    static void main(String[] args) {
//  ceiling of a number means finding a number which is greater or  equals to a given number remember if the number is greater than the given number then it must be smallest greater number
// floor of a number is the opposite of the ceiling of the number


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the target number");
        int item = input.nextInt();
        int[] arr = { 10,20,30,40,50,60};
           int ans = ceiling(arr , item);
           int ans2 = floor(arr, item);

        if( ans2 == - 1 ) {
            System.out.println("target is smaller than the smallest number in the array..so no floor found");

        }
        else
        {
               System.out.println("floor of the target is "+ arr[ans2] );

        }
        if( ans == - 1 ) {
            System.out.println("target is greater than the greatest number in the array..so no ceiling number found");

        }
        else
        {
               System.out.println("floor of the target is "+ arr[ans] );

        }






    }

    static int ceiling(int[] arr , int target)
    {
        if(target> arr[arr.length-1])
        {
            return  -1 ;
        }
int start = 0;
int end = arr.length-1;

while(start<=end) {
    int mid = start + (end-start)/2 ;
    if(arr[mid]< target)
    {
        start = mid + 1 ;
    }
    else if ( arr[mid] > target) {
        end = mid - 1 ;
    }

    else {
        return mid  ;
    }

}


// so if the target is found in the array then it had been returned by the while loop , but if the target is not found in the array then we have to return the smallest greater number than the target
 // as it is a case of failure of loop means , before the final pass there is scenerio like start=end=mid then start > end and end = mid now we want the smallest greater number than the target ..then it will be given by 'start' or 'mid + 1 '

return start ;

    }


    static int floor(int[] arr , int target)
    {
        // but what if our target is smaller than the smallest number in the array..
        if(target< arr[0]) {
            return -1 ;
        }
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int mid = start + (end-start)/2 ;
            if(arr[mid]< target)
            {
                start = mid + 1 ;
            }
            else if ( arr[mid] > target) {
                end = mid - 1 ;
            }

            else {
                return mid  ;
            }

        }


// so if the target is found in the array then it had been returned by the while loop , but if the target is not found in the array then we have to return the smallest greater number than the target
        // as it is a case of failure of loop means , before the final pass there is scenerio like start=end=mid then start > end and end = mid now we want the smallest greater number than the target ..then it will be given by 'start' or 'mid + 1 '

        return end ;

    }





}
