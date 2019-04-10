package test;

import beans.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        //Now all the bean objects specified in the Spring conf file will be created and stored as key-value pairs

        /*
        Book b1 = (Book) context.getBean("b1");
        Book b2 = (Book) context.getBean("b1");

        b1.getBookDetails();
        b2.getBookDetails();

        System.out.println(b1 == b2);
        System.out.println("Hence its a Singleton class");
        */
    }
}
