import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
public class example1 implements InvocationHandler{
    protected Map map;

    public example1(Map map){
        this.map = map;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().compareTo("get") == 0){
            System.out.println("Hook Method: " + method.getName());
            return "Hacked Object";
        }
        return method.invoke(this.map, args);
    }
}
