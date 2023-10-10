## A- Character Class Solutions 

### Solution 1: Check if a character is a letter
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(isLetter('a')); // true
        System.out.println(isLetter('1')); // false
    }

    public static boolean isLetter(char c) {
        return Character.isLetter(c);
    }
}
```

### Solution 2: Check if a character is a digit
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(isDigit('1')); // true
        System.out.println(isDigit('a')); // false
    }

    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }
}
```

### Solution 3: Check if a character is a whitespace
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(isWhitespace(' ')); // true
        System.out.println(isWhitespace('a')); // false
    }

    public static boolean isWhitespace(char c) {
        return Character.isWhitespace(c);
    }
}
```

### Solution 4: Convert a character to uppercase
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(toUppercase('a')); // A
        System.out.println(toUppercase('A')); // A
    }

    public static char toUppercase(char c) {
        return Character.toUpperCase(c);
    }
}
```

### Solution 5: Convert a character to lowercase
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(toLowercase('A')); // a
        System.out.println(toLowercase('a')); // a
    }

    public static char toLowercase(char c) {
        return Character.toLowerCase(c);
    }
}
```

## B- String Class Solutions 

### Solution 1:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String result = input.toUpperCase();
    System.out.println(result);
  }
}
```

### Solution 2:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the content of the email:");
    String content = scanner.nextLine();
    System.out.println("Enter the word to be searched:");
    String wordToSearch = scanner.nextLine();
    int index = content.indexOf(wordToSearch);
    if (index != -1) {
      System.out.println("The word is found at index: " + index);
    } else {
      System.out.println("The word is not found in the content.");
    }
  }
}
```

### Solution 3:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String BridgeStatus = scanner.nextLine();
    System.out.println(isSafeBridge(BridgeStatus));
  }

  public static boolean isSafeBridge(String bridge) {
    return !bridge.contains(" ");
  }
}
```

### Solution 4:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String num1 = scanner.nextLine();
    String num2 = scanner.nextLine();
    String result = num1 + num2;
    System.out.println(result);
  }
}
```

### Solution 5:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    if (name.equals("Mike")) {
      System.out.println("Hello, Mike! You are my favorite student.");
    } else {
      System.out.println("Hello, " + name + "! You are one of my students.");
    }
  }
}
```
