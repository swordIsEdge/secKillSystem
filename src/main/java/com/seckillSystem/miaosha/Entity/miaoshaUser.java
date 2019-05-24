package com.seckillSystem.miaosha.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by ql on 2019/5/24.
 */
@Repository
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class miaoshaUser {
    private Long id;//用户手机号,账号
    private String nickname;//昵称
    private String password;//密码
    private String head;//头像
    private String salt;//salt
    private Date registerDate;//注册时间
    private Date lastLoginDate;//最近登录时间
    private Integer loginCount;//登录次数

    @Override
    public String toString() {
        return "miaoshaUser{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", head='" + head + '\'' +
                ", registerDate=" + registerDate +
                ", lastLoginDate=" + lastLoginDate +
                ", loginCount=" + loginCount +
                '}';
    }
}
