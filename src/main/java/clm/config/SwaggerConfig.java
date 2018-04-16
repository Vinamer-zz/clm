package clm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    /**
     * cofiguration related to swagger implementation
     * @return
     */
    @Bean
    public Docket hsbcApi() {
        return new Docket(DocumentationType.SWAGGER_2)
<<<<<<< HEAD
                .select().apis(RequestHandlerSelectors.basePackage("clm.controllers"))
=======
                .select().apis(RequestHandlerSelectors.basePackage("clm.controller"))
>>>>>>> 2c7f322497048f4997972bdeaa6a394ce2d29ea6
                .paths(PathSelectors.any())
                .build();
    }

}

