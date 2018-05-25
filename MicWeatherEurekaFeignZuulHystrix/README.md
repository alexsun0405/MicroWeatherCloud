## 集成 Hystrix 断路器, 此项目是由 MicWeatherEurekaFeignZuul 改造而来, 接入断路器

实现步骤
* 修改 msa-weather-report-eureka 添加依赖 spring-cloud-starter-hystrix
* Main 类添加 @EnableCircuitBreaker 注解
* Feign 接口 DataClient 修改注解, 添加 fallback = DataClientFallBack.class 
* 创建 DataClientFallBack 类, 实现断路功能


