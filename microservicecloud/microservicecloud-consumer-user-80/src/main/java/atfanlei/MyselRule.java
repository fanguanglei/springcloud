package atfanlei;


import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyselRule
 * @Description //TODO
 * @Author fgl
 * @Date 2019/11/416:42
 * @Version 1.0
 **/
@Configuration
public class MyselRule {

  @Bean
  public IRule getRule(){

    return new MyselRule5();
  }
}
