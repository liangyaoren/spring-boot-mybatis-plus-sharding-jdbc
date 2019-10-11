package com.hdvon.controller;


import com.hdvon.entity.Test;
import com.hdvon.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lyle
 * @since 2019-10-11
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping("test")
    @Transactional
    public void test(Integer id) {
        Test byId = testService.getById(id);
        if (byId == null) {
            Test test = new Test();
            test.setId(id);
            test.setName(String.valueOf(id));
            testService.save(test);
        }
    }
}

