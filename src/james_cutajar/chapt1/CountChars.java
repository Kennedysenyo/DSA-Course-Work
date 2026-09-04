package james_cutajar.chapt1;

public class CountChars {

    public int countChars(String str, char character) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountChars countChars = new CountChars();
        String str = "Sally sells sea shells on the seashore";
        char character = 'a';
        System.out.println(character +  " occurred in " + "\"" + str + "\" " + countChars.countChars(str, character) + " times");
    }
}
