import 'dart:io';

int fib(int n){
  if (n<2){
    return n;
  }
  return fib(n-2)+fib(n-1);
}

void main(){
  int n=int.parse(stdin.readLineSync(););
  print("fib($n) = ${fib(n)}");
}
