package com.lagou.dao;

import com.lagou.pojo.User;

import java.util.List;

public interface IUserDao {

    //查询所有用户
    public List<User> findAll() throws Exception;


    //根据条件进行用户查询
  //  public User findByCondition(User user) throws Exception;

    //更新数据库

    public int updateByCondition(User user) throws Exception;

    //删除数据
    public int deleteByCondition(User user) throws Exception;

    //插入数据
    public int insertByCondtion (User user) throws Exception;


}
