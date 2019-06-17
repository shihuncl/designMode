package prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * Created by cl on 2019/4/15.
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {

    public JinGuBang jinGuBang;

    public  QiTianDaSheng(){
        this.birthday=new Date();
        this.jinGuBang=new JinGuBang();
    }

    protected Object clone(){
        return  this.deepClone();
    }

    public Object deepClone(){
        try {
            //内存中完成操作，对象读写，是通过字节码直接操作
            //序列化操作类似
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream os=new ObjectOutputStream(bos);
            os.writeObject(this);

            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bis);

            QiTianDaSheng copy=(QiTianDaSheng)ois.readObject();
            copy.birthday=new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng=new QiTianDaSheng();
        qiTianDaSheng.height=target.height;
        qiTianDaSheng.weight=target.weight;
        qiTianDaSheng.jinGuBang=target.jinGuBang;
        qiTianDaSheng.birthday=new Date();
        return  qiTianDaSheng;

    }

}
