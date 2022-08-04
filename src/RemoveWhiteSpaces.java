public class RemoveWhiteSpaces {

    String removeWhiteSpaces(String input){
        StringBuilder output = new StringBuilder();
        
        char[] charArray = input.toCharArray();
        
        for(char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }
        
        return output.toString();
    }

    public static void main(String[] args) {

        RemoveWhiteSpaces removeWhiteSpaces = new RemoveWhiteSpaces();

        String word = "fdkjfkdj kjkjfd ";

        System.out.print("remove whitespaces from `");
        System.out.print(word);
        System.out.print("` to no space `");
        System.out.print(removeWhiteSpaces.removeWhiteSpaces("kjkfd kjfkdj "));
        System.out.println("`");
    }

}