package com.company;

public class VW extends German {

    private String nameModel;

    public void NameModelConstructor() {}

        public void NameModelConstructor(String nameModel) {
            this.nameModel = nameModel;
        }


    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }


}
