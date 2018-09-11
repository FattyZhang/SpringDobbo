package zhaojinshuai.top.provider.dao;

import org.apache.ibatis.annotations.Param;
import zhaojinshuai.top.api.entity.User;

public interface UserDao {

    User getUserById(@Param("id") Long id);
}
