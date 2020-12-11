package com.tyb1222.es.client;

public class ElasticsearchConfiguration {
    private String[] hosts;
    private int port;
    private String userName;
    private String password;

    private ElasticsearchConfiguration (ElasticsearchConfigurationBuilder elasticsearchConfigurationBuilder){
        this.hosts = elasticsearchConfigurationBuilder.getHosts();
        this.port = elasticsearchConfigurationBuilder.getPort();
        this.userName = elasticsearchConfigurationBuilder.getUserName();
        this.password = elasticsearchConfigurationBuilder.getPassword();
    }

    public String[] getHosts() {
        return hosts;
    }

    public int getPort() {
        return port;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static class ElasticsearchConfigurationBuilder{
        private String[] hosts;
        private int port;
        private String userName;
        private String password;

        public String[] getHosts() {
            return hosts;
        }

        public int getPort() {
            return port;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

        public ElasticsearchConfigurationBuilder(String [] hosts , int port){
            this.hosts = hosts;
            this.port = port;
        }

        public ElasticsearchConfigurationBuilder userName(String userName){
            this.userName =  userName;
            return this;
        }

        public ElasticsearchConfigurationBuilder password(String password){
            this.password = password;
            return this;
        }


        public ElasticsearchConfiguration builder(){
            return new ElasticsearchConfiguration(this);
        }

    }

    public static void main(String[] args) {
        final String [] hosts = new String [] {"192.168.27.130"};
        final int port = 9200;
        ElasticsearchConfigurationBuilder elasticsearchConfigurationBuilder = new ElasticsearchConfigurationBuilder(hosts, port);
        ElasticsearchConfiguration elasticsearchConfiguration =
                                                        elasticsearchConfigurationBuilder.userName("")
                                                                .password("")
                                                                .builder();
        System.out.println(elasticsearchConfiguration.port);

    }
}
