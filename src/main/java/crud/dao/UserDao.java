package crud.dao;

import crud.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
