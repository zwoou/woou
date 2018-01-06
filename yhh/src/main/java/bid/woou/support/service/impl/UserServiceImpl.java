package bid.woou.support.service.impl;

import bid.woou.common.tools.OptionalUtil;
import bid.woou.support.dao.UserDao;
import bid.woou.support.form.UserForm;
import bid.woou.common.singleTable.mapper.UserMapper;
import bid.woou.common.singleTable.model.User;
import bid.woou.common.singleTable.model.UserExample;
import bid.woou.support.service.UserService;
import bid.woou.support.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by cc on 2018/1/6.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDao userDao;



    @Override
    public User getUser(UserForm userForm) {
        String account = userForm.getAccount();
        String password = userForm.getPassword();
        if (OptionalUtil.isEmpty(account) && OptionalUtil.isEmpty(password)) {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andAccountEqualTo(account).andPasswordEqualTo(password);
            List<User> users = userMapper.selectByExample(userExample);
            // 如果用户登录成功更新状态
            if (users!=null && users.size()>0){
                User u = users.get(0);
                u.setIsonline(new Byte(Constants.USER_YES_ONLINE));
                userMapper.updateByPrimaryKey(u);
                // 获取好友列表
                List<User> listFriends = userDao.listFriends(u.getId());
                userForm.setListFriends(listFriends);
            }
            return users.get(0);
        } else {
            return null;
        }
    }
}
