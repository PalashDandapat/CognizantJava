package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Beans registered in container:");
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(" - "+beanName);
        }

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.checkingConnection();
        System.out.println("\nBookRepository Injection");
        bookService.checkingInjection();

    }
}
