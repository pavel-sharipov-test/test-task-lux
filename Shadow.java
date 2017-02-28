package com.sharipov;

/**
 * Created by pavel on 28.02.2017.
 */
public class Shadow {
    private Integer begin;
    private Integer end;

    public Shadow(Integer begin, Integer end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Shadow{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public Integer getBegin() {

        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
}
