package com.jyall.feign;

import com.jyall.pojo.Dict;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by wang.linqiao on 2016/11/2.
 */
@FeignClient(name = "demo-provider",value = "demo-provider")
public interface DictFeignClient {
    @RequestMapping("/dict/getDictByTypeCode/{type}")
    public String getDictByTypeCode(@PathVariable("type") String type);
}
