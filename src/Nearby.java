public class Nearby {

    int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    public int[] nearby(int x, int y, int range) {
    int[] nearbyElements = new int[range*2];
    int counter = 0;

    for (int start = y-range; start <= y+range; start++) {
        if (start == y) {
            continue;
        };

        nearbyElements[counter] = multi[x][start];
        counter++;
    };

    return nearbyElements;

    }
}
