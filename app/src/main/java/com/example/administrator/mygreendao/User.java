package com.example.administrator.mygreendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Administrator on 2017-12-07 0007.
 */
@Entity
public class User {
    @Id(autoincrement = true)
    private Long _id;
    @Property(nameInDb = "USERNAME")
    private String username;
    @Property(nameInDb = "NICKNAME")
    private String nickname;
    @Property(nameInDb = "NUM")
    private String num;



    @Generated(hash = 100822882)
    public User(Long _id, String username, String nickname, String num) {
        this._id = _id;
        this.username = username;
        this.nickname = nickname;
        this.num = num;
    }

    @Generated(hash = 586692638)
    public User() {
    }



    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Long get_id() {
        return this._id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
