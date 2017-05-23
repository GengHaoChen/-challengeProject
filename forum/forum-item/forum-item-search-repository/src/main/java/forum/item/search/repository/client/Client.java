package forum.item.search.repository.client;


import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;


@Configuration
public class Client {

    @Value("elastic.search.host")
    private String host;
    @Value("elastic.search.port")
    private int port;

    @Bean
    public TransportClient getTransportClient() throws UnknownHostException {
        Settings settings = Settings.builder().build();
        TransportClient transportClient = new PreBuiltTransportClient(settings);
        transportClient.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(host), port));

        return transportClient;
    }

}