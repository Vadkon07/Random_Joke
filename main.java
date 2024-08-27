import java.util.Random;

public class RandomFunnyText {
    public static void main(String[] args) {
        String[] funnyTexts = {
            "Why don’t scientists trust atoms? Because they make up everything!",
            "I told my computer I needed a break, and now it won’t stop sending me Kit-Kats.",
            "Parallel lines have so much in common. It’s a shame they’ll never meet.",
            "Why did the scarecrow win an award? Because he was outstanding in his field!",
            "I would tell you a chemistry joke, but I know I wouldn’t get a reaction.",
            "Why don’t programmers like nature? It has too many bugs.",
            "Why do cows have hooves instead of feet? Because they lactose.",
            "I told my wife she was drawing her eyebrows too high. She looked surprised.",
            "Why don’t skeletons fight each other? They don’t have the guts.",
            "I’m reading a book on anti-gravity. It’s impossible to put down!",
            "Did you hear about the mathematician who’s afraid of negative numbers? He’ll stop at nothing to avoid them.",
            "Why did the bicycle fall over? Because it was two-tired.",
            "I told my dog a joke about a tree. It was a bark.",
            "Why did the coffee file a police report? It got mugged.",
            "I used to play piano by ear, but now I use my hands.",
            "Why did the tomato turn red? Because it saw the salad dressing.",
            "I’m on a seafood diet. I see food and I eat it.",
            "Why don’t some couples go to the gym? Because some relationships don’t work out.",
            "I would avoid the sushi if I was you. It’s a little fishy.",
            "Why did the golfer bring two pairs of pants? In case he got a hole in one."
        };

        Random random = new Random();
        int randomIndex = random.nextInt(funnyTexts.length);
        System.out.println(funnyTexts[randomIndex]);
    }
}

