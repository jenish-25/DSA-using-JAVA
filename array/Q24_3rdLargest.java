package array;

public class Q24_3rdLargest {
        public static void main(String args[]){
            int arr[]={12,3,5,7,23,10};
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            int max3=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max1){
                    int temp=arr[i];
//                    arr[i]=max3;
                    max3=max2;
                    max2=max1;
                    max1=temp;
                }
                else if(arr[i]>max2){
                    max3=max2;
                    max2=arr[i];
                }
                else if(arr[i]>max3){
                    max3=arr[i];
                }

            }
            System.out.println(max1);
            System.out.println(max2);
            System.out.println(max3);
        }
    }

