package springTest;

import Factory.BeanFactory;
import bean.Person;

/**
 * 使用了 Spring 的命名
 * 更新了代码包的架构
 */
public class SpringIOCTest {

    public static void main(String[] args) throws Exception {

        BeanFactory personFactory = new BeanFactory();

        Person student = personFactory.getBean("student");
        student.introduce("college"); // I am a college student

        Person teacher = personFactory.getBean("teacher");
        teacher.introduce("Math"); // I am a Math teacher

    }

}
