package template.course;

/**
 * Created by cl on 2019/6/19.
 */
public class NetWorkCourseTest {
    public static void main(String[] args) {
        System.out.println("Jvaa课程==========");
        NetworkCourse javaCourse=new JavaCourse();
        javaCourse.createCourse();
        System.out.println("大数据课程==========");
        NetworkCourse course=new BigDataCourse(true);
        course.createCourse();
    }
}
