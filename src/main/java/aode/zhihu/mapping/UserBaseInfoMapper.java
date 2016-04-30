package aode.zhihu.mapping;

import aode.zhihu.model.UserBaseInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserBaseInfoMapper extends Mapper<UserBaseInfo> {
	List<UserBaseInfo> getLocationStatic(Integer selectLimitAmount);
	
	int getAmountByReocordItem(UserBaseInfo record);
}