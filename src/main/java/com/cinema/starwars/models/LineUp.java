package com.cinema.starwars.models;

import java.util.ArrayList;
import java.util.List;

public class LineUp {

    private String next;

    public LineUp() {
    }

    public String getNext(){
        return this.next;
    }

    public String getNextPage() {
        String page = new String();
        if (this.next != null) {
            String[] removeSlash = this.next.split("/");
            page = removeSlash[removeSlash.length - 1] ;
        }
        return page;
    }


    @Override
    public String toString() {
        return "LineUp{" +
                "next='" + next + '\'' +
                '}';
    }
}
