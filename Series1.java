class AlternateSeriesChar {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; ch <= 'Z'; i++) {
            System.out.print(ch + " ");
            ch += i + 1; // increase ch by (i + 1): 2, 3, 4, 5, ...
        }
    }
}
