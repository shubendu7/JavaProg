import java.util.*;

class Disarium {
    int num, size;

    Disarium(int nn) {
        num = nn;
        size = 0;
    }

    void countdigit() {
        int x = num;
        while (x > 0) {
            x /= 10;
            size++;
        }
    }

    int sumofdigits(int n, int p) {
        
        /*
        while (temp > 0) {
            int d = temp % 10;  // Extract the last digit
            sum += Math.pow(d, p--); // Raise it to its position power
            temp /= 10;  // Remove last digit
        }
        */
        if(n==0){
            return 0;
        }
        else
            return (int)Math.pow((n%10),p--)+sumofdigits(n/10,p);
        
    }

    void check() {
        if (sumofdigits(num, size) == num) {
            System.out.println("Disarium");
        } else {
            System.out.println("No Disarium");
        }
    }

    public static void main(String[] args) {  // Corrected method signature
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        Disarium ob = new Disarium(a);
        ob.countdigit();
        ob.check();
        sc.close();
    }
}
