# SpringMVC 核心机制学习实践

一个最小化的 **Spring MVC + Thymeleaf** 工程，用来理解 Spring MVC 的核心机制：前端控制器（DispatcherServlet）、处理器映射（`@RequestMapping`）、视图解析与页面渲染。

## 项目内容

```text
Spring-MVC_for_learn/
├─ pom.xml                                   # Maven（war 包，Java 11，Spring MVC 5.3.1 + Thymeleaf）
└─ src/main/
   ├─ java/com/itheima/controller/
   │  └─ FirstController.java                # 注解式控制器：/ 与 /hello
   ├─ resources/springMVC.xml                # Spring MVC 配置（注解驱动、视图解析器）
   └─ webapp/
      ├─ WEB-INF/web.xml                     # DispatcherServlet 注册与映射
      └─ WEB-INF/pages/                      # index.html / success.html 视图
```

## 学习要点

- **前端控制器模式**：所有请求先到 `DispatcherServlet`，由它分发给具体 Controller；
- **注解映射**：`@Controller` + `@RequestMapping` 将 URL 映射到方法；
- **视图解析**：配置 `InternalResourceViewResolver` 前缀/后缀，返回逻辑视图名；
- **配置驱动**：`web.xml` 注册 Servlet、`springMVC.xml` 装配组件。

## 本地运行

1. 构建 war：

```bash
mvn clean package
```

2. 将 `target/*.war` 部署到 Tomcat 9（Servlet 3.1，`javax.*` 命名空间）运行；
3. 访问：
   - `/` → `index` 页面
   - `/hello` → `success` 页面

> 注意：Spring MVC 5.x 使用 `javax.servlet`，需要 Tomcat 9 及以下版本；Tomcat 10+ 使用 `jakarta.*` 命名空间，直接部署会失败。

## 说明

本项目为 Spring MVC 学习实践工程，重点在"理解机制"而非业务功能；适合作为 Spring Boot 之前的基础补充。
