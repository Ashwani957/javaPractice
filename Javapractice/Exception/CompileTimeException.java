
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeException {

    public static void main(String args[]) throws FileNotFoundException {

        File file = new File("E:/PraticeEverything/Javapractice/Exception/file.txt");
        FileReader fr = new FileReader(file);
        System.out.println(fr);

    }
}
