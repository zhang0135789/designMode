package com;


import com.network.Network;
import com.network.impl.RealNetwork;
import com.proxy.NetworkProxy;

/**
 * Hello world!
 * 一个代理对象来控制对另一个对象，再进而扩展一些额外功能。以网络访问为例子。
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 网络代理访问
        Network realNetwork = new RealNetwork("https://www.example.com");
        Network networkProxy = new NetworkProxy(realNetwork);
        networkProxy.browse();
    }

}
