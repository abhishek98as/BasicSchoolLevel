package School_Level;

public class Print_repeating_number {
    public static void main(String[] args) {

        int n=10;
        for(int i=n-1; i>=0 ;i--) {
            for (int j =n-i; j >=0; j--) {
                for (int k=n-j; k>=0 ;k--) {
                    System.out.print(j);
                }
                System.out.println("$");
            }
        }
    }
}
