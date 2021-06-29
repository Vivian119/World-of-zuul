package com.zbh;


public class CommandWords
{
    /**
     * 使用static与final将validCommands这个变量初始化
     * 并且不允许修改
     * 初始化的值为 go，quit，help
     */
    private static final String[] validCommands = {
            "go", "quit", "help"
    };

    //默认构造方法
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    //返回值为bool类型的方法来判断输入的是否符合要求
    public boolean isCommand(String aString)
    {
        //将aString与validCommands比较
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }

    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
