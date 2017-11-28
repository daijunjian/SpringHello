项目结构：web工程、service工程提供dubbo接口、client工程
项目技术：spring dubbo
项目入口：http://localhost:8080/
web工程没有调用service工程中的dubbo接口
本项目是一个标准的spring项目，主要用来查看spring源码和dubbo源码，包括jdk代理、cglib代理
如果想生成代理类，需要在jvm参数中配置如下参数：
    /* jdk动态代理 设置此系统属性,让JVM生成的Proxy类写入文件.保存路径为：com/sun/proxy(如果不存在请手工创建) */
    -Dsun.misc.ProxyGenerator.saveGeneratedFiles=true
    /* cglib动态代理 设置此系统属性,让JVM生成的Proxy类写入文件.保存路径为：com/sun/proxy(如果不存在请手工创建) */
    -Dcglib.debugLocation=D:\\\\code
    jdk代理类，格式：$Proxy11.class
    cglib代理类，格式：BeanService$$EnhancerBySpringCGLIB$$88391dcb.class

    非模块项目，也就是单独项目中，jdk生成代理类，项目启动会报错
    Exception in thread "main" java.lang.InternalError: I/O exception saving generated file: java.io.FileNotFoundException: com\sun\proxy\$Proxy0.class (系统找不到指定的路径。)