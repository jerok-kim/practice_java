package mgs_online.ch03_oop_essential.ex02.domain.userinfo.dao;

import mgs_online.ch03_oop_essential.ex02.domain.userinfo.UserInfo;

public interface UserInfoDao {
    
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
    
}