function [q,r] = swapInputs(a,b)
  [q1,r1] = cart2pol(a,b);
  q1=(pi/2)-q1;
  [q,r]=pol2cart(q1,r1);
end
