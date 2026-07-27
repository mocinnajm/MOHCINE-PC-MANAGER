import com.mohcine.pcmanager.core.system.MemoryInfo;

public class TestMemoryPercentage {

    public static void main(String[] args) {

        MemoryInfo memory = new MemoryInfo();

        System.out.println("----- MEMORIA -----");

        System.out.println(
            "Porcentaje usado: "
            + memory.getUsedMemoryPercentage()
            + "%"
);

        System.out.println(
            "Porcentaje libre: "
            + memory.getFreeMemoryPercentage()
            + "%"
);
    }
}