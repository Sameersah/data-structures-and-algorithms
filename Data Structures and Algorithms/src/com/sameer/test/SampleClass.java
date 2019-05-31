package com.sameer.test;

public class SampleClass {
    int id;
    String name;

    public SampleClass(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        System.out.println("equals called");
        if(o!=null && o instanceof SampleClass){
            SampleClass obj = (SampleClass)o;
            if(this.id == obj.id){
                return true;
            }
        }
        return  false;
    }

    @Override
    public int hashCode(){
        System.out.println("hascode called.");
        return id;
    }


}


