package com.tyb1222.es.client;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.tyb1222.es.client.ElasticsearchConfiguration.ElasticsearchConfigurationBuilder;

public class RestHighLevelClientFactoryBean implements FactoryBean<RestHighLevelClient>, InitializingBean, DisposableBean {

    public static final Logger LOGGER = LoggerFactory.getLogger(RestHighLevelClientFactoryBean.class);

    private RestHighLevelClient restHighLevelClient;

    @Override
    public void destroy() {
        try {
            if (restHighLevelClient != null) {
                restHighLevelClient.close();
            }
        }catch (IOException ex){
            LOGGER.error("关闭restHighLevelClient 异常 :{}",ex);
        }
    }

    @Override
    public RestHighLevelClient getObject() throws Exception {
        return restHighLevelClient;
    }

    @Override
    public Class<?> getObjectType() {
        return RestHighLevelClient.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //TODO 从配置文件读取ES 节点与端口号等信息
        final String [] hosts = new String [] {"192.168.27.130"};
        final int port = 9200;
        final String userName = "";
        final String password = "";
        ElasticsearchConfigurationBuilder esConfigurationBuilder =
                                                            new ElasticsearchConfigurationBuilder(hosts, port);
        ElasticsearchConfiguration esConfiguration = esConfigurationBuilder.userName(userName).password(password).builder();
        final String schema = "http";
        List<HttpHost> httpHosts = new ArrayList<>();
        for (String host : esConfiguration.getHosts()) {
            httpHosts.add(new HttpHost(host,port,schema));
        }
        HttpHost [] serverHosts = httpHosts.stream().toArray(HttpHost[]::new);
        RestClientBuilder restClientBuilder = RestClient.builder(serverHosts);
        restHighLevelClient = new RestHighLevelClient(restClientBuilder);
    }


    public static void main(String[] args) {


    }
}
