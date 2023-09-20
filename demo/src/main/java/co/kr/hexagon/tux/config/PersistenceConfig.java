
package co.kr.hexagon.tux.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PersistenceConfig {

    public PersistenceConfig() {
        super();
    }

}
