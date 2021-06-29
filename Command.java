package com.zbh;

public class Command {
    private String commandWord;
    private String secondWord;

    //构造方法
    public Command(String firstWord, String secondWord){
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    //实例化
    public String getCommandWord(){
        return commandWord;
    }
    public String getSecondWord(){
        return secondWord;
    }

    /**
     *对命令是否正确进行判断
     *如果命令是空则返回true
     * 命令非空则返回false
     */
    public boolean isUnknown(){
        return (commandWord == null);
    }

    /**
     * 对命令是否有第二个单词进行判断
     */
    public boolean hasSecondWord(){
        return (secondWord != null);
    }


}
