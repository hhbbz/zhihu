package aode.zhihu.serviceI.impl;

import aode.zhihu.mapping.UserDetailInfoMapper;
import aode.zhihu.model.UserDetailInfo;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

public class UserDetailInfoServiceImpl {

	@Autowired
	private UserDetailInfoMapper userDetailInfoMapper;

	public int getBaseUsersAccount(){
		UserDetailInfo record = new UserDetailInfo();
		record.setDetailUserId(1);
		System.out.println(JSON.toJSONString(record));
		return userDetailInfoMapper.selectCount(record);
	}

}
