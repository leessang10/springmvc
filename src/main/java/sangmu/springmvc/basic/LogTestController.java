package sangmu.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";
        // Java 특성상 문자열 합치기 연산이 불필요하게 발생하기 때문에 이런 형식은 사용하지 않는 것을 권장한다
//        log.trace("trace name=" + name);
        log.trace("trace name={}", name);
        log.debug("debug name={}", name);
        log.info("info name={}", name);
        log.warn("warn name={}",name);
        log.error("error name={}",name);
        return "OK";
    }
}
