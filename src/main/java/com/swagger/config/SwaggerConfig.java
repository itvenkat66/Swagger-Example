package com.swagger.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(title = "SamarSwagger",
                                description = "this api is for student and teacher",
                                summary = "summary info",
                                termsOfService = "conditions applied...",
                                contact = @Contact(name = "samar",
                                                   email = "samar@gmail.com",
                                                   url = "venkat.com"),
                                license = @License(name = "samar License"),
                                version = "api-1"
                                ),
                        servers = {@Server(description = "devApi",url = "http://localhost:9677"),
                        		@Server(description = "testApi",url = "http://localhost:9677"),
                        		@Server(description = "prodApi",url = "http://localhost:9677")},
                        security = @SecurityRequirement(name = "samar")
                 
                       )
@SecurityScheme(name = "samar",
                in = SecuritySchemeIn.HEADER,
                type = SecuritySchemeType.HTTP,
                bearerFormat = "Bearer",
                description = "basic security...")
public class SwaggerConfig {

}
