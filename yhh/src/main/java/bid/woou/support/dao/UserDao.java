package bid.woou.support.dao;

import bid.woou.common.singleTable.model.User;

import java.util.List;

/**
 * Created by cc on 2018/1/6.
 */
public interface UserDao {
    /**
     * 获取好友列表
     * @param id
     * @return
     */
    List<User> listFriends(Integer id);
}
