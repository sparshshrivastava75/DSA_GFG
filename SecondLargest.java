

//User function Template for Java

class SecondLargest {
    void print2largest(int arr[], int n) {
        // code here
        int max = -1;
        int secondMax = -1;
        
        for(int a : arr){
            if(a > max){
                secondMax = max;
                max = a;
            }
            else if(a > secondMax && a < max){
                secondMax = a;
            }
        }
        //return secondMax;
	System.out.print(secondMax);
        
    }


public static void main(String args[]){
	SecondLargest ob = new SecondLargest();
	int arr[]={1,2,3,4,5,6};
	ob.print2largest(arr,6);
}
}