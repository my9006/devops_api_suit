package configs;

import lombok.SneakyThrows;

import java.util.Properties;

public class Config {

    private static Properties PROPERTIES;
    public static final String BASE_URI;

    static {
        loadProperties();
        BASE_URI = PROPERTIES.getProperty("uri");
    }

    @SneakyThrows
    private static void loadProperties() {
        PROPERTIES = new Properties();
        PROPERTIES.load(Config.class.getClassLoader().getResourceAsStream("environment.properties"));
    }

}
