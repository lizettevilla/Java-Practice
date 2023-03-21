public class AlfredTest {
    public static void(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth", "evening");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.answeringBeforeAlexis("Alexis! Play some low-fi beats.");
        String AlfredTest = alfredBot.answeringBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.answeringBeforeAlexis("Maybe That's What Batman Is About. Not Winning. But...");

        System.out.println(testGreeting);
        // System.out.println(testGuestGreeting);
        // System.out.println(testDateAnnouncement);
        // System.out.println(alexisTest);
        // System.out.println(AlfredTest);
        // System.out.println(notRelevantTest);
    }
}