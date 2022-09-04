# 关于AbaseCode
AbaseCode OpenCode是一套开源合集。包括基础包、工具包、安全包、token包、支付包、excel包等。

开源项目的组件做到开箱即用，方便更多的开发者节省重复的工作，更专注于业务逻辑代码编写。

我是Jon，一名全栈开发者，专注于学习和传播技术知识。希望这些工具包能够帮上你，欢迎有的朋友加入这个开源项目。

project homepage : https://abasecode.com

project github : https://github.com/abasecode

Jon's blog : https://jon.wiki

e-mail: ijonso123@gmail.com


# 关于 abasecode-base-code
abasecode-base-code 标准结果及异常处理包。

# 开始使用
## Step 1: 配置 pom.xml
``` xml
<dependency>
    <groupId>com.abasecode.opencode</groupId>
    <artifactId>abasecode-base-code</artifactId>
    <version>1.0.0</version>
</dependency>
```
## Step 2: 添加注解
``` java
@EnableCodeException
public class SpringBootApplication{
...
}
```
## Step 3: 完成！