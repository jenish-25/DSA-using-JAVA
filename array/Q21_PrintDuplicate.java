package array;
public class Q21_PrintDuplicate {
    public static void main(String args[]){
//        int arr1[]={1,2,3,4,5,6,5,5};
        int arr1[]={2,1,2,5,3,2,3};


        System.out.println("this all are duplicates");
       for(int i=0;i< arr1.length;i++){
           for(int j=i+1;j< arr1.length;j++){
               if(arr1[i]==arr1[j] && i!=j){
                   System.out.print(arr1[i] + " ");
//                   return;
               }
           }
       }
    }
}
