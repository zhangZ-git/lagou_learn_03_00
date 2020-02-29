package com.lagou.sqlSession;

import com.lagou.pojo.Configuration;
import com.lagou.pojo.MappedStatement;

import java.sql.PreparedStatement;
import java.util.List;

public interface Executor {

   public <E> List<E> query(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;

    //user


    public <T> int updateDelIn(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

}
