# ssh整合

1、创建一个web project  

2、把该工程的编码形式改成utf-8 

 3、把jsp的编码形式也改成utf-8  

4、导入相关的jar包  

       ① struts2  

       ② hibernate  

       ③ spring  

       ④ MySQLDriver   

 5、创建三个source folder     

              src    存放源代码

              config 存放配置文件(分三个包)  

                       |--spring       

                       |--hibernate        

                        |--struts   

           test  存放测试类

6、创建持久化类和映射文件

7、写spring的配置文件   

 config/spring/             

        applicationContext.xml           

       applicationContext-db.xml

8、在test创建一个包com.ruanzz.s2sh.test

9、在上面的包中创建一个类SessionFactoryTest,SpringUtils,对application.xml进行加载，写一个testSessionFactory类对sessionfactory进行测试。

10、创建dao层和service层的类和接口

11、写spring的声明式事务处理的配置和把dao层，service层所有的类放入到spring容器中

12、进行测试声明式事务处理

13、创建一个action

14、把action放入到spring容器中注意事项：scope="prototype"必须写，action是多例的1

5、测试action的创建

16、写struts2的配置文件

17、写web.xml文件
