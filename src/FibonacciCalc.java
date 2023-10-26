/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hritv
 */
import java.util.Scanner;
public class FibonacciCalc{
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
    public static void main(String args[]) throws Exception {
    int a;
    System.out.println("How many elements you want to print series");
    Scanner input = new Scanner(System.in);
    a=input.nextInt(); 
	System.out.print("Fibonacci Series of "+a+" numbers: ");
	for(int i = 0; i < a; i++){
			System.out.print(fibonacciRecursion(i) +" ");
		}
	}
}
