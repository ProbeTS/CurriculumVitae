package com.example.resume.Dao;

import com.example.resume.Category.About;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface aboutDao {

    @Select("SELECT * FROM about")
    List<About> findAllAbout();

}
