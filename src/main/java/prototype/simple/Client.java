package prototype.simple;

/**
 * Created by cl on 2019/4/15.
 */
public class Client {

   /* private  ProtoType protoType;

    public Client(ProtoType protoType){
        this.protoType=protoType;
    }*/

    public ProtoType startClone(ProtoType concretePrototype) {
        return concretePrototype.clone();
    }
}
