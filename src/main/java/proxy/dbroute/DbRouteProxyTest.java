package proxy.dbroute;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cl on 2019/4/15.
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date=sdf.parse("2017/02/01");
            Order order=new Order();
            order.setCreateTime(date.getTime());
            //IOrderService orderService=new OrderServiceStaticProxy(new OrderService());
            IOrderService orderService=(IOrderService)new OrderServiceDynamicProxy().getInstace(new OrderService());
            orderService.createOrder(order);

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
