class valueEqualIndex {
	public static void main(String args[]){
    ArrayList<Integer> valueEqualIndex(int arr[], int n) {
        ArrayList<Integer> list  = new ArrayList<>();
        
       
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
               list.add(arr[i]);
               
                
            }
            
        }
        return list;
    }
}
}

