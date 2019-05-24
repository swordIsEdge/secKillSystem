package com.seckillSystem.miaosha.Service;

import com.seckillSystem.miaosha.Dao.miaoshaUserDao;
import com.seckillSystem.miaosha.Entity.miaoshaUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ql on 2019/5/24.
 */
@Service
public class miaoshaUserService {
    private static final Logger logger= LoggerFactory.getLogger(miaoshaUserService.class);

    @Autowired
    miaoshaUserDao miaoshaUserDao;

    public miaoshaUser getByNickName(String nickname){
        return miaoshaUserDao.getByNickName(nickname);
    }
}
