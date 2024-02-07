package persistence;

//Write a program to find max sum of any two numbers from given array
  //      int[] iArr = {34,12,32,41,54,12,63,78,32,15

public class SumMax {
    public static void main(String[] args) {

        int[] iArr = {34,12,32,41,54,12,63,78,32,15};
        int max=0;
        for(int i=0;i<iArr.length;i++){
            for(int j=i+1;j<iArr.length;j++){
                int sum = iArr[i]+iArr[j];
                if(sum>max){
                    max=sum;
                }
            }

        }
        System.out.println(max);
    }

}
