package zhaojinshuai.top.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import zhaojinshuai.top.api.entity.User;
import zhaojinshuai.top.api.service.UserService;
import zhaojinshuai.top.provider.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(Long id) {
        User user = userDao.getUserById(id);
        System.err.println(user);
        return user;
    }
}
