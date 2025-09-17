public class StringExercise {
    public static void main(String[] args) {
        
        // Part 1: String Analysis
        // Fill in the blanks to analyze the given string
        
        String movie = "Jurassic Park";
        
        // Get the length of the string
        int length = movie.______();
        System.out.println("Movie length: " + length);
        
        // Get the first character
        char firstChar = movie.______(0);
        System.out.println("First character: " + firstChar);
        
        // Get the last character
        char lastChar = movie.______(length - 1);
        System.out.println("Last character: " + lastChar);
        
        
        // Part 2: String Searching
        // Fill in the blanks to find positions in the string
        
        String phrase = "Java Programming is fun";
        
        // Find the position of the first space
        int firstSpace = phrase.______(" ");
        System.out.println("First space at: " + firstSpace);
        
        // Find the position of "ing"
        int ingPosition = phrase.______("ing");
        System.out.println("'ing' found at: " + ingPosition);
        
        // Check if "Python" exists in the phrase
        int pythonPosition = phrase.______("Python");
        System.out.println("Python position: " + pythonPosition);
        
        
        // Part 3: String Extraction and Modification
        // Fill in the blanks to extract and modify parts of strings
        
        String filename = "report.txt";
        
        // Extract everything before the dot
        int dotPosition = filename.______(".");
        String nameOnly = filename.______(0, dotPosition);
        System.out.println("Filename without extension: " + nameOnly);
        
        // Extract the file extension
        String extension = filename.______(dotPosition + 1);
        System.out.println("File extension: " + extension);
        
        // Replace "txt" with "pdf"
        String newFilename = filename.______("txt", "pdf");
        System.out.println("New filename: " + newFilename);
    }
}
