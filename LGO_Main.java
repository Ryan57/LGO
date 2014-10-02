/**
 * Created by Ryan on 9/18/2014.
 */
public class LGO_Main {

    private static String[] events;
    private static String[][] olympians;

    public static void main(String[] args) {

        System.out.println(" _        _______  _______ \n" +
                "( \\      (  ____ \\(  ___  )\n" +
                "| (      | (    \\/| (   ) |\n" +
                "| |      | |      | |   | |\n" +
                "| |      | | ____ | |   | |\n" +
                "| |      | | \\_  )| |   | |\n" +
                "| (____/\\| (___) || (___) |\n" +
                "(_______/(_______)(_______)\n" +
                "                           ");

        initArrays();
        if (args.length > 0) {// checks for initial argument
            String arg = args[0];
            if (arg.equals("e") || arg.equals("Events")) {
                showEvents();
            } else if (arg.equals("o") || arg.equals("Olympians")) {
                showOlympians();
            } else  if (arg.equals("h") || arg.equals("Help")){
                showHelp();
            }
        } else {// if no initial argument
            showHelp();
        }
    }//..

    public static void showOlympians(){

        System.out.println(" _______  _              _______  _______ _________ _______  _        _______ \n" +
                "(  ___  )( \\   |\\     /|(       )(  ____ )\\__   __/(  ___  )( (    /|(  ____ \\\n" +
                "| (   ) || (   ( \\   / )| () () || (    )|   ) (   | (   ) ||  \\  ( || (    \\/\n" +
                "| |   | || |    \\ (_) / | || || || (____)|   | |   | (___) ||   \\ | || (_____ \n" +
                "| |   | || |     \\   /  | |(_)| ||  _____)   | |   |  ___  || (\\ \\) |(_____  )\n" +
                "| |   | || |      ) (   | |   | || (         | |   | (   ) || | \\   |      ) |\n" +
                "| (___) || (____/\\| |   | )   ( || )      ___) (___| )   ( || )  \\  |/\\____) |\n" +
                "(_______)(_______/\\_/   |/     \\||/       \\_______/|/     \\||/    )_)\\_______)\n");
        for(int i = 0; i < olympians.length; i++){
            System.out.print((i+1)+". ");
            for(int j = 0; j < 3; j++) {
                System.out.print(olympians[i][j]+" ");
            }
            System.out.println("\n");
        }

    }//...

    public static void showEvents() {
        System.out.println(" _______           _______  _       _________ _______ \n" +
                "(  ____ \\|\\     /|(  ____ \\( (    /|\\__   __/(  ____ \\\n" +
                "| (    \\/| )   ( || (    \\/|  \\  ( |   ) (   | (    \\/\n" +
                "| (__    | |   | || (__    |   \\ | |   | |   | (_____ \n" +
                "|  __)   ( (   ) )|  __)   | (\\ \\) |   | |   (_____  )\n" +
                "| (       \\ \\_/ / | (      | | \\   |   | |         ) |\n" +
                "| (____/\\  \\   /  | (____/\\| )  \\  |   | |   /\\____) |\n" +
                "(_______/   \\_/   (_______/|/    )_)   )_(   \\_______)\n" +
                "                                                      ");
        for(int i =0; i < events.length; i++){
            System.out.println(events[i]+"\n");
        }
    }//..

    public static void showHelp(){

        System.out.println("******** LGO HELP ******\n*");
        System.out.println("* Arguments  -- argument details");
        System.out.println("* events e --list day\'s events.");
        System.out.println("* olympians o --list day\'s olympians.");
        System.out.println("* help h --display this help message");
        System.out.println("*\n*************************************");

    }//..

    public static void initArrays(){

        events = new String[]{"Washoos","CanJam","Horseshoes",
                "Cornhole","Ladderball","Stickgame"};

        olympians = new String[][]{
                {"Sally","F","25"},
                {"Tom","M","19"},
                {"Ryan","M","45"},
                {"","",""},
                {"","",""},
                {"","",""},
                {"","",""},
                {"","",""},
                {"","",""},
                {"","",""},
                {"","",""},
                {"","",""},
                {"","",""},
                {"","",""},
                {"","",""}
        };

    }//..

}//end class LGO_Main


/*class Events {
    public static void Arr() {
        String[] Arr1 = new String []
                { "Washoos", "CanJam", "Horseshoes", "Cornhole", "Ladderball", "Stickgame"};

        System.out.println(Arr1);
    }

    System.out.println(String[]);


    }
*/
