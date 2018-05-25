## 集成 Feign 服务端负载均衡, 此项目是由 MicWeatherEureka 改造而来, 解决服务之间的依赖

Feign 主要解决了服务直接的依赖问题,并提供服务端的负载均衡
实现步骤:

* 引入 Feign 相关依赖 spring-cloud-starter-feign
* 加入 @EnableFeignClients 注解
* 创建接口, 添加 @FeignClient 注解. 
* 声明要调用的方法, 添加 @GetMapping("方法名") 注解
* 在需要用到的地方, 注入该接口即可.

以下三个项目,可以作为一个简单的 Feign 示例.

* msa-weather-eureka-server
* msa-weather-eureka-client-feign
* msa-weather-city-eureka



