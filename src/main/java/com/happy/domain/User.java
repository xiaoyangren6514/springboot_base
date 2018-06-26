package com.happy.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zhonglq on 2018/6/26.
 * ConfigurationProperties 本类中的属性和配置文件中配置的值进行绑定
 */
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private String userName;
    private Integer age;
    private Boolean isBoss;
    private Date birth;

    private Map<String, Object> maps;
    private List<Object> hobbies;
    private Dog dog;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return isBoss;
    }

    public void setBoss(Boolean boss) {
        isBoss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Object> hobbies) {
        this.hobbies = hobbies;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", isBoss=" + isBoss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", hobbies=" + hobbies +
                ", dog=" + dog +
                '}';
    }
}
