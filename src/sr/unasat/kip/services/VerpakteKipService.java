package sr.unasat.kip.services;

import sr.unasat.kip.entities.VerpakteKip;

public class VerpakteKipService {

    public static VerpakteKip[] sorteer(VerpakteKip[] verpakteKips) {
        int size = verpakteKips.length;
        for (int i = 1; i < size; ++i) {
            VerpakteKip key = verpakteKips[i];
            int j = i - 1;

            while (j >= 0 && verpakteKips[j].getLabelNumber() > key.getLabelNumber()) {

                verpakteKips[j + 1] = verpakteKips[j];
                j = j - 1;
            }
            verpakteKips[j + 1] = key;
        }
        return verpakteKips;
    }

    public static int zoek(VerpakteKip[] verpakteKips, int x) {
        int l = 0, r = verpakteKips.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (verpakteKips[m].getLabelNumber() == x)
                return m;

            if (verpakteKips[m].getLabelNumber() < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;
    }

    public void voegVerpakteKipToe() {

    }
}
