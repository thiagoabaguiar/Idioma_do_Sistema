import java.util.Locale;

public class App{

    public static void main(String[] args) {

        // 1ª forma:
        System.out.println(Locale.getDefault());

        // 2ª forma:
        Locale idioma = Locale.getDefault();
        System.out.println(idioma);
        
        // 3ª forma:
        Locale idioma2 = Locale.getDefault();
        System.out.println(idioma2.getDisplayLanguage());
    }

}