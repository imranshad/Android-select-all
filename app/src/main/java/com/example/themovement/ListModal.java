package com.example.themovement;

public class ListModal {
    private String id;
    private boolean checked;
    private String name;
    private String phone;

    public ListModal(boolean checked,String name,String phone){
        this.checked=checked;
        this.name=name;
        this.phone=phone;
    }
    public String getId(){
        return id;
    }

    public boolean getChecked(){
        return checked;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
