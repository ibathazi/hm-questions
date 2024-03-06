public class Question1 {


        public static void main(String[] args) {
            System.out.println(findOccurrences(24, 100));
        }
    
        // mt = multiplication table
        public static int findOccurrences(int mt, int valueInTable) {
            System.out.println("multiplication table - N: " + mt +"| value to find in table - X: " + valueInTable);
            int count = 0;
            for (int i = 1; i <= mt; i++) {
                if (valueInTable % i == 0 && valueInTable / i <= mt) {
                    count++;
                }
            }
            return count;
        }
    
}

     