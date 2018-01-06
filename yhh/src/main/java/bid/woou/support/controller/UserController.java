package bid.woou.support.controller;

import bid.woou.support.form.UserForm;
import bid.woou.common.singleTable.model.User;
import bid.woou.support.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by cc on 2018/1/6.
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public UserForm login(@RequestBody UserForm userForm) {
        User u = userService.getUser(userForm);
        if (Optional.ofNullable(u).isPresent()) {
            return userForm;
        } else {
            return userForm;
        }
    }
}
