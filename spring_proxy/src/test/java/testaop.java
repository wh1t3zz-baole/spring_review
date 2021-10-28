import com.aop.impl.AdminServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mac guopan
 * @description spring_review testaop
 * @date 2021/10/27 9:54 下午
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testaop {

    @Autowired
    private AdminServiceImpl adminServiceImpl;

    @Test
    public void test01(){
        adminServiceImpl.update();
    }
}
