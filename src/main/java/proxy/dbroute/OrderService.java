package proxy.dbroute;

/**
 * Created by cl on 2019/4/15.
 */
public class OrderService implements IOrderService {

    private  OrderDao orderDao;

    public  OrderService(){
        orderDao=new OrderDao();
    }
    @Override
    public int createOrder(Order order) {
        System.out.println("Orderservice调用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
