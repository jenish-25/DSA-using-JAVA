package leetcode;

public class L1534_countGoodTriplets {
    public static void main(String[] args) {
          int[] arr = {3,0,1,1,9,7};
          int a = 7, b = 2, c = 3;
          int count=0;
          int n= arr.length;
          for(int i=0;i<n;i++){
              for(int j=i+1;j<n;j++){
                  if(Math.abs(arr[i] - arr[j]) > a){
                      continue;
                  }
                  for(int k=j+1;k<n;k++){
                      if(Math.abs(arr[j]-arr[k]) > b || Math.abs(arr[k]-arr[i]) > c){
                          continue;
                      }
                      else{
                          count++;
                      }
                  }
              }
          }
        System.out.println(count);
    }
}
