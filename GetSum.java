import java.util.*;
class GetSum
{
    public static void sumElement(int arr[], int n) //Use return type void as int for GFG
    {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            
        }
        //return sum;   ***use return to run on GFG ***
	System.out.print(sum); //remove this statement  for  GFG 
    }


public static void main(String args[]){
	int arr[]={2,4,6,8};
	sumElement(arr,arr.length);
	}

}