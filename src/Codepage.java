public class Codepage extends Mainpage {


    private String frotnEndBaiscs = "'Front End - basic course'";
    private String trueDevOps = "'True DEVOPS - basic course'";
    private String javaAdvancedCourse = "'Java Advanced course'";
    private String androidDev = "'Development using Android'";
    private String iosDev = "'Development using IOS'";
    private String javaBaseCourse = "'Java Base course'";
    private String pythonDev = "'Development using Python'";
    private String webUI = "'WEB UI Adbanced'";

    private String expandSyllabus = "'Java Advanced syllabus'";
    private int counterGroups = 8;

    private String teacherTL = "'Volodumur Krohmalyk'";

    private String studentWork1 = "'Bee Brood Counter'";
    private String studentWork2 = "'Denoising dirty documents'";

    private String newsBlock1code = "'LITS supports young people'";
    private String newsBlock2code = "'Ruby conf in Misk'";

    private String blogBlock1code = "'HELPING OTHERS - IT'S NOT A LOST, BUT A WIN, Roman Shyvaruk'";
    private String blogBlock2code = "'Women developers -better than...'";


    public String getJavaAdvancedCourse() {
        return javaAdvancedCourse;
    }

    public String getExpandSyllabus() {
        return expandSyllabus;
    }

    public int getCounterGroups() {
        return counterGroups;
    }


    public void testCodePageItems(int a, int b){
        if (a == b) {
            System.out.println("Group check - test results: Passed");
        } else {
            System.out.println("Group check - test results: There some inconsistencies in 'Groups quantities'");
        }
    }

}