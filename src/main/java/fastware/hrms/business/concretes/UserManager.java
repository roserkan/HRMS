package fastware.hrms.business.concretes;

import fastware.hrms.business.abstracts.UserService;
import fastware.hrms.dataAccess.abstracts.UserDao;
import fastware.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }




    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
