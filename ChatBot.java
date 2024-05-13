import java.util.Scanner;
import java.util.Random;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! How can I assist you today?");
        
        while (true) {
            String userInput = scanner.nextLine();
            String botResponse = getResponse(userInput);
            System.out.println(botResponse);
            
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
        }
        scanner.close();
    }
    
    public static String getResponse(String userInput) {
        String response;
        userInput = userInput.toLowerCase();
        
        if (userInput.contains("hello") || userInput.contains("hi")) {
            response = "Hello there!";
        } else if (userInput.contains("how are you")) {
            response = "I'm just a bot, but I'm functioning properly, thank you!";
        } else if (userInput.contains("weather")) {
            response = "I'm sorry, I don't have access to weather data.";
        } else if (userInput.contains("time")) {
            response = "The current time is: " + getCurrentTime();
        } else if (userInput.contains("joke")) {
            response = getRandomJoke();
        } else if (userInput.contains("who are you")) {
            response = "I'm a simple chatbot programmed in Java.";
        } else if (userInput.contains("tell me about java")) {
            response = "Java is a high-level, object-oriented programming language "
                     + "developed by Sun Microsystems (now owned by Oracle).";
        } else if (userInput.contains("thank you")) {
            response = "You're welcome!";
        } else {
            response = "I'm not sure I understand. Can you please rephrase?";
        }
        return response;
    }
    
    public static String getCurrentTime() {
        // This method can be enhanced to get the actual current time
        return "Sorry, I don't have access to real-time clock.";
    }
    
    public static String getRandomJoke() {
        String[] jokes = {
            "Why don't scientists trust atoms? Because they make up everything!",
            "Parallel lines have so much in common. It’s a shame they’ll never meet.",
            "Why did the scarecrow win an award? Because he was outstanding in his field!",
            "I told my wife she was drawing her eyebrows too high. She looked surprised.",
            "Why did the math book look sad? Because it had too many problems."
        };
        Random rand = new Random();
        int index = rand.nextInt(jokes.length);
        return jokes[index];
    }
}
