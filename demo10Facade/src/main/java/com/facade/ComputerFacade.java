package com.facade;


import com.subsystem.CPU;
import com.subsystem.HardDrive;
import com.subsystem.Memory;

/**
 * @author: xupengboo
 * @date: 2024/2/18 16:43
 * @description: 电脑外观类
 */
// 外观类
public class ComputerFacade {

    private CPU cpu;

    private Memory memory;

    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load();
        hardDrive.read();
        cpu.jump();
        cpu.execute();
    }

}
