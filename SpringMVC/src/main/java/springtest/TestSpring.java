package springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");


        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer.getFilmPlayer().getName());
        System.out.println(computer.getFilmPlayer().getValue());
        System.out.println(computer);

        context.close();
    }
}
