package hexlet.code;

public class RandomNumber {
    public static int random() {
        var a = 45;
        var c = 21;
        var m = 67;
        var seed = 50 * (Math.random() * 10);

        seed = (a * seed + c) % m;

        int seed1 = (int) seed;
        return seed1;
    }
}
