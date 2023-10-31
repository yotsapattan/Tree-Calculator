# TreeCalculator - Source Code

This repository contains Java source code for a `TreeCalculator` class that performs various operations on binary trees.

## Table of Contents

1. [Introduction](#introduction)
2. [Usage](#usage)
3. [How to Test](#how-to-test)
4. [Example Usage](#example-usage)
5. [Contributing](#contributing)
6. [License](#license)

## Introduction

The `TreeCalculator` class provides methods to perform the following operations on binary trees:

- Finding the maximum value
- Finding the minimum value
- Calculating the sum of all nodes
- Calculating the average value

## Usage

To use the `TreeCalculator` class, you need to have the following:

1. **Java Environment**: Ensure you have a Java runtime environment installed on your system.

2. **Node Class**: The `Node` class is required for representing nodes in the binary tree. Make sure you have this class defined in your project.

3. **Incorporating TreeCalculator**: Include the `TreeCalculator` class in your project.

## How to Test

To test the `TreeCalculator` class, you can use the provided `TreeCalculatorTester` class. This class contains sample trees and methods to test various functionalities of the `TreeCalculator` class.

## Example Usage

```java
public class MyApplication {
    public static void main(String[] args) {
        // Initialize trees or create your own binary tree with Node objects
        TreeCalculatorTester.initTrees();
        
        // Test regular functionalities (findMax, findMin)
        TreeCalculatorTester.testRegular();
        
        // Test bonus functionalities (sumTree, avgTree)
        TreeCalculatorTester.testBonus();
    }
}
```

## Contributing

If you find any issues or have suggestions for improvement, please feel free to open an issue or create a pull request.

## License

This source code is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
