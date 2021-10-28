import com.mchange.v2.c3p0.ComboPooledDataSource;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * @author mac guopan
 * @description spring_review test01
 * @date 2021/10/26 11:46 下午
 */


public class test01 {

    @Test
    public void test_01() throws PropertyVetoException {
        //创建数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver"); // 创建数据库驱动
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc_test");// 创建数据库连接字符串
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("tomcat123");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(comboPooledDataSource);
        int row = jdbcTemplate.update("insert into Account values(?,?)","小红",500.0);
        System.out.println(row);

    }

    @Test
    public void test_02() throws PropertyVetoException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        int row = jdbcTemplate.update("insert into Account values(?,?)","小贾",500.0);
        System.out.println(row);

    }

}
