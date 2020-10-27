a = 0;
b = 1;
n = input('Enter number of term desired');
for i = 1:n-2 %term for n
    c = a + b;
    a = b;
    b = c;
end
a_n  = c; % nth term
a_n1 = a; %(n-1) term