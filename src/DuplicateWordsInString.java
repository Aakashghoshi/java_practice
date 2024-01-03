public class DuplicateWordsInString {
    public static void main(String[] args) {
        String str = "Java is java again JAva";
        String[] words = str.toLowerCase().split("\\W+");

        int i,count=0,j=0;
        for(String st:words) {
           for(i=count;i<words.length;i++){
               if(st.equals(words[i])){
                //  System.out.println(words[i]);
                   j++;
               }
               count++;
            }
        }
        System.out.println(j);
        System.out.println(count);

    }
}
