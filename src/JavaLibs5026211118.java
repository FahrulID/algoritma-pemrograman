import javax.swing.JOptionPane;

public class JavaLibs5026211118 {
    public static void main(String[] args)
    {
        // Options for intro
        final String[] options = { "Yes", "No" };
        // Intro
        final int introInt = JOptionPane.showOptionDialog(null, "Hi there, Jimmy Fallon personally wants to invite you to his Show. Are you coming ?", "Jimmy Fallon invites you!", 0, 1, null, options, options[0]);
        
        // Check for player's answer
        if (introInt != 0) {
            // If player says no, then exit
            JOptionPane.showMessageDialog(null, "You missed an opportunity. But Jimmy will always welcome you if you decided to change your mind.", "Why???", 0);
            System.exit(0);
        }
        
        // Bunches of dialogs before prompting user with questions
        JOptionPane.showMessageDialog(null, "Welcome to The Tonight Show Starring Jimmy Fallon", "Welcome", 1);
        JOptionPane.showMessageDialog(null, "I’m your lovely host, Jimmy Fallon", "It's me Jimmy Fallon", 1);

        // Prompt for name
        String name = (String)JOptionPane.showInputDialog(null, "Today we have a spectacular guest, please welcome the one and only ____", "Your Name", 2, null, null, "Your Name");

        // Clapping
        JOptionPane.showMessageDialog(null, "*Audiences are clapping for " + name + "*", "Audiences Clapping", 1);

        // Mad Libs Theater
        JOptionPane.showMessageDialog(null, "Today, we are going to play Mad Libs Theatre. Here we go", "The Fun Begins", 1);

        JOptionPane.showMessageDialog(null, "Here’s how it works,\n" + name + ", I’m gonna ask you for some silly words.\nNouns, Verb, Etc.\nAnd after that, we are going to act out a very dramatic Mad Libs scene.", "How To Play", 1);

        // Prompting for inputs

        String detectiveName, robberName, exclamationOne, items, exclamationTwo, bodyPartOne, bodyPartTwo, movie, cameraCatchesYou, country, pet, holiday, famousMovieQuotes, songName, musicTaste, pluralProfession, storeName, measureUnit;
        int number, decade, price;
        double leftThem, length;

        detectiveName = (String)JOptionPane.showInputDialog(null, "Give me a silly word", "A Silly Word", 2, null, null, "");
        robberName = (String)JOptionPane.showInputDialog(null, "Next, Give me a cute pet name", "Cute Pet Name", 2, null, null, "");
        
        exclamationOne = (String)JOptionPane.showInputDialog(null, "What do you say when you stub your toe", "That's must be awful", 2, null, null, "");
        exclamationTwo = (String)JOptionPane.showInputDialog(null, "When a cockroach aproaches you, what do you say", "Eww", 2, null, null, "");
        
        number = Integer.parseInt((String)JOptionPane.showInputDialog(null, "a number", "Number", 2, null, null, ""));
        decade = Integer.parseInt((String)JOptionPane.showInputDialog(null, "a number again", "Number Again", 2, null, null, ""));
        price = Integer.parseInt((String)JOptionPane.showInputDialog(null, "again, for charm", "Number Once Again", 2, null, null, ""));

        movie = (String)JOptionPane.showInputDialog(null, "Favorite movie ?", "Movie", 2, null, null, "");
        cameraCatchesYou = (String)JOptionPane.showInputDialog(null, "a Verb-ing", "Verb-ing", 2, null, null, "");
        storeName = (String)JOptionPane.showInputDialog(null, "a store name", "Store name", 2, null, null, "");
        items = (String)JOptionPane.showInputDialog(null, "a plural items", "Plural Items", 2, null, null, "");

        bodyPartOne = (String)JOptionPane.showInputDialog(null, "a body part", "Body Part", 2, null, null, "");
        bodyPartTwo = (String)JOptionPane.showInputDialog(null, "a body part, again", "Body Part Again", 2, null, null, "");

        country = (String)JOptionPane.showInputDialog(null, "a country you would like to visit", "Country name", 2, null, null, "");
        pet = (String)JOptionPane.showInputDialog(null, "a bizzare animal to be a pet", "Pet", 2, null, null, "");
        famousMovieQuotes = (String)JOptionPane.showInputDialog(null, "give me a Famous Movie Quotes", "Movie Quotes", 2, null, null, "");
        songName = (String)JOptionPane.showInputDialog(null, "give me a child song", "Song Name", 2, null, null, "");
        holiday = (String)JOptionPane.showInputDialog(null, "a holiday", "Holiday", 2, null, null, "");
        pluralProfession = (String)JOptionPane.showInputDialog(null, "Plural Profession", "Plural Profession", 2, null, null, "");

        measureUnit = (String)JOptionPane.showInputDialog(null, "a measurement unit", "Measurement unit", 2, null, null, "");
        musicTaste = (String)JOptionPane.showInputDialog(null, "Adjective", "Adjective", 2, null, null, "");

        leftThem = Double.parseDouble((String)JOptionPane.showInputDialog(null, "give me a number between 0 and 1", "Number between 0 and 1", 2, null, null, ""));
        length = Double.parseDouble((String)JOptionPane.showInputDialog(null, "give me a Real number (e.g 0.5, 3, 7.9, etc)", "Real number", 2, null, null, ""));

        // Starting to act
        final int readyOrNot = JOptionPane.showOptionDialog(null, "Here we go, ready ?", "Are you ready ?", 0, 1, null, options, options[0]);

        // Check for player's answer
        if (readyOrNot != 0) {
            // If player says no, then exit
            JOptionPane.showMessageDialog(null, "Ready or not, you have joined me tonight. So you must act with me.", "Seriously?", 0);
        }
        
        // Startign to act
        JOptionPane.showMessageDialog(null, "Now, it’s time to perform the scene", "Time to Act", 1);

        // Concate all variable

        String story ="";

        story += name + " : *knocking*, \"Hello I’m detective " + detectiveName + " and you are ?\"\n";
        story += "Jimmy : \"Mr " + robberName + "\"\n";
        story += name + " : \"We here today on suspicious 2nd degree robbery\"\n";
        story += "Jimmy : \"" + exclamationOne + "\"\n";
        story += name + " : \"That’s right, " + number + " " + items + " was stolen from " + storeName + ".\"\n";
        story += name + " : \"That’s their entire stock for " + decade + " decade(s).\"\n";
        story += name + " : \"They sell it for $" + price + " , and you only left them with $" + leftThem + ".\"\n";
        story += name + " : \"That is only " + (leftThem * 100.0) + " cents, you are making them lose almost $" + (number * price) + ".\"\n";
        story += "Jimmy : \"Then, why me ? Do you have any evidence?\"\n";
        story += name + " : \"The crime scene has your " + bodyPartOne + " written all over it.\"\n";
        story += "Jimmy : \"" + exclamationTwo + "\"\n";
        story += name + " : \"Where were you on the night of " + holiday + ".\"\n";
        story += "Jimmy : \"We were watching " + movie + ".\"\n";
        story += name + " : \"Are you sure ? Then why the security camera catches you " + cameraCatchesYou + " " + length + " " + measureUnit + " from the crime scene.\"\n";
        story += name + " : \"I’m full with playing games.\"\n";
        story += name + " : \"Where are you from?\"\n";
        story += "Jimmy : \"" + country + ".\"\n";
        story += name + " : \"Yeah, just I suspected.\"\n";
        story += name + " : \"You know one of the best part of being a detective is locking up criminals like you.\"\n";
        story += name + " : \"And walking home to my children and my pet " + pet + ".\"\n";
        story += name + " : \"And says " + famousMovieQuotes + ".\"\n";
        story += "Jimmy : \"Fine I did this, I did the robbery.\"\n";
        story += "Jimmy : \"We did the robbery.\"\n";
        story += name + " : \"Who?\"\n";
        story += "Jimmy : \"we called ourselves the bad " + pluralProfession + ".\"\n";
        story += "Jimmy : \"But I only did it because I need the money, to buy myself a/an " + bodyPartTwo + " implants.\"\n";
        story += name + " : \"I knew it all along, every time I saw a crime I like to sing my favorite song " + songName + ".\"\n";
        story += "Jimmy : \"You have a " + musicTaste + " music taste, I love you.\"\n";
        story += "\n";
        story += "Anddddd Sceneee\n";
        story += "*Audiences are clapping*";

        // Show the story
        JOptionPane.showMessageDialog(null, story, "Scene", 1);

        // End
        JOptionPane.showMessageDialog(null, "That’s all from mad libs theatre, thank you for coming. Goodbye", "See you nex time!", 1);        
    }
}