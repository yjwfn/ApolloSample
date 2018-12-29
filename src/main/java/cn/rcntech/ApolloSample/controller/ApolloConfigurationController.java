package cn.rcntech.ApolloSample.controller;

import com.ctrip.framework.apollo.ConfigService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/configurations")
public class ApolloConfigurationController {

    @RequestMapping(path = "/{key}")
    public String getConfigForKey(@PathVariable("key") String key){
        return ConfigService.getAppConfig().getProperty(key, "undefined");
    }
}
