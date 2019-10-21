# springcloud_test
微服务搭建demo
忽略掉practice包下的代码，个人练习，并没什么卵用
maven版本使用的3.6.1，settings.xml的<profiles>标签配置如下
  <profile>
       <id>nexus</id> 
        <repositories>
            <repository>
                <id>nexus</id>
                <name>local private nexus</name>
                <url>http://maven.oschina.net/content/groups/public/</url>
                <releases>
                    <enabled>true</enabled>
                </releases>
                <snapshots>
                    <enabled>false</enabled>
                </snapshots>
            </repository>
        </repositories>
        
        <pluginRepositories>
            <pluginRepository>
            <id>nexus</id>
            <name>local private nexus</name>
            <url>http://maven.oschina.net/content/groups/public/</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
            </pluginRepository>
        </pluginRepositories>
    </profile>



此demo功能简单，只实现了服务间调用。So。。。。。。。
