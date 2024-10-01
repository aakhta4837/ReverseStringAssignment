public class App {
    public static void main(String[] args) throws Exception {
        String input = "Hello";
        String rString = "";

        for(int i = 0; i < input.length(); i++){
            rString = input.charAt(i) + rString;
        }

        System.out.println("Reverse of the string is " + rString);

    }
}
