package School_Level;

import java.util.Scanner;

public class Regrex_Code_Email_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

            int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            char[] num2={'@',' ','#',',','*','$','6','-','+','=','`','~','_','(',')','}','[',']','{','?','<','>','/',':',';','|'};


            for(int j=0;j<num2.length; j++){
                char check_char=num2[j];

            int check_num = 0;
            char check_char1=str.charAt(0);


            for (int i = 0; i < num.length; i++)
            {
                    check_num = num[i];
                if (str.equals(String.valueOf(check_num)))
                {
                    System.out.println("Email is not valid");
                }
                break;
            }

                    if(check_char1==(check_char)) {
                        System.out.println("Email is not valid");
                    }
                    break;
        }

        }



    }

