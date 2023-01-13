package mgs_lecture.ch13.prop;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        Enumeration propsNames = props.propertyNames();

        while (propsNames.hasMoreElements()) {
            String propName = (String) propsNames.nextElement();
            String property = props.getProperty(propName);
            System.out.println("property '" + propName + "' = '" + property + "'");
        }
    }
}
