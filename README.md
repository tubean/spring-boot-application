# spring-boot-application
Repository for Spring boot tutorials on https://tubean.github.io

#Prepare database
- Create table `user` following script:
```sql
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

```
- Config `datasource` in file `application.properties`

#Run
Execute class `MyspringcrudApplication`
#Image
Mange user:
![manage](https://res.cloudinary.com/deop9ytsv/image/upload/v1542364169/Screen_Shot_2018-11-16_at_5.09.53_PM.png)

Add user:
![add](https://res.cloudinary.com/deop9ytsv/image/upload/v1542364170/Screen_Shot_2018-11-16_at_5.10.15_PM.png)

Edit user:
![edit](https://res.cloudinary.com/deop9ytsv/image/upload/v1542364169/Screen_Shot_2018-11-16_at_5.10.05_PM.png)
