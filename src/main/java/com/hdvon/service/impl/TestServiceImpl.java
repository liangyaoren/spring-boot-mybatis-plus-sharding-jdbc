package com.hdvon.service.impl;

import com.hdvon.entity.Test;
import com.hdvon.mapper.TestMapper;
import com.hdvon.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyle
 * @since 2019-10-11
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
