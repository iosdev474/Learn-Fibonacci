function f = fib(n)
  if (n <= 1)
    f = n;
  else
    f = fib(n - 1) + fib(n - 2);
  endif
endfunction

for i = 1 : 16
  printf("%d, ", fib(i));
endfor
disp("...");
