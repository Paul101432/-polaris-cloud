package top.hrzhen;


import org.springframework.web.bind.annotation.*;


@RequestMapping("/")
@RestController
public class IndexCtl {


    @GetMapping("/name")
    public String name() {
        return "ops-oss";
    }

    @GetMapping("/info")
    public String name(@RequestParam("version") String version) {
        return "ops-oss return: <br> "+ version;
    }

}
