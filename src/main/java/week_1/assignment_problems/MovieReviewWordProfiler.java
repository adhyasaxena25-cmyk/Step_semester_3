public class MovieReviewWordProfiler {

    static void classifyWordLengths(String review) {

        String[] words = review.trim().split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {

            int wordLength = word.length();

            if (wordLength >= 1 && wordLength <= 4) {
                shortWords++;
            } else if (wordLength <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short: " + shortWords);
        System.out.println("Medium: " + mediumWords);
        System.out.println("Long: " + longWords);
    }

    public static void main(String[] args) {

        String review =
                "This movie was absolutely fantastic and thrilling";

        classifyWordLengths(review);
    }
}
