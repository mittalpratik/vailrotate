package org.example;

public class VailRotate {

    // Solution 1
     public void rotateLeftOne(int[] nums, int k) {
         // Handle the case for negative positions shift
         if(k<0){
             System.out.println("Negative positions shifting is invalid");
             return;
         }
         // Mod function to make sure position shifts greater than array length is handled
         k = k%nums.length;
         // Create new array numsRotated to store the shifted positioned elements
         int[] numsRotated = new int[nums.length];
         for(int i=0;i<nums.length;i++){
             // each iteration fills the new array numsRotated, starting from index i
             // each i-th element of numsRotated is equal to the ((k+i)%nums.length)-th of nums
             // Time complexity: O(n)
             numsRotated[i] = nums[(k+i)%nums.length];
         }
         // Using function arraycopy to iteratively copy each element from numsRotated(src) to nums(dest)
         // Time complexity is O(n)
         System.arraycopy(numsRotated, 0, nums, 0, nums.length);
     }

    // Solution 2 with optimized time and space complexity
    public void rotateLeftTwo(int[] a, int k){
        // Handle the case for negative positions shift
        if(k<0){
            System.out.println("Negative positions shifting is invalid");
            return;
        }
        // Mod function to make sure position shifts greater than array length is handled
        k=k%a.length;
        // Time complexity = O((a.length-1)/2)
        reflectMid(a, 0,a.length-1);
        // Time complexity = O((a.length-1-k)/2)
        reflectMid(a, 0, a.length-1-k);
        // Time complexity = O((k-1)/2)
        reflectMid(a, a.length-k, a.length-1);
        // Overall time complexity = O(n), since every other factor is a constant and a.length is max among all
    }

    public void reflectMid(int[] num, int start, int end){
        // Using two pointers start and end to move towards each other to swap elements
        // Stop the loop when start equals the end or they cross each other
        // Time complexity O((end-start)/2); max end-start = num.length-1
        while(start<end){
            swap(num, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] num, int a, int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}
