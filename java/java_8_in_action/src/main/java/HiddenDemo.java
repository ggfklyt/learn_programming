import java.io.File;
import java.io.FileFilter;

public class HiddenDemo {
    public static void main(String[] args) {
        /*File[] hiddenFiles = new File("/Users/art/Desktop/learn_programming/java/schildt/lambdas").listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isHidden();
            }
        });*/
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        System.out.println("Printing out hidden files");
        for (File f: hiddenFiles) {
            System.out.println(f);
        }

    }
}
