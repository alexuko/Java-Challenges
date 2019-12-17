package course.javaprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // System.out.println("hello world");
        String name_one = "listen";
        String name_two = "silent";

        System.out.println(are_anagrams(name_one,name_two));

    }

        public static boolean are_anagrams(String one, String two){
        if(one.length() != two.length()) return false;

        char[] word = one.toCharArray();

        for (int i = 0; i <= word.length -1; i++){
            if(two.contains(word[i]+"")){

            }else {
                return false;
            }


        }
        return true;
    };
}
