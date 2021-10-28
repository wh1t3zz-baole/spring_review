import com.jdbc.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;

/**
 * @author mac guopan
 * @description spring_review jdbcTemplateTest
 * @date 2021/10/27 8:03 下午
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class jdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // update
    @Test
    public void update(){
           jdbcTemplate.update("update account set money = ? where name = ?",600,"小贾");
    }

    // delete
    @Test
    public void delete(){
        jdbcTemplate.update("delete from account where name = ?","小王");
    }

    // 聚合函数
    @Test
    public void count(){
        Long result = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(result);
    }

    // 查找一个
    @Test
    public void select(){
        Account account = jdbcTemplate.queryForObject("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class),"小贾");
        System.out.println(account.toString());
    }

    // 查找全部
    @Test
    public void selectAll(){
        List<Account> list = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<>(Account.class));
        System.out.println(list.size());
        Iterator<Account> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
