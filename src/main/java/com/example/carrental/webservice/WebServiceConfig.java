package com.example.carrental.webservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurationSupport;
import org.springframework.ws.server.EndpointExceptionResolver;
import org.springframework.ws.server.endpoint.adapter.DefaultMethodEndpointAdapter;
import org.springframework.ws.server.endpoint.adapter.method.MarshallingPayloadMethodProcessor;
import org.springframework.ws.server.endpoint.adapter.method.MethodArgumentResolver;
import org.springframework.ws.server.endpoint.adapter.method.MethodReturnValueHandler;
import org.springframework.ws.soap.server.endpoint.SimpleSoapExceptionResolver;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurationSupport {

    @Bean
    public EndpointExceptionResolver soapFaultMappingExceptionResolver() {
        return new SimpleSoapExceptionResolver();
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.carrental.model.dto");
        marshaller.setMtomEnabled(true);
        return marshaller;
    }

    @Bean
    public MarshallingPayloadMethodProcessor methodProcessor() {
        return new MarshallingPayloadMethodProcessor(marshaller());
    }

    @Bean
    DefaultMethodEndpointAdapter endpointAdapter(MarshallingPayloadMethodProcessor methodProcessor) {

        DefaultMethodEndpointAdapter adapter = new DefaultMethodEndpointAdapter();
        adapter.setMethodArgumentResolvers(Collections.singletonList(methodProcessor));
        adapter.setMethodReturnValueHandlers(Collections.singletonList(methodProcessor));
        return adapter;
    }

    @Bean(name = "client")
    public DefaultWsdl11Definition clientSchemaDefinition(@Qualifier("clientSchema") XsdSchema clientSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ClientPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://localhost:8080/services/client");
        wsdl11Definition.setSchema(clientSchema);
        return wsdl11Definition;
    }

    @Bean(name = "car")
    public DefaultWsdl11Definition carSchemaDefinition(@Qualifier("carSchema") XsdSchema carSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CarPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://localhost:8080/services/car");
        wsdl11Definition.setSchema(carSchema);
        return wsdl11Definition;
    }

    @Bean(name = "rental")
    public DefaultWsdl11Definition rentalSchemaDefinition(@Qualifier("rentalSchema") XsdSchema rentalSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("RentalPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://localhost:8080/services/rental");
        wsdl11Definition.setSchema(rentalSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema clientSchema() {
        return new SimpleXsdSchema(new ClassPathResource("ws/client.xsd"));
    }

    @Bean
    XsdSchema carSchema() {
        return new SimpleXsdSchema(new ClassPathResource("ws/car.xsd"));
    }

    @Bean
    XsdSchema rentalSchema() {
        return new SimpleXsdSchema(new ClassPathResource("ws/rental.xsd"));
    }
}
