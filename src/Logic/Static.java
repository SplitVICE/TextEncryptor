package Logic;

import java.util.LinkedList;

public class Static {

    public static Run run;
    public static TextKeeper textKeeper = new TextKeeper();
    public static String defaultDarkCharSeparator = "°";
    public static String version = "Beta 0.8.2", title = "Text Encrypter";
    public static LinkedList<Character> charactersList = new LinkedList<Character>();
    public static String folderForDataName = "TextEncrypter";
    public static String globalFolderForData = "Just Vice";
    public static String DataPath = System.getenv("APPDATA") + "\\"+globalFolderForData+"\\" + folderForDataName + "\\UserData.txt";
    public static String DataFolderPath = System.getenv("APPDATA") + "\\"+globalFolderForData+"\\" + folderForDataName;
    public static Data data = new Data();
    public static String charactersTXTdefaultPath = DataFolderPath + "\\characters";
    public static String charactersTXTdefaultName = "characters";
    public static int defaultTimeForPopUpMessage = 750;
    public static int defaultTimeForLogo = 1170;
    public static String logsDefaultName = "Logs";

}
