package aode.zhihu.mapping;

import aode.zhihu.model.UserDetailInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserDetailInfoMapper extends Mapper<UserDetailInfo> {
	List<UserDetailInfo> getBusinessStatic(Integer selectLimitAmount);
	
	List<UserDetailInfo> getEmploymentStatic(Integer selectLimitAmount);
	
	List<UserDetailInfo> getEducationStatic(Integer selectLimitAmount);
}