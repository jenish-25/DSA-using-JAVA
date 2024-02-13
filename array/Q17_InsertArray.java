package array;

public class Q17_InsertArray {
        private static void print(int[] arr, int p) {
            for(int i=0;i<p;i++){
                System.out.print(arr[i] + " ");
            }
        }
        private static int insert(int[] arr, int p, int value) {
            arr[p]=value;
            p++;
            return p;
        }
        private static void update(int arr[],int p,int oldV,int newV){
            for(int i=0;i<p;i++){
                if(arr[i]==oldV){
                    arr[i]=newV;
                    return;
                }
                }
        }
        private static boolean find(int[] arr, int p, int value) {
            for(int i=0;i<p;i++){
                if(arr[i]==value){
                    return true;
                }
            }
            return false;
        }
        public static void main(String args[]){
            int arr[]=new int[6];
            int p=0;

            p=insert(arr,p,10);
            p=insert(arr,p,20);
            p=insert(arr,p,30);
            p=insert(arr,p,40);
            p=insert(arr,p,50);
            p=insert(arr,p,80);
            print(arr,p);
            System.out.println("\nafter update ");

            update(arr,p,30,300);
            print(arr, p);

            find(arr,p,30);
            System.out.println("\nthe size is ");
            System.out.print(size(p));
            System.out.println("\nafter delete ");
            p=delet(arr,p,40);
            print(arr, p);
            System.out.println("\nnum is available : " + find(arr, p,40));
        }
        private static int delet(int[] arr, int p, int value){
            for(int i=0;i<p;i++){
                if(arr[i]==value){
                    for(int j=i;j<p-1;j++){
                        arr[j]=arr[j+1];
                    }
                    p--;
                    return p;
                }
            }
            return p;
        }
        private static int size(int p) {
            return p;
        }
    }
