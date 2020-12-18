package PackageInjector;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author VS
 */
public class addProperties {
    private final Properties properties = new Properties();

    /**
     * @param one Ключ
     * @param two Значение
     */
    public void newProperties(String one, String two) {
        properties.setProperty(one, two);
    }

    public void saveProperties() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("myProperties");
        properties.store(fileOutputStream, "");
    }
}
