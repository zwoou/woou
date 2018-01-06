package bid.woou;

import bid.woou.support.dao.UserMapper;
import bid.woou.support.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YhhApplicationTests {
    @Autowired
    private UserMapper userMapper;

	@Test
	public void contextLoads() {
	}
	@Test
    public void userTest(){
        User user = new User();
//        user.setId(1);
        user.setName("admin");
        user.setAccount("1");
        user.setPassword("admin");
        user.setGender((byte)1);
        userMapper.insert(user);
    }

}
