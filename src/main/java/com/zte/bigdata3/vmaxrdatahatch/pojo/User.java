/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: User
 * Author:   Administrator
 * Date:     2017/11/17 0017 16:43
 * Description: user pojo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zte.bigdata3.vmaxrdatahatch.pojo;/**
 * Created by Administrator on 2017/11/17 0017.
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈user pojo〉
 *
 * @author Administrator
 * @create 2017/11/17 0017
 * @since 1.0.0
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String phonenum;
    private int sex;
    private String comment;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
