# Insertion Sort Analysis
In this assignment, I extended the functionality of a Timer class and analyzed the performance of the Insertion Sort algorithm across various types of arrays. This involved implementing crucial methods in the Timer class to support precise time measurements and conducting a comprehensive benchmark to understand how different array conditions affect the efficiency of Insertion Sort.

## Timer Class Usage
I used three methods in the Timer class: `repeat()`, `getClock()`, and `toMillisecs()`. These methods were designed to offer refined control and accuracy in measuring execution time for sorting algorithms, thereby facilitating a reliable benchmarking process.

- `repeat()`: Executes a specified task repeatedly, allowing for an averaged time measurement over multiple runs. This method is crucial for reducing noise in the timing data.
- `getClock()`: Retrieves the current time in a high-resolution format, ensuring that timing measurements are as precise as possible.
- `toMillisecs()`: Converts the high-resolution time obtained from getClock() into milliseconds, standardizing the time measurements for easier interpretation and comparison.

### Both BenchmarkTest and TimerTest were utilized to validate the correctness of these implementations, with all tests passing successfully.

## Insertion Sort Implementation and Analysis

The core of this assignment was to implement the Insertion Sort algorithm and evaluate its performance across four types of arrays: Sorted, Partially-sorted, Random, and Reverse-sorted. Each array type presents a different challenge, thereby offering insights into the algorithm's adaptability and efficiency under varying conditions.

## Implementation Details: 
The Insertion Sort algorithm was coded within the `Insertion.sort()` method, leveraging a `helper.swap` function to facilitate element swapping. This implementation was rigorously tested to ensure accuracy and reliability.

### Performance Benchmarking: 

The main program, BenchMarkDriver.java, was crafted to run the Insertion Sort algorithm across the four specified array types, meticulously recording the time taken for each. This process was repeated multiple times for arrays of varying lengths, and the average times were computed to ensure statistical significance.

### Observations and Conclusions
The benchmarking exercise revealed distinct performance characteristics of the Insertion Sort algorithm across the different array conditions:

1. Sorted Arrays: Demonstrated the highest efficiency, with minimal time required for sorting due to the already ordered elements.
2. Partially-sorted Arrays: Showed slightly reduced efficiency compared to fully sorted arrays, indicating the algorithm's sensitivity to pre-existing order within the dataset.
3. Random Arrays: Required more time to sort compared to sorted and partially-sorted arrays, reflecting the algorithm's average case scenario.
4. Reverse-sorted Arrays: Exhibited the lowest efficiency, as the completely inverted order necessitated the maximum number of element comparisons and swaps.

>The detailed analysis highlighted the Insertion Sort algorithm's performance nuances, providing valuable insights into its operational efficiency and potential applications. This investigation not only fulfilled the assignment's objectives but also laid a solid foundation for further explorations into sorting algorithm optimizations.
