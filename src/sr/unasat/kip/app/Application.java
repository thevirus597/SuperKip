package sr.unasat.kip.app;

import sr.unasat.kip.entities.VerpakteKip;
import sr.unasat.kip.services.VerpakteKipService;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        VerpakteKip[] opgeslagenVK = new VerpakteKip[15];

        opgeslagenVK[0] = new VerpakteKip(6, 2, LocalDate.of(2020, 9, 1));
        opgeslagenVK[1] = new VerpakteKip(10, 3, LocalDate.of(2020, 9, 2));
        opgeslagenVK[2] = new VerpakteKip(2, 5, LocalDate.of(2020, 9, 3));
        opgeslagenVK[3] = new VerpakteKip(4, 7.5, LocalDate.of(2020, 9, 4));
        opgeslagenVK[4] = new VerpakteKip(9, 2, LocalDate.of(2020, 9, 5));
        opgeslagenVK[5] = new VerpakteKip(1, 1, LocalDate.of(2020, 9, 6));
        opgeslagenVK[6] = new VerpakteKip(5, 1, LocalDate.of(2020, 9, 7));
        opgeslagenVK[7] = new VerpakteKip(3, 1.2, LocalDate.of(2020, 9, 8));
        opgeslagenVK[8] = new VerpakteKip(22, 1.9, LocalDate.of(2020, 9, 9));
        opgeslagenVK[9] = new VerpakteKip(8, 2.5, LocalDate.of(2020, 9, 10));
        opgeslagenVK[10] = new VerpakteKip(35, 2, LocalDate.of(2020, 9, 11));
        opgeslagenVK[11] = new VerpakteKip(23, 2, LocalDate.of(2020, 9, 12));
        opgeslagenVK[12] = new VerpakteKip(25, 3, LocalDate.of(2020, 9, 13));
        opgeslagenVK[13] = new VerpakteKip(55, 1, LocalDate.of(2020, 9, 14));
        opgeslagenVK[14] = new VerpakteKip(7, 2.2, LocalDate.of(2020, 9, 15));
        printVerpakteKips(opgeslagenVK);

        VerpakteKipService.sorteer(opgeslagenVK);
        System.out.println("---");
        System.out.println("Sorteren");
        System.out.println("---");

        printVerpakteKips(opgeslagenVK);

        System.out.println("---");
        System.out.println("Zoeken");
        System.out.println("---");


        int result = VerpakteKipService.zoek(opgeslagenVK, 5);
        if (result == -1) {
            System.out.println("LabelNumber not present");
        } else {
            System.out.println("LabelNumber found at index " + result);
        }
    }

    public static void printVerpakteKips(VerpakteKip[] verpakteKips) {
        for (VerpakteKip verpakteKip : verpakteKips) {
            System.out.println(verpakteKip);
        }
    }

    ;
}