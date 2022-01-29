package fastware.hrms.business.abstracts;

import fastware.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
