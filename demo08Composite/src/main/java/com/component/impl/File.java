package com.component.impl;


import com.component.FileSystemComponent;

/**
 * @author: xupengboo
 * @date: 2024/2/18 15:15
 * @description: 文件类
 */
// 叶子类
public class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("File：" + name);
    }

}
