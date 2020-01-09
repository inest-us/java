package us.inest.app.spring.sample;

/*
 * Spring bean
 */
public class SampleService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello! " + name;
    }
}
