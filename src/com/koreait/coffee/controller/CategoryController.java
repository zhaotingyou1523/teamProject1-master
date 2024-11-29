package com.koreait.coffee.controller;

import com.koreait.coffee.config.MysqlConfig;
import com.koreait.coffee.model.dto.Category;
import com.koreait.coffee.model.mapper.CategoryMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CategoryController{
    public SqlSession sqlSession = MysqlConfig.mysqlConnect();
    public CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);

    public Category getCategoryById(Integer id){
        return mapper.getCategoryById(id);
    }

    public List<Category> getAllCategory(){
        return mapper.getAllCategory();
    }
}
