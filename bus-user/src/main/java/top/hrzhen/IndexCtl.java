package top.hrzhen;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hrzhen.bus.config.ClientUser;
import top.hrzhen.bus.config.SysUser;
import top.hrzhen.bus.discovery.OssFeign;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RequestMapping("/")
@RestController
public class IndexCtl {


    @Resource
    private SysUser sysUser;

    @Resource
    private ClientUser clientUser;


    @Resource
    OssFeign ossFeign;

    @GetMapping("/config")
    public Map config() {
        Map<String, Object> map = new HashMap<>();
        map.put("clientUser", clientUser.toString());
        map.put("sysUser", sysUser.toString());
        map.put("time", new Date());
        return map;
    }

    @GetMapping("/discovery")
    public String discovery() {
        return ossFeign.name(UUID.randomUUID().toString());
    }

    @GetMapping("/name")
    public String name() {
        return "bus-user";
    }
}
