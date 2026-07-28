package com.mohcine.pcmanager.core.system;

import java.io.File;

public class DiskInfo {

    private final File disk;

    public DiskInfo() {
        disk = new File("C:\\");
    }


    public long getTotalSpaceGB() {

        return disk.getTotalSpace() / (1024 * 1024 * 1024);

    }


    public long getFreeSpaceGB() {

        return disk.getFreeSpace() / (1024 * 1024 * 1024);

    }


    public double getFreeDiskPercentage() {

        return (disk.getFreeSpace() * 100.0) / disk.getTotalSpace();

    }
    public double getUsedDiskPercentage() {
        return 100.0 - getFreeDiskPercentage();
}    

}
