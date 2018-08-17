Java 网络编程

java.net包两种常见的网络协议TCP和UDP

两个主题
Socket 编程
URL 处理

Socket 编程 

---

- Socket编程步骤
	- 服务器实例化ServerSocket对象，指定监听端口/bind()/connet()
	- 服务器ServerSocket调用accept()等待客户端访问
	- 客户端实例化Socket对象，指定要访问的民服务器名称和端口
	- Socket类的构造函数试图将客户端连接到指定的服务器和端口号
	- 在服务器端，accept()方法返回服务器上一个新的socket引用，该socket连接到客户端的socket
- 连接建立后，通过使用I/O流在进行通信。每一个socket都有一个输出流和一个输入流。客户端的输出流连接到服务器端的输入流，而客户端的输入流连接到服务器端的输出流。 

```
1. Socket   socket = new Socket("192.168.1.2", 1234);
2. socket.bind(new InetSocketAddress("localhost",  1234));
```

---

## Socket方法

- 分为2大类，一类是IP的自身信息获取，一类是通信需要的Socket网络编程基础

---

## Socket网络UDP套接字

- 当编码UDP连接时，使用以下两个类。
- DatagramPacket类表示UDP数据报。
- DatagramSocket类表示用于发送或接收数据报包的UDP套接字。
- [UDP网络多播](https://www.w3cschool.cn/java/java-network-udp-multicast.html)