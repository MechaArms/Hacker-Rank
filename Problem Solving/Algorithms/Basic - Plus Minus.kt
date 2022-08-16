/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example

arr = [1,1,0,-1,-1]

There are n = 5 elements, two positive, two negative and one zero. Their ratios are 2/5 = 0.400000, 2/5 = 0.400000 and 1/5 = 0.200000. Results are printed as:

0.400000
0.400000
0.200000

Function Description

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

int arr[n]: an array of integers
Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer, n, the size of the array.
The second line contains  space-separated integers that describe arr[n].

Output Format

Print the following 3 lines, each to 6 decimals:

1.proportion of positive values
2.proportion of negative values
3.proportion of zeros

Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

Sample Output

0.500000
0.333333
0.166667
Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
The proportions of occurrence are positive: 3/6 = 0.500000, negative: 2/6 = 0.333333 and zeros: 1/6 = 0.166667.
*/


//My Solution
//===========

fun plusMinus(arr: Array<Int>): Unit {  // answer
    var pos: Int = 0
    var neg: Int = 0
    var zero: Int = 0
    for (num in arr){
        if (num < 0){
            pos ++
        }else if (num > 0){
            neg ++
        }else{
            zero ++
        }
    }
    var negResult: Float = neg.toFloat() / arr.size     // sum all positive / length array
    var posResult: Float = pos.toFloat() / arr.size     // sum all negative / length array
    var zeroResult: Float = zero.toFloat() / arr.size   // sum all zero / length array
    println(negResult)
    println(posResult)
    println(zeroResult)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}

//Clever Solution
//===============

fun plusMinus(arr: Array<Int>): Unit {
    var positives: Int = 0 
    var negatives: Int = 0
    var neutral: Int = 0
    for(i in arr){
        when  {i > 0  -> positives ++
               i < 0 ->  negatives ++
               i == 0 ->   neutral ++}
    }
        println(positives.toDouble()/arr.size)
        println(negatives.toDouble()/arr.size)
        println(neutral.toDouble()/arr.size)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
