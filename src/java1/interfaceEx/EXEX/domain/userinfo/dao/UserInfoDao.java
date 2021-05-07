package java1.interfaceEx.EXEX.domain.userinfo.dao;

import java1.interfaceEx.EXEX.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void UpdateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
