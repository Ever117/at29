public class Mainpage {

    private String url = "http://lits.ua/";
    private String becomeAStudent = "'Become a student'";
    private String dropDownGroupMenu = "'Group menu'";
    //private String dropDownGroupMenuTown = "'Town select menu'";
    private String codeSchoolGroup = "'Code School group'";
    private String qaSchoolGroup = "'QA School group'";
    private String newsBlock1 = "'Alfa Bank loans'";
    private String newsBlock2 = "'Workshop: 3d visualization'";
    private String blogBlock1 = "'LITS Mother'";
    private String blogBlock2 = "'Professional burnout by Natalia Tulka'";



    public String getBecomeAStudent() {
        return becomeAStudent;
    }
    public String getDropDownGroupMenu() {
        return dropDownGroupMenu;
    }
    public String getCodeSchoolGroup() {
        return codeSchoolGroup;
    }
    public String getQaSchoolGroup() {
        return qaSchoolGroup;
    }


    public void openUrl(){
        System.out.println("Open Url - " + url);
    }


    public void click(String Button) {
        System.out.println("Click to: " + Button);
    }

    public void expandDropdownMenu(String Menu) {
        System.out.println("Click to expand and choose from " + Menu);
    }

    public void chooseGroup(String Group) {
        System.out.println("You are choosing: " + Group);
    }
}