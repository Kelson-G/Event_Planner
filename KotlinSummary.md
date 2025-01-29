# Summary of Kotlin and JDK 23 Topics Discussed

## **1. Installing and Using JDK 23**

- JDK 23 is the latest version of the Java Development Kit, used for compiling and running Java (and JVM-based languages like Kotlin).
- **macOS does not come with Java preinstalled**, but you can install JDK 23 by:
  1. Downloading it from [https://jdk.java.net/23/](https://jdk.java.net/23/).
  2. Extracting the tarball and adding the JDK to your system PATH.

Example commands:

```bash
# Extract the downloaded tarball
tar -xvf openjdk-23*.tar.gz

# Add to PATH (temporary)
export PATH=$PATH:/path/to/jdk-23/bin
```

- Verify the installation:

```bash
java -version
```

---

## **2. Running Kotlin Programs with JDK 23**

### **Compile and Run Kotlin Files (`.kt`)**

1. **Compiling a Single File:**

   ```bash
   kotlinc helloworld.kt -include-runtime -d helloworld.jar
   ```

   - `-include-runtime`: Bundles the Kotlin runtime into the JAR file.
   - `-d helloworld.jar`: Specifies the output JAR file name.

2. **Running the Compiled File:**

   ```bash
   java -jar helloworld.jar
   ```

3. **Direct Execution of a Kotlin Script File (`.kts`):**

   ```bash
   kotlinc -script helloworld.kts
   ```

   Note: `.kts` files allow top-level statements and don't require a `main` function.

---

## **3. Why `main` Did Not Execute in `.kts` Files**

- In a `.kts` script, **top-level statements** are executed automatically. Functions (like `main`) are only executed if explicitly called.

### **Fix for Calling `main` in `.kts` Files**

Add a call to `main()` at the top level:

```kotlin
fun main() {
    println("Hello from main!")
}

main() // Explicitly call main
```

Run the script:

```bash
kotlinc -script helloworld.kts
```

### **Using Top-Level Statements Instead of `main`**

For scripts, you can avoid `main` entirely and use top-level statements:

```kotlin
println("Hello from Kotlin Script!")
```

---

## **4. Compiling and Running Multiple Kotlin Files**

When you have multiple interconnected `.kt` files (e.g., `Main.kt`, `Utils.kt`, `Data.kt`), compile them all together to resolve dependencies:

### **Example Folder Structure**

```bash
/myproject
  ├── Main.kt
  ├── Utils.kt
  ├── Data.kt
```

### **Compiling Multiple Files**

1. Compile all files together:

   ```bash
   kotlinc Main.kt Utils.kt Data.kt -include-runtime -d myproject.jar
   ```

2. Run the compiled JAR:

   ```bash
   java -jar myproject.jar
   ```

### **Compile All Files in a Directory**

Use a wildcard (`*.kt`) to compile all Kotlin files in the current folder:

```bash
kotlinc *.kt -include-runtime -d myproject.jar
```

---

## **5. Key Differences Between `.kt` and `.kts`**

| Feature                      | `.kt` File                   | `.kts` File                   |
|------------------------------|------------------------------|--------------------------------|
| **Requires `main` function?** | Yes, for execution.          | No, runs top-level statements.|
| **Top-level statements?**     | Not allowed.                 | Allowed, executed directly.   |
| **Compilation**               | Must be compiled before running. | Interpreted directly.         |

---

## **Command Summary**

### **Kotlin Compilation and Execution**

- **Compile a Kotlin file to a JAR:**

  ```bash
  kotlinc <file>.kt -include-runtime -d <output>.jar
  ```

- **Run the JAR file:**

  ```bash
  java -jar <output>.jar
  ```

- **Run a Kotlin Script (`.kts`) directly:**

  ```bash
  kotlinc -script <file>.kts
  ```

### **Compiling Multiple Kotlin Files**

- Compile multiple files:

  ```bash
  kotlinc file1.kt file2.kt -include-runtime -d output.jar
  ```

- Compile all files in a folder:

  ```bash
  kotlinc *.kt -include-runtime -d output.jar
  ```

---

## **Troubleshooting Tips**

- **Error: `could not find or load main class`**
  - This occurs if you try to run a `.kt` file with `java` directly. Compile it into a `.class` or `.jar` file first.

- **Error: `unrecognized script type` in `.kts`**
  - Ensure the file has the `.kts` extension. Kotlin Scripts (`.kts`) require this extension to be recognized.
