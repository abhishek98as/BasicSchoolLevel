package Strings;

public class count_character_Occurrence_in_given_String {
    public static void main(String[] args) {
        String str=" hello my name is abhishek singh";

        int result=str.length()-str.replaceAll("a","").length();
        System.out.println(result);
    }
}
