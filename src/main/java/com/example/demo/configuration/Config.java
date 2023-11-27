package com.example.demo.configuration;

import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = {"com.example.demo.repository"})
@ComponentScan(basePackages = {"com.example.demo"})
public class Config extends AbstractElasticsearchConfiguration {
    @Value("${elasticsearch.url}")
    private String elasticSearchUrl;

    /**
     * RestHighLevelClient to configure connection to elasticSearch
     *
     * @return
     */
    @Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(elasticSearchUrl)
                .withBasicAuth("elastic","123123")
                .build();
        return RestClients.create(clientConfiguration).rest();


    }
}
