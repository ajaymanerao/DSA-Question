package Array;
class SplitArray{
public static void spitArray(int arr[]){
    int sum=0;
for(int i=0;i<arr.length;i++){
sum +=arr[i];
}


int avg=sum/2;
int sum2=0;
int a=0;
for(int i=0;i<arr.length;i++){
if(sum2<avg){
System.out.print(arr[i]);
sum2+=arr[i];
a=i;
}
}
System.out.println();

for(int i=a+1;i<arr.length;i++){
    System.out.print(arr[i]);
}
}

public static void main(String[] args) {
   int arr[]={1,2,3,4,5,5}; 
   spitArray(arr);
}
    
}