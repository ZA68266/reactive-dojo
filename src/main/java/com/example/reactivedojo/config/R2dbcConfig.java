package com.example.reactivedojo.config;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.r2dbc.core.DatabaseClient;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;

@Primary
@Configuration
public class R2dbcConfig extends AbstractR2dbcConfiguration {

    @Value("${spring.r2dbc.datasource.host:localhost}")
    private String host;
    @Value("${spring.r2dbc.port:5433}")
    private int port;
    @Value("${spring.r2dbc.database:yugabyte}")
    private String database;
    @Value("${spring.r2dbc.username:yugabyte}")
    private String username;
    @Value("${spring.r2dbc.password:yugabyte}")
    private String password;

    @Bean
    @Override
    public ConnectionFactory connectionFactory() {
        return new PostgresqlConnectionFactory(PostgresqlConnectionConfiguration.builder().host(host).port(port)
                .username(username).database(database).password(password).build());
    }

    @Bean
    DatabaseClient r2dbcDatabaseClient(ConnectionFactory connectionFactory) {
        return DatabaseClient.builder().connectionFactory(connectionFactory).namedParameters(true).build();
    }
}
