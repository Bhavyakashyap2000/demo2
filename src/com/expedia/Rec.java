package com.expedia;

public class Rec {
    private int length;
    private int width;

    public Rec(int length,int width)
    {
        this.length = length;
        this.width = width;
    }
 public void setLength(int length){
        this.length = length;
}
 public int getLength()
{
    return length;
}
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth()
    {
        return width;
    }
    public int area()
    {
        return length*width;
    }
    public int perimeter()
    {
        return 2*(length+width);
    }
    public String toString(){
        return String.format("lenth- %d width- %d area- %d perimeter- %d",length,width,area(), perimeter());
    }
}
