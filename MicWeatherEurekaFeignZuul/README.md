## 集成 Zuul API网关, 此项目是由 MicWeatherEurekaFeign 改造而来, 把接口聚合在一起

API 网关所带来的的好处
* 避免将内部信息泄露给外部
* 为应用提供统一的入口
* 为微服务提供额外的安全层
* 支持混合通信协议
* 降低构建微服务的复杂性 (????不懂)
* 微服务模拟与虚拟化

API 网关的弊端
* 在架构上需要额外考虑更多编排与管理
* 路由逻辑配置要统一的管理
* 可能引发单点故障

实现 API 网关的几种方式
* nginx
* Spring Cloud Zuul 
* Kong

Zuul 提供的功能
* 认证
* 鉴权 
* 限流 
* 动态路由 
* 监控 
* 弹性 
* 安全 
* 负载均衡 
* 协助单点压测 
* 静态响应

 Zuul 主要解决了接口地址分散的问题
实现步骤:

* 引入 Zuul 相关依赖 spring-cloud-starter-zuul
* 加入 @EnableZuulProxy 注解
* 编写配置文件
    * zuul.routes.名称.path 要转发的访问路径
    * zuul.routes.名称.serviceId 要转发给那个应用的应用名称
    
修改 msa-weather-report-eureka 项目, 新建 msa-weather-eureka-client-zuul 让其不依赖其他微服务, 而依赖网关转发请求.



