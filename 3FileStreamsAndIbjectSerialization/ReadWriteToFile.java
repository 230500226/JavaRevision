public class HelloFile {

    /**
     * Main entry point for the program.
     */
    public static void start() {
        // Create a File object representing "HelloWorld.txt"
        java.io.File file = new java.io.File("HelloWorld.txt");

        // Check if the file already exists
        if (file.exists()) {
            System.out.println("File already exists");
        } else {
            try {
                // Create a PrintWriter to write to the file
                java.io.PrintWriter output = new java.io.PrintWriter(file);

                // Prompt the user for a message
                System.out.println("Enter a message to write to the file");

                // Read the user's input
                java.util.Scanner input = new java.util.Scanner(System.in);
                String message = input.nextLine();

                // Write the message to the file
                output.println(message);

                // Close the PrintWriter to release resources
                output.close();

                // Read the entire contents of the file and print it
                java.util.Scanner read = new java.util.Scanner(file);
                while (read.hasNext()) {
                    System.out.println(read.nextLine());
                }
            } catch (java.io.FileNotFoundException ex) {
                System.out.println("File not found");
            }
        }
    }
}