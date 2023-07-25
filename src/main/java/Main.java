import com.mlomb.freetypejni.FreeType;
import com.mlomb.freetypejni.Library;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        window.run();
        Library library = FreeType.newLibrary();
        System.out.println("version " + library.getVersion());
    }
}
