import java.util.*;

class RadixSort
{
    int arr1[];
    int arr2[];
    int arr[3];
    RadixSort(int length)
    {
        arr1 = new int[length+1];
        arr2 = new int[length+1];
        arr3 = new int[length+1];
    }
    sort()
    
}

class Radix
{
    public static void main(String args[])
    {
        int arr[]= {1, 2, 3, 1, 2, 3, 8, 9, 7, 1};
        RadixSort rad = new RadixSort(arr.length);
        rad.sort(arr, arr.length);
    }
}