/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   Administrator
 * Date:     2017/11/17 0017 16:41
 * Description: user service implement
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zte.bigdata3.vmaxrdatahatch.service.impl;
/**
 * Created by Administrator on 2017/11/17 0017.
 */

import com.zte.bigdata3.vmaxrdatahatch.dao.IUserDao;
import com.zte.bigdata3.vmaxrdatahatch.pojo.User;
import com.zte.bigdata3.vmaxrdatahatch.service.IUserService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br> 
 * 〈user service implement〉
 *
 * @author Administrator
 * @create 2017/11/17 0017
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    public void regist(User user) {
        iUserDao.addUser(user);
    }

    public void login(String username,String password) {
        iUserDao.findUserByNameAndPwd(username,password);
    }
}
