### 集成 Spring Cloud Config

Server 端配置
* 添加依赖 @EnableConfigServer
* 配置文件:
    * server.port: 8888
    * spring.cloud.config.server.git.uri: 配置文件的 git 地址
    * spring.cloud.config.server.git.search-paths: 配置文件所在目录

Client 端配置, Spring Cloud Config Client 和普通的 Eureka Client 一样, 仅在配置文件上有区别
* spring.application.name: 应用名称
* spring.cloud.config.profile: 环境, 会加载 应用名称-环境.yml 的那个配置文件
* spring.cloud.config.uri: config server 地址