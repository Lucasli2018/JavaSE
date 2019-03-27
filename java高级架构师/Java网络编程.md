### Java网络编程

#### 计算机网络的概念

- 互联网：网络的网络
- ip地址：计算机在网络中的标识
- 网关：负责链接多个网络
- 协议：TCP/IP协议
- TCP协议：面向连接，可靠传输



#### TCP编程模型

- 客户端使用Socket(InetAddress,port)打开Socket
- 服务器端用ServerSocket监听端口
- 服务器端用accept接受连接并返回Socket
- 双方通过Socket打开InputStream/OutputStream读写数据
- flush()用于强制输出缓冲区



#### TCP多线程编程

- 服务器端使用无限循环
- 每次accept返回后，创建新的线程来处理客户端请求
- 每个客户端请求对应一个服务线程
- 使用线程池可以提到运行效率



#### UDP编程

- 客户端使用DatagramSocket.connect()指定远程地址和端口
- 服务器端用DatagramSocket(port)监听端口
- 双方通过receive/send读写数据
- 没有io流接口



#### Java发送Email

- 用maven引入javamail依赖
- 确定SMTP服务器信息：域名/端口/使用明文/SSL/TSL
- 调用相关API发送Email（无需关心底层TCP Socket连接）
- 设置debug模式可以查看通信详细内容（便于排查错误）



#### Java接收Email

- 用maven引入javamail依赖
- 确定POP3服务器信息：域名/端口/使用明文/SSL
- 调用相关API接收Email（无需关心底层TCP Socket连接）
- 设置debug模式可以查看通信详细内容（便于排查错误）



#### HTTP编程

- HTTP协议是一个基于TCP的请求/响应协议
- 广泛用于浏览器、手机app与服务器的数据交互
- Java提供了HttpURLConnection实现HTTP客户端



#### RMI远程调用

- RMI远程调用是针对Java语言的一种远程调用
- 远程接口必须继承自Remote
- 远程方法必须抛出RemoteException
- 客户端调用RMI方法和调用本地方法类似
- RMI方法调用被自动通过网络传输到服务器端
- 服务器端通过自动生成的stub类接收远程调用请求

