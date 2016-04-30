package aode.zhihu.serviceI.impl;

import aode.zhihu.model.UserBaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aode.zhihu.mapping.UserBaseInfoMapper;
import aode.zhihu.serviceI.UserBaseInfoServiceI;
@Service
public class UserBaseInfoServiceImpl implements UserBaseInfoServiceI {

	@Autowired
	private UserBaseInfoMapper userBaseInfoMapper;

	public int getBaseUsersAccount(){
		UserBaseInfo record = new UserBaseInfo();
		record.setId(11);
		return userBaseInfoMapper.selectCount(record);
	}
	
	/*public List<UserBaseInfo> get(){
		
	}*/
	
}
