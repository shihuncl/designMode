package template.course;

/**
 * Created by cl on 2019/6/19.
 */
public abstract  class NetworkCourse {
    
    protected  final void createCourse(){
        //发布预习资料
        this.postPreResource();
        //创建PPT
        this.createPPT();
        this.liveVideo();
        this.postNote();
        this.postSource();
        if(needHomework()){
            checkHomework();
        }
        
    }

     abstract void checkHomework();

    //钩子方法
    protected boolean needHomework() {
        return  false;
    }

    final void postSource() {
        System.out.println("提交源码");
    }

    final void postNote() {
        System.out.println("提交笔记");
    }

    final void liveVideo() {
        System.out.println("直播");
    }


    final void createPPT() {
        System.out.println("创建PPT");
    }

    final void postPreResource() {
        System.out.println("发布预习资料");
    }
}
