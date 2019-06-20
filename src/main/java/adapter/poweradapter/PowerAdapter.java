package adapter.poweradapter;

/**
 * Created by cl on 2019/6/20.
 */
public class PowerAdapter implements DC5 {

    private  AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput=ac220.outputAC220V();
        int adapterOutput=adapterInput/44;
        System.out.println("使用转换"+adapterOutput);
        return adapterOutput;
    }

    public static void main(String[] args) {
        DC5 dc5=new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
