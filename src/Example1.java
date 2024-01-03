import java.util.Arrays;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int trg = 13;


        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                if((num[i]+num[j])==trg){
                    System.out.println(num[i]+" "+num[j]+" ="+trg);
                    break;
                }
            }
        }
    }

}
