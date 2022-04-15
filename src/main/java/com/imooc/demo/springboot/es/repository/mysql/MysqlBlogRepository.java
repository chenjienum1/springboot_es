package com.imooc.demo.springboot.es.repository.mysql;

import com.imooc.demo.springboot.es.entity.mysql.MysqlBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MysqlBlogRepository extends JpaRepository<MysqlBlog,Integer> {

    //MysqlBlog会根据MysqlBlog上面的注解自动找到blog数据库
    @Query("select e from MysqlBlog e order by e.createTime desc")
    List<MysqlBlog> queryAll();

    @Query("select e from MysqlBlog e where e.title like concat('%',:keyword,'%') " +
            "or e.content like concat('%',:keyword,'%') ")
    List<MysqlBlog> queryBlogs(@Param("keyword") String keyword);
}
