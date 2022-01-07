public class ServerNameGenerator {

    /* SERVER NAME GENERATOR */
    public static String randomElement(){
        String [] adjectives = {"brave", "cheeky", "lucky", "macho", "energetic", "fierce", "thankful", "grateful", "lethal", "pleasant"};
        String [] nouns = {"developer", "engineer", "restaurant", "intern", "infantryman", "coach", "teacher", "cop", "firefighter", "healthcare" +
                " " +
                "provider"};
//        MATH RANDOM: Math.floor(Math.random() * (max-min+1)+min);
        int rand = (int)(Math.floor(Math.random() * 10) + 1);
        String randAdj = adjectives[rand-1];
        String randNoun = nouns[rand-1];
        System.out.printf("Here is your server name:%n%s-%s", randAdj, randNoun);
        return adjectives[rand-1];
    }

    public static void main(String[] args) {

        randomElement();
    }
}
