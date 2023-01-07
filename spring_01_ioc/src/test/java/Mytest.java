import com.first.dao.UserDaoImpl;
import com.first.dao.UserDaoMysqlImpl;
import com.first.dao.UserDaoOracleImpl;
import com.first.service.UserService;
import com.first.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
//        //用户只能摸Service层，其他的不给摸！！（这里是普通实现）
//        UserService userService1=new UserServiceImpl();
//        userService1.setUserDao(new UserDaoImpl());
//        userService1.getUserDao();

        //这里是用spring写的，控制反转ioc
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("UserServiceImpl");
        userService.getUserDao();

    }
}
