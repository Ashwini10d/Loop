class Loop1 {
    public static void main(String[] args) {

        // 1 to 100
        System.out.println("Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nNumbers from 100 to 1:");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nASCII characters from 0 to 127:");
        for (char ch = 0; ch <= 127; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nUppercase A to Z:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nLowercase a to z:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nDigits 0 to 9:");
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nUppercase Z to A (reverse):");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nLowercase z to a (reverse):");
        for (char ch = 'z'; ch >= 'a'; ch--) {
            System.out.print(ch + " ");
        }
    }
}
