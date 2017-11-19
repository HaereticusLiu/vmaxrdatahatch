/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: IUserDao
 * Author:   Administrator
 * Date:     2017/11/17 0017 16:29
 * Description: user dao
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zte.bigdata3.vmaxrdatahatch.dao;/**
 * Created by Administrator on 2017/11/17 0017.
 */

import com.zte.bigdata3.vmaxrdatahatch.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * 〈一句话功能简述〉<br> 
 * 〈user dao〉
 *
 * @author Administrator
 * @create 2017/11/17 0017
 * @since 1.0.0
 */
public interface IUserDao {
    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    void findUserByNameAndPwd(@Param("username")String username, @Param("password")String password);
}
