package us.inest.app.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static ApplicationContext context;

    public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SampleService service = (SampleService) context.getBean("sampleService");
        String message = service.sayHello();
        System.out.println(message);

        service.setName("Spring");
        message = service.sayHello();
        System.out.println(message);

        Plane rc = (Plane) context.getBean("plane");
        rc.routeCheck();
    }
}
