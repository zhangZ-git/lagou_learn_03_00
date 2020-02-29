package com.lagou.test;

import com.lagou.config.XMLConfigBuilder;
import com.lagou.dao.IUserDao;
import com.lagou.io.Resources;
import com.lagou.pojo.Configuration;
import com.lagou.pojo.User;
import com.lagou.sqlSession.DefaultSqlSessionFactory;
import com.lagou.sqlSession.SqlSession;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class IPersistenceTest {

    @Test
    public void test() throws Exception {
        InputStream resourceAsSteam = Resources.getResourceAsSteam("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //调用
        User user = new User();
        user.setId(5);
        user.setUsername("莱昂纳多");
        user.setDepartment("人事部");
        user.setWork("专员");
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

       /*
       * 修改测试
       * */

      /*  int upd = userDao.updateByCondition(user);
        System.out.println(upd);*/

       /*
       *查询测试
       * */
       /* List<User> all = userDao.findAll();
        for (User user1 : all) {
            System.out.println(user1);
        }*/

       /*
       * 删除测试
       *
       * */
      /*  int del = userDao.deleteByCondition(user);
        System.out.println(del);*/

        /*
        * 增添测试
        * */
        int ins = userDao.insertByCondtion(user);
        System.out.println(ins);



    }



}
