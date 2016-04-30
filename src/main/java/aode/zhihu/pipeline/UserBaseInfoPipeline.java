package aode.zhihu.pipeline;

import aode.zhihu.mapping.UserBaseInfoMapper;
import aode.zhihu.model.UserBaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

@Component("UserBaseInfoPipeline")
public class UserBaseInfoPipeline implements PageModelPipeline<UserBaseInfo> {

	@Autowired
	private UserBaseInfoMapper userBaseInfoMapper;
 
	@Override
	public void process(UserBaseInfo t, Task task) {
		userBaseInfoMapper.insertSelective(t);
	}

}
