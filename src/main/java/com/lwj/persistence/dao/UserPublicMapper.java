package com.lwj.persistence.dao;

import com.lwj.persistence.pojo.UserPublic;

public interface UserPublicMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserPublic record);

    int insertSelective(UserPublic record);

    UserPublic selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserPublic record);

    int updateByPrimaryKey(UserPublic record);
}