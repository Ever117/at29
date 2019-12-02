public class Main {

    public static void main(String[] args) {

        Mainpage clickToHomePage = new Mainpage();
        clickToHomePage.openUrl();
//clickToHomePage.click(clickToHomePage.getBecomeAStudent());
//clickToHomePage.chooseGroup(clickToHomePage.getQaSchoolGroup());

        Mainpage expandGroupMenu = new Mainpage();
        expandGroupMenu.expandDropdownMenu(expandGroupMenu.getDropDownGroupMenu());

        Mainpage choseGroup = new Mainpage();
        choseGroup.chooseGroup(choseGroup.getCodeSchoolGroup());

        Codepage clickToJavaAdv = new Codepage();
        clickToJavaAdv.click(clickToJavaAdv.getJavaAdvancedCourse());
        clickToJavaAdv.expandDropdownMenu(clickToJavaAdv.getExpandSyllabus());

//Check Group counter
        clickToJavaAdv.testCodePageItems(clickToJavaAdv.getCounterGroups(), 9);

    }
}