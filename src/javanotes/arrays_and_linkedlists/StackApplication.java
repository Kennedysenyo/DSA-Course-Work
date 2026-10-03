package javanotes.arrays_and_linkedlists;

public class StackApplication {
    public static void main(String[] args) {
        String str = "()}[]";
        Stack stack = new Stack();
        for(int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case '(':
                    stack.push(str.charAt(i));
                    continue;
                case ')':
                    stack.pop();
                    continue;
                case '{':
                    stack.push(str.charAt(i));
                    continue;
                case '}':
                    stack.pop();
                    continue;
                case '[':
                    stack.push(str.charAt(i));
                    continue;
                case ']':
                    stack.pop();
                    continue;
                default:
                    throw new IllegalArgumentException("Unexpected string");
            }
        }
        System.out.println(stack);
        System.out.println(stack.isEmpty() ? "Balanced" : "Not balanced");
        stack.push('r');
        stack.push('s');
        stack.push('t');
        stack.push('u');
        System.out.println(stack.toString());
    }


}
