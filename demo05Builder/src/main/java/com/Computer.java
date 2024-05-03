package com;

/**
 * @author: xupengboo
 * @date: 2024/1/25 13:59
 * @description: 产品类
 */
// 产品类 - Computer
public class Computer {

    private String CPU;

    private String memory;

    private String storage;

    private String graphicsCard;

    private String operatingSystem;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void showInfo() {
        System.out.println("Computer Info: CPU-" + CPU + ", Memory-" + memory +
                ", Storage-" + storage + ", Graphics Card-" + graphicsCard +
                ", OS-" + operatingSystem);
    }

}
