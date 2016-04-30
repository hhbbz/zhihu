package aode.zhihu.pipeline;

import aode.zhihu.mapping.UserDetailInfoMapper;
import aode.zhihu.model.UserDetailInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import com.alibaba.fastjson.JSON;

@Component("UserDetailInfoPipeline2")
public class UserDetailInfoPipeline2 implements PageModelPipeline<UserDetailInfo> {
	
	@Autowired
	private UserDetailInfoMapper userDetailInfoMapper;
	@Override
	public void process(UserDetailInfo t, Task task) {
		// TODO Auto-generated method stub
		System.err.println(JSON.toJSONString(t));
		userDetailInfoMapper.insertSelective(t);
	}

}