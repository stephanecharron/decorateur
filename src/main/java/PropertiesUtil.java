import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    private InputStream inputStream;

    private PropertiesUtil propertiesUtil;
    private Properties prop = new Properties();


    private PropertiesUtil( ) {
        prop = loadProperties();
        propertiesUtil = this;
    }

    private static PropertiesUtil INSTANCE = new PropertiesUtil();

    public static Double get(String prop) {
        return  Double.parseDouble(INSTANCE.prop.getProperty(prop));
    }

    private Properties loadProperties ()  {
        String propFileName = "coffee.properties";

        inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

        if (inputStream != null) {
            try {
                prop.load(inputStream);
            } catch (IOException e) {
            }
            return prop;
        } else {
        }
        return new Properties();
    }

}
