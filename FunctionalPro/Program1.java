package FunctionalPro;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;

public class Program1 {
    public static void main(String[] args) {
        Consumer<Integer> evenOdd = num -> {
            if (num % 2 == 0)
                System.out.println(num + " is Even");
            else
                System.out.println(num + " is Odd");
        };

        evenOdd.accept(5);




//Ascii
    Consumer<String> ascii = str -> {
    for (char ch : str.toCharArray()) {
        System.out.println(ch + " = " + (int) ch);
    }
    };

    ascii.accept("Ajay");



//sum
    Consumer<Integer> sumDigits = num -> {
    int sum = 0;
    while (num != 0) {
        sum += num % 10;
        num /= 10;
    }
    System.out.println("Sum of digits = " + sum);
     };

     sumDigits.accept(1234);


//factoral
    Consumer<Integer> factorial = num -> {
    int fact = 1;
    for (int i = 1; i <= num; i++) {
        fact *= i;
    }
    System.out.println("Factorial = " + fact);
     };

      factorial.accept(5);

//triangle
    Consumer<int[]> triangle = angles -> {
    int sum = angles[0] + angles[1] + angles[2];
    if (sum == 180)
        System.out.println("Valid Triangle");
    else
        System.out.println("Invalid Triangle");
    };
    triangle.accept(new int[]{60, 60, 60});

//Supplier 
    Supplier<Double> circleArea = () -> {
        int r = 5;
        return Math.PI * r * r;
    };
    System.out.println("Circle Area = " + circleArea.get());

    


    Supplier<String> nameSupplier = () -> "Ajay Anerao";
    System.out.println(nameSupplier.get());


    Supplier<Long> timeSupplier = () -> System.currentTimeMillis();
    System.out.println("Current Time = " + timeSupplier.get());

    Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
    System.out.println("Random Number = " + randomSupplier.get());



//Function
    int num=1234;
    Function<Integer, Integer>getLastDigit=(i) -> {
        return i%10;
    
    };
    Function<Integer,Integer>getLastDigit1=i -> i %10;
    System.out.println(getLastDigit.apply(num));
    System.out.println(getLastDigit1.apply(num));



//secondLastDigit
    Function<Integer, Integer> secondLastDigit = n -> (n / 10) % 10;
    System.out.println(secondLastDigit.apply(1234));


//FirstDigit
    Function<Integer, Integer> firstDigit = n -> {
    while (n >= 10) {
        n /= 10;
    }
    return n;
    };

   System.out.println(firstDigit.apply(1234));



//Sum
Function<Integer, Integer> sumOfDigits = n -> {
    int sum = 0;
    while (n != 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
};

System.out.println(sumOfDigits.apply(1234));


//Average
Function<Integer, Double> avgOfDigits = i -> {
    
    int sum = 0, count = 0;

    while (i != 0) {
        sum += i % 10;
        count++;
        i /= 10;
    }

    return count == 0 ? 0 : (double) sum / count;
};

System.out.println(avgOfDigits.apply(1234));


//Predicate 
Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    System.out.println(isPrime.test(7));

//Number even
Predicate<Integer> isEven = n -> {
    if(n%2==0){
        return true;
    }
        return false;
};
    
System.out.println("This number is Even"+isEven.test(4));


//Number odd
Predicate<Integer> isOdd = n -> {
    if(n%2!=0){
        return true;
    }
        return false;
};
    
System.out.println("This number is odd"+isEven.test(4));

//leapyear
 Predicate<Integer> isLeapYear = year -> 
        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int year = 2024;

        if (isLeapYear.test(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

//check vowel
  Predicate<Character> isVowel = ch ->
                "AEIOUaeiou".indexOf(ch) != -1;

        char ch = 'A';

        if (isVowel.test(ch)) {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is NOT a Vowel");
        }

//alphabet
    Predicate<Character> isAlphabet = cha ->
                (cha >= 'A' && cha <= 'Z') || (cha >= 'a' && cha <= 'z');

        char cha = 'g';

        if (isAlphabet.test(cha)) {
            System.out.println(cha + " is an Alphabet");
        } else {
            System.out.println(cha + " is NOT an Alphabet");
        }











    }

 


 

}