public class print_odd_number_SOUT {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            if((i+2)%2!=0){
                continue;
            }
        else{
                System.out.print(i+" ");
            }
        }
    }
}
