package ncs_dataio_moon_joonghui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ ContextDataSource.class, ContextSqlSession.class })
@ComponentScan(basePackages = { "ncs_dataio_moon_joonghui.mapper" })
public class ContextRoot {

}
