#include<iostream>
using namespace std;
int main()
{
    double a,b;
    cout<<"Enter A and B\n";
    cin>>a>>b;

    a = a - b;

    b = a + b;

    a = b - a;

    cout<<"After Swapping\n";
    cout<<a<<"\t"<<b<<"\n";
}