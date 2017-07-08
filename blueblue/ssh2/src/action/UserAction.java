package action;

import com.opensymphony.xwork2.ActionSupport;
import domain.User;
import service.UserService;

import java.util.List;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public class UserAction extends ActionSupport {

    private UserService userService;
    private User user;
    private String value;
    private List<User> users;

    //kankan seesee cc

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String insert(){
        userService.add(user);
        return "index";
    }

    public String findByUserId(){
        user = userService.selectByUserId(user.getUserid());
        return "update";
    }
    public String findByAny() {
        users = userService.findByAny(value);
        return "index";
    }
    public String update(){
        userService.update(user);
        return "index";
    }
    public String delete(){
        userService.delete(user);
        return "index";
    }
}
