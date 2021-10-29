import com.aop.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mac guopan
 * @description spring_review testaop
 * @date 2021/10/27 9:54 下午
 */

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class testaop {

    @Autowired
    private AdminService adminServiceImpl;

    @Test
    public void test01(){
        adminServiceImpl.update();
    }
}
