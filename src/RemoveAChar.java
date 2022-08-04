public class RemoveAChar {

    public static void main(String[] args) {

        String word = "GitHub";

        System.out.print("word to be modified `");
        System.out.print(word);
        System.out.print("` ...");
        System.out.print(" script will remove ");

        String charToBeRemoved = "H";
        String charToReplace = "-";

        System.out.print(charToBeRemoved);
        System.out.print(", to be replaced by ");
        System.out.print(charToReplace);
        System.out.print(", result: `");

        word = word.replace(charToBeRemoved, charToReplace); 

        System.out.print(word); 
        System.out.println("`");

    }

}