package com.imooc.demo.springboot.es.entity.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;



import javax.persistence.Column;
import java.util.Date;


@Data
//document就相当于关系型数据库里面的表:table
@Document(indexName = "blog", useServerConfiguration = true, createIndex = false)
//没有配置userServerConfiguration，对document在代码层面任何的修改都会在每次启动springboot的时候同步到elasticsearch
//没有配置createIndex = false的话，他会把你线上的blog删除掉，再创建一个新的blog
public class EsBlog {

    @Id //注意是哪个id
    private Integer id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String title;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String author;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String content;
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    private Date createTime;
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    private Date updateTime;
}
