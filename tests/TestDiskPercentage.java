import com.mohcine.pcmanager.core.system.DiskInfo;

public class TestDiskPercentage {

    public static void main(String[] args) {

        DiskInfo disk = new DiskInfo();

        System.out.println("----- DISCO -----");

        System.out.println(
            "Espacio total: "
            + disk.getTotalDiskGB()
            + " GB"
        );

        System.out.println(
            "Espacio libre: "
            + disk.getFreeDiskGB()
            + " GB"
        );

        System.out.println(
            "Porcentaje libre: "
            + disk.getFreeDiskPercentage()
            + "%"
        );

    }
}