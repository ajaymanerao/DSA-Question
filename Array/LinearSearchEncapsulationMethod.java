package Array;
class Search{
    private int arr[];
    private int key;

    Search(int arr[],int key){
        this.arr=arr;
        this.key=key;
    }

    int Show(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                 return i;

            }    
        }
        return -1;
    }    
}

public class LinearSearchEncapsulationMethod {
    public static void main(String[] args) {
         int arr[]={2,4,5,6,7,8,9,10,11,12};
        int key=10;
        Search s=new Search(arr, key);
        int index=s.Show();
        if(index== -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key index is: "+index);
        }   
    }  
}
