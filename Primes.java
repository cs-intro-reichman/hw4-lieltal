public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[] isPrimeArr;
        isPrimeArr = new boolean[n + 1];

        for(int i = 2; i <= n; i++) {
            isPrimeArr[i] = true;
        }

        int primeNumber = 2;
        while(primeNumber <= Math.sqrt(n)) {
            if(isPrimeArr[primeNumber]) {
                int multipleOfP = primeNumber * primeNumber;
                while(multipleOfP <= n) {
                    isPrimeArr[multipleOfP] = false;
                    multipleOfP+= primeNumber;
                }
            }
            primeNumber++;
        }

        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for(int i = 2; i <= n; i++) {
            if(isPrimeArr[i]) {
                count++;
                System.out.println(i);
            }
        }
        
        double percentage = (count * 100) / n;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percentage + "% are primes)");
    }
}