package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.project.model.entity.InterfaceInfo;
import com.yupi.project.model.entity.UserInterfaceInfo;


/**
* @author Administrator
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-03-06 15:42:30
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    boolean invokeCount(long interfaceInfoId, long userId);

}
