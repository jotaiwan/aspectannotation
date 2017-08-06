package com.aspect.annotation.configuration;

import com.aspect.annotation.aspect.ViewAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by jotaiwan on 6/08/2017.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.aspect.annotation.aspect")
public class AspectConfig {


}
