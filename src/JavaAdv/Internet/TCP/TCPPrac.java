package JavaAdv.Internet.TCP;

/**
 * @author asus1
 * @create 2020/12/2 12:35
 * 文件上传案例：
 *      客户端读取本地文件，把文件上传到服务器，服务器把上传的文件保存到服务器的硬盘上；
 * 步骤：
 *     1，客户端使用本地字节输入流读取上传文件。
 *     2，客户端使用网络字节输出流，将读取文件上传到服务器。
 *     3，服务器使用网络字节输入流，读取客户端上传的文件。
 *     4，服务器使用本地字节输出流，把读取到文件保存到服务器硬盘。
 *     5，服务器使用网络字节输出流，给客户端回写提示信息。
 *     6，客户端使用网络字节输入流，读取服务器回写数据。
 *     7，释放资源。
 * 注意事项：
 *     1，客户端与服务器与本地硬盘读写，需要使用本地流；
 *     2，客户端与服务器之间进行读写，必须使用Socket中的网络流；
 *     3，文件上传需明确数据源于数据目的地。
 */
public class TCPPrac {

}