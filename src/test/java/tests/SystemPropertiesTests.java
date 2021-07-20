package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void readNullFromPropertyTest() {
        String value = System.getProperty("our_property");

        System.out.println(value);

    }

    @Test
    void setAndReadFromPropertyTest() {
        System.setProperty("our_property", "communism");
        String value = System.getProperty("our_property");

        System.out.println(value);

    }
    @Test
    void readDefaultFromPropertyTest() {
        String value = System.getProperty("our_property","democracy");

        System.out.println(value);

    }


    @Test
    void readAndSetDefaultFromPropertyTest() {
        System.setProperty("our_property", "communism");
        String value = System.getProperty("our_property","democracy");

        System.out.println(value);

    }

    @Test
    void readWithGradleFromPropertyTest() {
        String value = System.getProperty("browser","chrome");

        System.out.println(value);

    }


    @Test
    @Tag("terminal")
    void readWithTerminalFromPropertyTest() {
        String version = System.getProperty("version","91");
        String browser = System.getProperty("browser","chrome");

        System.out.println(version);
        System.out.println(browser);

    }


}
