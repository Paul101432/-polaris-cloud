package top.hrzhen.bus.discovery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "opsOss" )
public interface OssFeign {

    @GetMapping("/info")
    String name(@RequestParam("version") String version);

}
