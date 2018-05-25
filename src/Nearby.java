class Nearby {

    private final int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    public int[] trimIfArrayIsShorterThanInput(int x, int y, int range) {
        int[] trimmedArray = new int[2];

        int counterFrom = y-range;
        int counterTo = y+range;

        if (counterFrom < 0) {
            counterFrom = 0;
        }

        if (counterTo > multi[x].length-1) {
            counterTo = multi[x].length-1;
        }

        trimmedArray[0] = counterFrom;
        trimmedArray[1] = counterTo;

        return trimmedArray;
    }

    public int[] nearbyElements(int x, int from, int to, int y) {
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
