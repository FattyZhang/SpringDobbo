package zhaojinshuai.top.api.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    Long id;
    String user;
    Integer age;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    

    public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

   

   
}
