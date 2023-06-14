package com.wms;

import com.mysql.jdbc.log.Log;
import com.wms.controller.ExperienceInformationController;
import com.wms.entity.ExperienceInformation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WmsApplicationTests {

    @Autowired
    ExperienceInformationController experienceInformationController;
    @Test
    public void contextLoads() {
        List<ExperienceInformation> list = experienceInformationController.getSalaryAll();
        System.out.println(list);
    }

}
