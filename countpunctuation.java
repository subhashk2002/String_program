public class countpunctuation {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        String str="my name is subhash mishra ! / , . ? bhaiyapatti,/";
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='!' || str.charAt(i)==','|| str.charAt(i)=='.' ||
             str.charAt(i)=='/' || str.charAt(i)=='?' || str.charAt(i)=='-'  || 
             str.charAt(i)==';'|| str.charAt(i)==':' ){
               count++;
            }
        }
        System.out.println(count);
    }
}
