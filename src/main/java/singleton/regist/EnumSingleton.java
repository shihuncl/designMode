package singleton.regist;

/**
 * Created by cl on 2019/3/24.
 *
 * 枚举式单例（解决序列化，反射侵入）
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public  static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
