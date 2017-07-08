package service;

import action.UserAction;
import dao.UserDao;
import domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public class UserService {

    private UserDao userDao;



    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void add(User user) {
        userDao.insert(user);
    }

    public User selectByUserId(Integer userid) {
        return (User) userDao.selectByUserId(userid);
    }

    public List<User> findByAny(String value) {
        return userDao.selectByAny(value);
    }

    public void update(User user) {
        userDao.update(user);
    }
    public void delete(User user){
        userDao.delete(user);
    }

}
