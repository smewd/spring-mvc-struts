package com.smood.init;



import com.smood.service.PackageMarker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;



@Configuration
@ComponentScan(basePackageClasses = {
		com.smood.service.PackageMarker.class,
		com.smood.struts.PackageMarker.class,
})
//@ImportResource({
//		"classpath:struts-actions.xml",
//})
class SpringContextConfig
{
}
