package array;

public class Q14_arr1IntoArr2 {
    public static void main(String args[]){

                int[] arr1={1,2,3,4};
                int[] arr2= new int[2* arr1.length];
                for(int i=0;i<2;i++)
                {
                    for (int j = 0; j < arr1.length; j++)
                    {
                        arr2[j] = arr1[j];
                        arr2[j+(arr1.length)]=arr1[j];
                        System.out.print(arr2[j] + "  ");
                    }
                }
            }
        }
