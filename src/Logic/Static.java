package Logic;

import java.util.LinkedList;

public class Static {

    public static String defaultDarkCharSeparator = "°";
    public static String version = "0.8.1",title = "Just Vice Text Encrypter";
    public static LinkedList<Character> charactersList = new LinkedList<Character>();
    public static String folderForDataName = "Just Vice Text Encrypter";
    public static String DataPath = System.getenv("APPDATA") + "\\" + folderForDataName + "\\UserData.txt";
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + folderForDataName;
    public static Run run = new Run();
    public static Data data = new Data();
    public static String charactersTXTdefaultPath = DataFolderPath + "\\characters";
    public static String charactersTXTdefaultName = "characters";
    public static int defaultTimeForPopUpMessage = 750;
    public static int defaultTimeForLogo = 1170;
    public static String logsDefaultName = "Logs";
    
}