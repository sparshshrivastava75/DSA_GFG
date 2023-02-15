public class KthSmallestEle  
{  
  

public void sortArr(int arr[])  // method for sorting the array arr  
{  
int size = arr.length;  
for(int i = 0; i < size; i++)  
{  
int temp = i;  
for(int j = i + 1; j < size; j++)  
{  
if(arr[temp] > arr[j])  
{  
temp = j;  
}    
}  
  
  
if(temp != i)  
{  
int t = arr[i];  
arr[i] = arr[temp];  
arr[temp] = t;   
}  
}  
}  
  
public int findKthSmallest(int arr[], int k)       // find the kth smallest element of the array  
{  
sortArr(arr);  
  
// as an array is always a zero indexing  
// therefore, the kth smallest element lies  
// at the k - 1 index  
return arr[k - 1];  
}  
   
public static void main(String argvs[])    // main method/Drivers code
{    
// creating an object of the class KthSmallestEle  
KthSmallestEle obj = new KthSmallestEle();  
int arr[] = {56, 34, 7, 9, 0, 48, 41, 8};  
int size = arr.length;  
int k = 3;  
System.out.println("For the array: ");  
for(int i = 0; i < size; i++)  
{  
System.out.print(arr[i] + " ");  
}  
  
int ele = obj.findKthSmallest(arr, k);  
  
System.out.println();  
System.out.println("The " + k + "rd smallest element of the array is: " + ele);  
  
System.out.println("\n");  

  
}  
}  