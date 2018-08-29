package com.zto.growing;

import com.wang.growing.Application;
import com.wang.growing.service.AsyncTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangyuanyuan@zto.com
 * @Description: 12
 * @date 2018/8/29/15:53
 */
@RunWith(SpringRunner.class)
//webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT指定随机端口号
//classes = Application.class 指定启动类
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = Application.class)
@ActiveProfiles("dev")
public class ApplicationTest {
    @Autowired
    private AsyncTaskService asyncTaskService;

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
    }
}
