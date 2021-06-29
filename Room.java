package com.zbh;

import java.util.Set;
import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits;  //定义一个哈希表

    //构造方法
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>(); //创建一个哈希表，变量名为exits
    }

    //为每个地点设置出口
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    //在控制台界面上显示位置的两种不同方法
    public String getShortDescription()
    {
        return description;
    }
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    //该方法目的是得到出口的位置并用string类型返回显示出来
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}



