package util.test;

import java.util.Locale;

public class Test {

    public static void main(String[] args) {

       // System.out.println(Locale.ENGLISH.getLanguage());
//        System.out.println(ClassLoader.getSystemClassLoader());
//        System.out.println(Test.class.getClassLoader());

      //  System.out.println(Test.class.getClassLoader().getResource("server.xml"));
        System.out.println(ClassLoader.getSystemClassLoader().getParent());

        ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();

        System.out.println(parent.getResource("com/sun/org/apache/xerces/internal/jaxp/SAXParserFactoryImpl.class"));


    }
}
