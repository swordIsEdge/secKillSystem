package com.seckillSystem.miaosha.Dao;

import com.seckillSystem.miaosha.Entity.miaoshaUser;
import org.apache.ibatis.annotations.*;

/**
 * Created by ql on 2019/5/24.
 */
@Mapper
public interface miaoshaUserDao {

    @Select("select * from miaosha_user where nickname=#{nickname}")
    public miaoshaUser getByNickName(@Param("nickname") String nickName);

    @Select("select * form miaosha_user where id=#{id}")
    public miaoshaUser getById(@Param("id") long id);

    @Update("update miaosha_user set password=#{password} where id=#{id}")
    public void update(miaoshaUser user);

    @Insert("insert into miaosha_user(id,nickname,password,salt,head,register_date,last_login_date)" +
            "value(#{id},#{nickname},#{password},#{salt},#{head},#{registerDate},#{lastLoginDate})")
    public void insertMiaoShaUser(miaoshaUser user);
}
