import com.DI.extend.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");

        User userP= (User) applicationContext.getBean("userP");
        System.out.println(userP.toString());

        User userC= (User) applicationContext.getBean("userC");
        System.out.println(userC.toString());
    }
}
