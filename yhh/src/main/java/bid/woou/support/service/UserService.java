package bid.woou.support.service;

import bid.woou.support.form.UserForm;
import bid.woou.common.singleTable.model.User;

/**
 * Created by cc on 2018/1/6.
 */
public interface UserService {
    User getUser(UserForm userForm);
}
