package template.course;

/**
 * Created by cl on 2019/6/19.
 */
public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag=true;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查大数据作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
