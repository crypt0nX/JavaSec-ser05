import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class example2 {
    public static void main(String[] args) throws Exception {
        InvocationHandler handler = new example1(new HashMap());

        Map proxyMap = (Map) Proxy.newProxyInstance(Map.class.getClassLoader(), new Class[]{Map.class}, handler);

        proxyMap.put("hello", "world");
        String result = (String) proxyMap.get("hello");
        System.out.println(result);

    }

}