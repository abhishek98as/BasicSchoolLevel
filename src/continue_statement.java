public class continue_statement {
    public static void main(String[] args) {
        int i;
        for(i=5; i>=1; i--){
            if(i%2==1)
                continue;
            System.out.print(i+" ");
        }
    }
}
