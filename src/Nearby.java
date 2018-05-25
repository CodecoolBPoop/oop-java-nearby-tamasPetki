class Nearby {

    private final int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    int[] nearby(int x, int y, int range) {
        int from = y-range;
        int to = y+range;

        if (from < 0) {
            from = 0;
        }

        if (to > multi[x].length-1) {
            to = multi[x].length-1;
        }

        int[] nearbyElements = new int[(to-from)];
        int counter = 0;

        for (int start = from; start <= to; start++) {
            if (start == y) {
                continue;
            }

            nearbyElements[counter] = multi[x][start];
            counter++;
        }

        return nearbyElements;

    }
}
