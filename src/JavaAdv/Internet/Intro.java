package JavaAdv.Internet;

/**
 * @author asus1
 * @create 2020/11/30 17:29
 * 网络模型、通信协议、Ip地址、端口号、常用命令
 * 网络编程：在一定协议下，实现两台计算机通讯
 * 网络分层模型：
 *      1，应用层（HTTP，FTP，SMTP，SNMP）
 *      2，传输层（TCP，UDP）
 *      3，网络层（ICMP，IGMP，IP，ARP，RARP）:用于对传输数据分组，将分组数据发送到目标计算机或者网络；
 *      4,5, 数据链路层，物理层（由底层网络定义的协议)
 * 网络通信协议：
 *      UDP：(User Datagram Protocol):无连接，资源消耗小，通信效率高，不能保证数据完整性。数据被限制在64kb以内；
 *                                    数据报Datagram是网络传输的基本单位。
 *      TCP/IP：(Transformation Control Protocol/JavaAdv.Internet Protocol)传输控制协议/因特网互连协议.
 *              面向连接，提供无差错，可靠的数据连接。
 *              客户端与服务器端请求，连接需要经历“三次握手”,三次交互保证连接的可靠性
 *                  1，客户端向服务器端发出连接请求，等待服务器确认；
 *                  2，服务器端向客户端回送一个响应，通知客户端收到了连接请求；
 *                  3，客户端再次向服务器端发送确认信息，确认连接。
 * IP地址：
 *      IPV4：4个字节，32位二进制；A 0-127；B 128-191；C 191-223；D 224-239；E 240-255；
 *      IPV6:16个字节，8组 ；
 * 常用命令：
 *      ipconfig：查看ip地址；
 *      ping：查看是否连通；
 * 端口号：是一个逻辑端口，操作系统为软件分配端口号（或软件请求），由两个字节组成，范围在65535之前
 *        1024前端口号已经分配给已知网络软件；端口号不能重复。
 *        使用IP地址+端口号，将数据准确传输到指定软件上
 *        常用端口：80网络端口；3306：mysql； 1521：Oracle；8080：Tomcat。
 */
public class Intro {
    public static void main(String[] args) {
        System.out.println("okk");
    }
}
