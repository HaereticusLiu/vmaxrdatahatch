/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: IUserService
 * Author:   Administrator
 * Date:     2017/11/17 0017 16:38
 * Description: user serive
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zte.bigdata3.vmaxrdatahatch.service;/**
 * Created by Administrator on 2017/11/17 0017.
 */

import com.zte.bigdata3.vmaxrdatahatch.pojo.User;

/**
 * 〈一句话功能简述〉<br> 
 * 〈user serive〉
 *
 * @author Administrator
 * @create 2017/11/17 0017
 * @since 1.0.0
 */
public interface IUserService {
    void regist(User user);
    void login(String username,String password);
}
