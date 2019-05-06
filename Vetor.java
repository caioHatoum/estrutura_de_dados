package com.company;


import java.lang.StringBuilder;
import java.util.Arrays;

public class Vetor {
    private String[] elements;
    private int len;

    public Vetor(int cap) {
        this.elements = new String[cap];
        this.len = len;
    }

    public int getLen() {
        return this.len;
    }

    public boolean setElements(String element) {
        if (this.len<this.elements.length){
        this.elements[this.len] = element ;
        this.len++;
    }
        return false;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i=0;i<this.len-1;i++){
           s.append(this.elements[i]);
           s.append(", ");
        }
        if(this.len>0){
            s.append(this.elements[this.len-1]);

        }
        s.append("]");

        return s.toString();
    }
    /* public void setElements(String element) {
        for(int i = 0;i<this.elements.length;i++){
            if (this.elements[i]==null){
                this.elements[i] = element;
                break;
            }
        }

    }*/
}
