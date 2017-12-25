package com.test.zookeeper.dubbo;

import com.test.zookeeper.data.User;

/**
 * <p class="detail">
 * 功能：远程service
 * </p>
 * @ClassName: ISOAUserService 
 * @version V1.0  
 * @date 2017年12月25日 
 * @author wuxw
 * Copyright 2015 tsou.com, Inc. All rights reserved
 */
public interface ISOAUserService {
	
	public User getDetail(Long id);
}
