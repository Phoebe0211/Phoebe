package dao;

import domain.User;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public class UserDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void insert(User user){
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }
    public User selectByUserId(Integer userid) {
        return (User) sessionFactory.openSession().get(User.class,userid);
    }
    public List<User> selectByAny(String value) {
        return sessionFactory.openSession()
                .createQuery("from domain.User u where u.username like :name")
                .setString("name", "%" + value + "%")
                .list();
    }
    @Transactional
    public void update(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }
    @Transactional
    public void delete(User user){
        sessionFactory.getCurrentSession().delete(user);
    }
}
