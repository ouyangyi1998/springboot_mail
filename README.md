# springboot_邮件发送
- 在maven中导入spring-boot-starter-mail与spring-content-support的包
- 构造Mail实体类包括，sender发送者，receiver接收者，subject主题，text内容
- 在controller中，@Autowired JavaMailSender
  - 注入 @RequestBody Mail实体
  - 构造SimpleMailMessage，把Mail的四个类变量注入 mailSender.send(mailMessage)发送。。。
- 在qq邮箱要开启开启POP3/SMTP服务，并且使用授权码替换密码进行发送。spring.mail.host=stmp.qq.com
