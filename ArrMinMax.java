
public class ArrMinMax {

    public static void min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("minimum is "+min);

}

public static void max(int arr[]){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
System.out.println("maximum is "+max);

}
public static void main(String args[]){
    int arr[]={1000,34,43,78,11,445};
  
    max(arr);
    min(arr);
    
}
}