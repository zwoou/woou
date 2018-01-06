package bid.woou.support.form;

import bid.woou.common.singleTable.model.User;

import java.util.List;

/**
 * Created by cc on 2018/1/6.
 */
public class UserForm {
    private String account;
    private String password;
    private List<User> listFriends;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public List<User> getListFriends() {
        return listFriends;
    }

    public void setListFriends(List<User> listFriends) {
        this.listFriends = listFriends;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
