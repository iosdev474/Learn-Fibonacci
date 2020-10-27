aIn = 10;
bIn = 20;
aOut_correct = 20;
bOut_correct = 10;
[aOut,bOut] = swapit(aIn,bIn);
assert(isequal(aOut, aOut_correct))
assert(isequal(bOut, bOut_correct))