package org.hit.ices.ices_pm_platform;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class IcesPmPlatformApplicationTests {
    @Before
    public void init(){
        System.out.println("--------------------Test Start.---------------------");
    }

    @After
    public void after(){
        System.out.println("--------------------Test End.--------------------");
    }

}
