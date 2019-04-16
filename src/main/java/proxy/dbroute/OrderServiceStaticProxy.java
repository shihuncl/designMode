package proxy.dbroute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cl on 2019/4/15.
 */
public class OrderServiceStaticProxy implements IOrderService{

    private SimpleDateFormat yearFormat=new SimpleDateFormat("yyyy");

    private  IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService=orderService;
    }

    @Override
    public int createOrder(Order order) {
        Long time=order.getCreateTime();
        Integer dbRouter=Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到"+dbRouter);
        DynamicDataSourceEntiy.set(dbRouter);
        this.orderService.createOrder(order);
        return 0;
    }
}
