package mgs_online.ch03_oop_essential.ex02.domain.userinfo.dao.oracle;

import mgs_online.ch03_oop_essential.ex02.domain.userinfo.UserInfo;
import mgs_online.ch03_oop_essential.ex02.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into ORACLE DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into ORACLE DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from ORACLE DB userID = " + userInfo.getUserId());
    }
}
