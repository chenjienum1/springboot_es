package com.imooc.demo.springboot.es.entity.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 *
 */
@Data
//让spring知道下面和数据库哪个表一一对应
@Table(name = "t_blog")
//  @Entity是指这个类映射到数据库表
@Entity
public class MysqlBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;

    @Column(columnDefinition = "mediumtext")
    private String content;
    private Date createTime;
    private Date updateTime;

}
