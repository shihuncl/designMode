package prototype.deep;

/**
 * Created by cl on 2019/4/15.
 */
public class DeepCloneTest {

    public static void main(String[] args) {

        QiTianDaSheng qs=new QiTianDaSheng();
        QiTianDaSheng n=qs.shallowClone(qs);
        System.out.println(qs.jinGuBang==n.jinGuBang);


        QiTianDaSheng q=new QiTianDaSheng();
        QiTianDaSheng clone=(QiTianDaSheng)q.clone();
        System.out.println(q.jinGuBang==clone.jinGuBang);

    }

}
